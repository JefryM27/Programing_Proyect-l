package Controller;

import Model.Entity;
import Model.EntityDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jefry
 */
public class CtrlEntity {

    EntityDAO entity = new EntityDAO();
    int id;

    public void loadEntity(JComboBox c) {
        List<Entity> entities = this.entity.readEntities();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Entity entity : entities) {
            model.addElement(entity.getEntityName());
        }
        c.setModel(model);
    }

    public void loadDataEntity(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<Entity> entities = entity.readEntities();
        for (Entity entity : entities) {
            Object[] row = {entity.getId(), entity.getLegalId(), entity.getEntityName(), entity.getEmail(), entity.getTelephone(), entity.getAddress(), entity.getDescription()};
            model.addRow(row);
        }
    }

    public void addEntity(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        try {
            this.entity.create(new Entity(legalId.getText(), Integer.parseInt(telephone.getText()), entityName.getText(), email.getText(), address.getText(), description.getText()));
            clearFields(legalId, telephone, entityName, email, address, description);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la entidad, error: " + e.toString());
        }
    }
    

    public void updateEntity(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        this.entity.update(new Entity(this.id, legalId.getText(), Integer.parseInt(telephone.getText()), entityName.getText(), email.getText(), address.getText(), description.getText()));
    }

    public void selectedRow(JTable table, JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                legalId.setText(table.getValueAt(row, 1).toString());
                entityName.setText(table.getValueAt(row, 2).toString());
                email.setText(table.getValueAt(row, 3).toString());
                telephone.setText(table.getValueAt(row, 4).toString());
                address.setText(table.getValueAt(row, 5).toString());
                description.setText(table.getValueAt(row, 6).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    public void deleteEntity() {
        this.entity.delete(this.id);
    }

    public void clearFields(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        legalId.setText("");
        telephone.setText("");
        entityName.setText("");
        email.setText("");
        address.setText("");
        description.setText("");
    }
}
