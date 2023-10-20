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

    public void loadSampling(JComboBox c) {
        List<SamplingSite> dao = this.dao.readSamplingSites();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (SamplingSite site : dao) {
            model.addElement(site.getSamplingName());
        }
        c.setModel(model);
    }

    public void loadSamplingByEntity(JComboBox c, int currentEntityId) {
        List<SamplingSite> dao = this.dao.readSamplingSitesByEntity(currentEntityId);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (SamplingSite site : dao) {
            model.addElement(site.getSamplingName());
        }
        c.setModel(model);
    }

    public void loadDataSamplingSites(JTable table) {

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

    public void loadDataSamplingSitesByEntity(JTable table, int entityId) {
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

    public void addSamplingSite(JTextField name, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        try {
            this.dao.create(new SamplingSite(name.getText(), this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
            clearFields(name);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el sitio de muestreo, error: " + e.toString());
        }
    }

    public void updateSamplingSite(JTextField name, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        this.dao.update(new SamplingSite(this.id, name.getText(), this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
    }

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

    public void deleteSamplingSite() {
        this.dao.delete(this.id);
    }

    public void clearFields(JTextField name) {
        name.setText("");
    }

    public void getIDProvince(JComboBox province) {
        this.idProvince = this.province.getIDProvince(province.getSelectedItem().toString());
    }

    public void getIDCanton(JComboBox canton) {
        this.idCanton = this.canton.getIDCanton(canton.getSelectedItem().toString());
    }

    public void getIdDistrict(JComboBox district) {
        this.idDistrict = this.district.getIdDistrict(district.getSelectedItem().toString());
    }

    public void getIdEntity(JComboBox entity) {
        this.idEntity = this.entity.getIDEntity(entity.getSelectedItem().toString());
    }
}
