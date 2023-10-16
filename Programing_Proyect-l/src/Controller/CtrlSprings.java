package Controller;

import Model.*;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Bravo
 */
public class CtrlSprings {

    WaterSpringsDAO dao = new WaterSpringsDAO();
    ProvinceDAO province = new ProvinceDAO();
    CantonDAO canton = new CantonDAO();
    DistrictDAO district = new DistrictDAO();
    EntityDAO entity = new EntityDAO();
    int id;
    int idProvince;
    int idCanton;
    int idDistrict;
    int idEntity;

    public void loadDataSprings(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<WaterSprings> springs = dao.readWaterSprings();
        for (WaterSprings water : springs) {
            Object[] row = {water.getId(), water.getSpringName(), water.getAddress(), water.getLatitute(), water.getLenght(),
                water.getDescription(), this.province.getNameProvince(water.getProvinceId()), this.canton.getNameCanton(water.getCantonId()), this.district.getNameDistrict(water.getDistrictId()), this.entity.getNameEntity(water.getEntityId())};
            model.addRow(row);
        }
    }

    public void addWaterSpring(JTextField name, JTextField address, JTextField latitude, JTextField length, JTextField description) {
        try {
            this.dao.create(new WaterSprings(name.getText(), address.getText(), latitude.getText(), length.getText(), description.getText(), this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la naciente, error: " + e.toString());
        }
    }
    public void updateWaterSprings(JTextField name, JTextField address, JTextField latitude, JTextField length, JTextField description){
        this.dao.update(new WaterSprings(name.getText(), address.getText(), latitude.getText(), length.getText(), description.getText(), this.idProvince, this.idCanton, this.idDistrict, this.idEntity));
    }

    public void selectedRow(JTable table, JTextField name, JTextField address, JTextField latitude, JTextField length, JTextField description, JComboBox province, JComboBox canton, JComboBox district, JComboBox entity) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                name.setText((table.getValueAt(row, 1).toString()));
                address.setText((table.getValueAt(row, 2).toString()));
                latitude.setText((table.getValueAt(row, 3).toString()));
                length.setText((table.getValueAt(row, 4).toString()));
                description.setText((table.getValueAt(row, 5).toString()));
                province.setSelectedItem((table.getValueAt(row, 6).toString()));
                canton.setSelectedItem((table.getValueAt(row, 7).toString()));
                district.setSelectedItem((table.getValueAt(row, 8).toString()));
                entity.setSelectedItem((table.getValueAt(row, 9).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    public void deleteWaterSprings() {
        this.dao.delete(this.id);
    }
    public void clearFields(JTextField name, JTextField address, JTextField latitude, JTextField length, JTextField description){
        name.setText("");
        address.setText("");
        latitude.setText("");
        length.setText("");
        description.setText("");
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
