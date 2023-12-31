package Controller;

import Model.CantonDAO;
import Model.DistrictDAO;
import Model.EntityDAO;
import Model.ProvinceDAO;
import Model.SamplingSite;
import Model.SamplingSiteDAO;
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
 * @author allys
 */
public class CtrlSampling {

    SamplingSiteDAO dao = new SamplingSiteDAO();
    ProvinceDAO province = new ProvinceDAO();
    CantonDAO canton = new CantonDAO();
    DistrictDAO district = new DistrictDAO();
    EntityDAO entity = new EntityDAO();
    int id;
    int idProvince;
    int idCanton;
    int idDistrict;
    int idEntity;
    private static int entityADM;

    // SUPER ADMIN
    public void loadSampling(JComboBox c) {
        List<SamplingSite> dao = this.dao.readSamplingSites();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (SamplingSite site : dao) {
            model.addElement(site.getSamplingName());
        }
        c.setModel(model);
    }
  //Method to load saampling sites data into the table 
    public void loadDataSamplingSites(JTable table) {
       //Creates a new table model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<SamplingSite> site = dao.readSamplingSites();
        for (SamplingSite sampling : site) {
            Object[] row = {sampling.getId(), sampling.getSamplingName(), this.province.getNameProvince(sampling.getProvince_id()),
                this.canton.getNameCanton(sampling.getCanton_id()), this.district.getNameDistrict(sampling.getDistrict_id()), this.entity.getNameEntity(sampling.getEntity_id())};
            model.addRow(row);
        }
    }
  //Method to add new SamplingSite from the table 
    public void addSamplingSite(JTextField name, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        try {
            String siteName = name.getText();
            if (Validation.verificateSamplingSiteExisting(siteName)) {
                JOptionPane.showMessageDialog(null, "El sitio de muestreo que desea registrar ya existe en la base de datos.");
            } else if (!Validation.validateLyrics(siteName)) {
                JOptionPane.showMessageDialog(null, "Error de formato en el nombre del sitio de muestreo.");
            } else {
                this.dao.create(new SamplingSite(siteName, this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
                clearFields(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el sitio de muestreo, error: " + e.toString());
        }
    }
   //Method to update the SamplingSite from the table 
    public void updateSamplingSite(JTextField name, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        try {
            String siteName = name.getText();

            if (Validation.verificateSamplingSiteExisting(siteName)) {
                JOptionPane.showMessageDialog(null, "El sitio de muestreo que desea registrar ya existe en la base de datos.");
            } else if (!Validation.validateLyrics(siteName)) {
                JOptionPane.showMessageDialog(null, "Error de formato en el nombre del sitio de muestreo.");
            } else {
                this.dao.update(new SamplingSite(this.id, name.getText(), this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
                clearFields(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el sitio de muestreo, error: " + e.toString());
        }
    }
//Method to select and access a table row 
    public void selectedRow(JTable table, JTextField name, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                name.setText(table.getValueAt(row, 1).toString());
                province.setSelectedItem(table.getValueAt(row, 2).toString());
                canton.setSelectedItem(table.getValueAt(row, 3).toString());
                district.setSelectedItem(table.getValueAt(row, 4).toString());
                entity.setSelectedItem(table.getValueAt(row, 5).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

      //Method to load SamplingSite data into the combobox from admin
    public void loadSamplingForADM(JComboBox c, int currentEntityId) {
        List<SamplingSite> dao = this.dao.readSamplingSitesByEntity(currentEntityId);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (SamplingSite site : dao) {
            model.addElement(site.getSamplingName());
        }
        c.setModel(model);
    }
  //Method to load SamplingSite data into the table for admin 
    public void loadDataSamplingSitesForADM(JTable table, int entityId) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);

        List<SamplingSite> site = dao.readSamplingSites();

        for (SamplingSite sampling : site) {
            if (sampling.getEntity_id() == entityId) {
                Object[] row = {
                    sampling.getId(), sampling.getSamplingName(), this.province.getNameProvince(sampling.getProvince_id()), this.canton.getNameCanton(sampling.getCanton_id()), this.district.getNameDistrict(sampling.getDistrict_id()), this.entity.getNameEntity(sampling.getEntity_id())
                };
                model.addRow(row);
            }
        }
    }
 //Method to add new SamplingSite from the table for admin
    public void addSamplingSiteForADM(JTextField name, JComboBox province, JComboBox canton, JComboBox district) {
        try {
            String siteName = name.getText();

            if (Validation.verificateSamplingSiteExisting(siteName)) {
                JOptionPane.showMessageDialog(null, "El sitio de muestreo que desea registrar ya existe en la base de datos.");
            } else if (!Validation.validateLyrics(siteName)) {
                JOptionPane.showMessageDialog(null, "Error de formato en el nombre del sitio de muestreo.");
            } else {
                this.dao.create(new SamplingSite(siteName, this.idProvince, this.idCanton, this.idDistrict, entityADM));
                clearFields(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el sitio de muestreo, error: " + e.toString());
        }
    }
 //Method to update new SamplingSite from the table for admin
    public void updateSamplingSiteForADM(JTextField name, JComboBox province, JComboBox canton, JComboBox district) {
        try {
            String siteName = name.getText();

            if (Validation.verificateSamplingSiteExisting(siteName)) {
                JOptionPane.showMessageDialog(null, "El sitio de muestreo que desea registrar ya existe en la base de datos.");
            } else if (!Validation.validateLyrics(siteName)) {
                JOptionPane.showMessageDialog(null, "Error de formato en el nombre del sitio de muestreo.");
            } else {
                this.dao.update(new SamplingSite(this.id, name.getText(), this.idProvince, this.idCanton, this.idDistrict, entityADM));
                clearFields(name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el sitio de muestreo, error: " + e.toString());
        }
    }
 //Method to remove an samplingsite from the table
    public void deleteSamplingSite() {
        this.dao.delete(this.id);
    }
 //Method to clean the table fields 
    public void clearFields(JTextField name) {
        name.setText("");
    }
 //Method to get the id province and load in the combobox 
    public void getIDProvince(JComboBox province) {
        this.idProvince = this.province.getIDProvince(province.getSelectedItem().toString());
    }
 //Method to get the id canton and load in the combobox 
    public void getIDCanton(JComboBox canton) {
        this.idCanton = this.canton.getIDCanton(canton.getSelectedItem().toString());
    }
 //Method to get the id district and load in the combobox 
    public void getIdDistrict(JComboBox district) {
        this.idDistrict = this.district.getIdDistrict(district.getSelectedItem().toString());
    }
 //Method to get the id entity and load in the combobox 
    public void getIdEntity(JComboBox entity) {
        this.idEntity = this.entity.getIDEntity(entity.getSelectedItem().toString());
    }

    public static void setEntityADM(int id) {
        entityADM = id;
    }
}
