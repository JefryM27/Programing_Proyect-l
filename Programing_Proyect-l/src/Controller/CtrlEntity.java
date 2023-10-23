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
    //Method to load the Entity into the combobox
    public void loadEntity(JComboBox c) {
        List<Entity> entities = this.entity.readEntities();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Entity entity : entities) {
            model.addElement(entity.getEntityName());
        }
        c.setModel(model);
    }
   //Method to load entity data into table
    public void loadDataEntity(JTable table) {
    //Creates a new table model
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
    //Method to add new entities
    public void addEntity(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
       //Get the legal id and validate if is equals to nine
        if (legalId.getText().length() == 11) {
            //Get the legal id and verify if the entity is already 
            if (Validation.verificateLegalIdExisting(legalId.getText())) {
                JOptionPane.showMessageDialog(null, "La entidad que desea registrar ya existe en la base de datos.");
            } else {
                try {
                    if (!Validation.validateNumbers(telephone.getText()) || !Validation.validateLyrics(entityName.getText()) || !Validation.validateLyrics(description.getText())) {
                        JOptionPane.showMessageDialog(null, "Posible error de formato, por favor digite el formato correspondiente a su espacio.");
                    } else {
                        this.entity.create(new Entity(legalId.getText(), Integer.parseInt(telephone.getText()), entityName.getText(), email.getText(), address.getText(), description.getText()));
                        clearFields(legalId, telephone, entityName, email, address, description);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar la entidad, error: " + e.toString());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La longitud de la cédula juridica no es valido, esta debe tener 11 digitos.");
        }
    }
  //Method to update the entities from the table 
    public void updateEntity(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        //Get the legal id and validate if is equals to nine
        if (legalId.getText().length() == 9) {
            //Get the legal id and verify if the entity is already 
            if (Validation.verificateLegalIdExisting(legalId.getText())) {
                JOptionPane.showMessageDialog(null, "La entidad que desea registrar ya existe en la base de datos.");
            } else {
                try {
                    if (!Validation.validateNumbers(telephone.getText()) || !Validation.validateLyrics(entityName.getText()) || !Validation.validateLyrics(address.getText())
                            || !Validation.validateLyrics(description.getText())) {
                        JOptionPane.showMessageDialog(null, "Posible error de formato, por favor digite el formato correspondiente a su espacio.");
                    } else {
                        this.entity.update(new Entity(this.id, legalId.getText(), Integer.parseInt(telephone.getText()), entityName.getText(), email.getText(), address.getText(), description.getText()));
                        clearFields(legalId, telephone, entityName, email, address, description);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la entidad, error: " + e.toString());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La longitud de la cédula juridica no es valido, esta debe tener 11 digitos.");
        }
    }
//Method to select and access a table row 
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
 //Method to remove an entity from the table
    public void deleteEntity() {
        this.entity.delete(this.id);
    }
 //Method to clean the table fields 
    public void clearFields(JTextField legalId, JTextField telephone, JTextField entityName, JTextField email, JTextField address, JTextField description) {
        legalId.setText("");
        telephone.setText("");
        entityName.setText("");
        email.setText("");
        address.setText("");
        description.setText("");
    }
}
