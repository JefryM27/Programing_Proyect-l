
package Controller;

import Model.FlowMeasurement;
import Model.FlowMeasurementDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jefry
 */
public class CtrlMeasurement {
    FlowMeasurementDAO dao = new FlowMeasurementDAO();
    int id;

    public void loadDataMeasurements(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<FlowMeasurement> measurement = dao.readFlowMeasurements();
        for (FlowMeasurement flow : measurement) {
            Object[] row = {flow.getId(), flow.getCapacity(), flow.getMetod(), flow.getObservation(), flow.getDate(), flow.getWeather(),
            flow.getDone(), flow.getSpringsId(), flow.getSamplingId()};
            model.addRow(row);
        }
    }
    
    public void deleteFlowMeasurement(){
        this.dao.delete(this.id);
    }
}
