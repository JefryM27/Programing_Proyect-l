package Controller;

import Model.*;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Bravo
 */
public class CtrlSprings {

    WaterSpringsDAO dao = new WaterSpringsDAO();
    int id;

    public void loadDataSprings(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<WaterSprings> springs = dao.readWaterSprings();
        for (WaterSprings water : springs) {
            Object[] row = {water.getId(), water.getSpringName(), water.getAddress(), water.getLatitute(), water.getLenght(),
                water.getDescription(), water.getProvinceId(), water.getCantonId(), water.getDistrictId(), water.getEntityId()};
            model.addRow(row);
        }
    }

    public void deleteWaterSprings() {
        this.dao.delete(this.id);
    }
}
