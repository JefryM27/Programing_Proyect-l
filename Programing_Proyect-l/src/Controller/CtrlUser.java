package Controller;

import Model.EntityDAO;
import Model.RolDAO;
import Model.User;
import Model.UserDAO;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author allys
 */
public class CtrlUser {

    UserDAO dao = new UserDAO();
    EntityDAO entity = new EntityDAO();
    RolDAO rol = new RolDAO();
    int id;
    int idEntity;
    int idRol;
    private static int entityId;
    private static int rolId;

     //Method to load measurement data into the table for super admin
    public void loadDataUsers(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<User> users = dao.readUsers();
        for (User user : users) {
            Object[] row = {user.getId(), user.getUserName(), user.getMail(), user.getPassword(),
                this.entity.getNameEntity(user.getEntity_id()), this.rol.getNameRol(user.getRol_id())};
            model.addRow(row);
        }
    }
  //Method to add new user from the table 
    public void addUser(JTextField userName, JTextField mail, JTextField password, JComboBox entity, JComboBox rol) {
        if (!Validation.validateLyrics(userName.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre de usuario, solo se permiten letras.");
        } else {
            try {
                this.dao.create(new User(userName.getText(), mail.getText(), password.getText(), this.idEntity, this.idRol));
                clearFields(userName, mail, password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el usuario, error: " + e.toString());
            }
        }
    }

    public void updateUser(JTextField userName, JTextField mail, JTextField password, JComboBox entity, JComboBox rol) {
        if (!Validation.validateLyrics(userName.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre de usuario, solo se permiten letras.");
        } else {
            try {
                this.dao.update(new User(this.id, userName.getText(), mail.getText(), password.getText(), this.idEntity, this.idRol));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el usuario, error: " + e.toString());
            }
        }
    }

    public void selectedRow(JTable table, JTextField userName, JTextField mail, JTextField password, JComboBox entity, JComboBox rol) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                userName.setText((table.getValueAt(row, 1).toString()));
                mail.setText((table.getValueAt(row, 2).toString()));
                password.setText(table.getValueAt(row, 3).toString());
                entity.setSelectedItem(table.getValueAt(row, 4).toString());
                rol.setSelectedItem(table.getValueAt(row, 5).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    // ADMIN
    public void loadDataUsersForADM(JTable table, int entityId) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<User> users = dao.readUsers();
        for (User user : users) {
            if (user.getEntity_id() == entityId) {
                Object[] row = {user.getId(), user.getUserName(), user.getMail(), user.getPassword(), this.entity.getNameEntity(user.getEntity_id()), this.rol.getNameRol(user.getRol_id())
                };
                model.addRow(row);
            }
        }
    }

    public void addUserForADM(JTextField userName, JTextField mail, JTextField password) {
        if (!Validation.validateLyrics(userName.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre de usuario, solo se permiten letras.");
        } else {
            try {
                this.dao.create(new User(userName.getText(), mail.getText(), password.getText(), entityId, rolId));
                clearFields(userName, mail, password);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el usuario, error: " + e.toString());
            }
        }
    }

    public void updateUserForADM(JTable table, JTextField userName, JTextField mail, JTextField password) {
        if (!Validation.validateLyrics(userName.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre de usuario, solo se permiten letras.");
        } else {
            try {
                int selectedRow = table.getSelectedRow();
                int userId = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
                // verificate if user is admin
                User selectedUser = getUserById(userId);
                if (selectedUser != null && selectedUser.getRol_id() == 2) {
                    JOptionPane.showMessageDialog(null, "Los administradores no pueden ser editados", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                this.dao.update(new User(this.id, userName.getText(), mail.getText(), password.getText(), entityId, rolId));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el usuario, error: " + e.toString());
            }
        }
    }

    // DIGITIZER
    public void loadDataDigitizer(JTable table, int digitizerId) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<User> users = dao.readUsers();
        for (User user : users) {
            if (user.getId() == digitizerId) {
                Object[] row = {user.getId(), user.getUserName(), user.getMail(), user.getPassword(), this.entity.getNameEntity(user.getEntity_id()), this.rol.getNameRol(user.getRol_id())
                };
                model.addRow(row);
            }
        }
    }

    public void deleteUser() {
        this.dao.delete(this.id);
    }

    public void clearFields(JTextField userName, JTextField mail, JTextField password) {
        userName.setText("");
        mail.setText("");
        password.setText("");
    }

    public void getIdEntity(JComboBox entity) {
        this.idEntity = this.entity.getIDEntity(entity.getSelectedItem().toString());
    }

    public void getIdRol(JComboBox rol) {
        this.idRol = this.rol.getIDRol(rol.getSelectedItem().toString());
    }

    public static void setEntityId(int id) {
        entityId = id;
    }

    public static void setRolId(int id) {
        rolId = id;
    }

    public User getUserById(int userId) {
        List<User> users = dao.readUsers();
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }
}
