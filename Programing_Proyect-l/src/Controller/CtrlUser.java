package Controller;

import Model.EntityDAO;
import Model.RolDAO;
import Model.User;
import Model.UserDAO;
import View.Register;
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
    User authenticatedUser = null;

    public void loginUser(String enteredMail, String enteredPassword) {
        List<User> userList = dao.readUsers();
        boolean isAuthenticated = false;
        for (User user : userList) {
            if (user.getMail().equals(enteredMail) && user.getPassword().equals(enteredPassword)) {
                authenticatedUser = user;
                isAuthenticated = true;
                break;
            }
        }
        if (isAuthenticated) {
            openFrame();
        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openFrame() {
        int rolId = authenticatedUser.getRol_id();
        if (rolId == 2) {
            openAdminFrame();
        } else if (rolId == 3) {
            openDigitadorFrame();
        } else {
            openSuperAdminFrame();
        }
    }

    private void openSuperAdminFrame() {
        Register regis = new Register();
        regis.setVisible(true);
    }

    private void openAdminFrame() {
        Register regis = new Register();
        regis.setVisible(true);
    }

    private void openDigitadorFrame() {
        Register regis = new Register();
        regis.setVisible(true);
        regis.cbxEntitySprings.setVisible(false);
    }

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

    public void addUser(JTextField userName, JTextField mail, JPasswordField password, JComboBox entity, JComboBox rol) {
        try {
            this.dao.create(new User(userName.getText(), mail.getText(), new String(password.getPassword()), this.idEntity, this.idRol)); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el usuario, error: " + e.toString());
        }
    }
    public void updateUser(JTextField userName, JTextField mail, JPasswordField password, JComboBox entity, JComboBox rol){
        this.dao.update(new User(userName.getText(), mail.getText(), new String(password.getPassword()), this.idEntity, this.idRol));
    }

    public void selectedRow(JTable table, JTextField userName, JTextField mail, JPasswordField password, JComboBox entity, JComboBox rol) {
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

    public void deleteUser() {
        this.dao.delete(this.id);
    }
    public void clearFields(JTextField userName, JTextField mail, JPasswordField password){
        userName.setText("");
        mail.setText("");
        password.setText("");
    }

    public void getIdEntity(JComboBox entity) {
        this.idEntity = this.entity.getIDEntity(entity.getSelectedItem().toString());
    }

    public void getIdDistrict(JComboBox rol) {
        this.idRol = this.rol.getIDRol(rol.getSelectedItem().toString());
    }
}
