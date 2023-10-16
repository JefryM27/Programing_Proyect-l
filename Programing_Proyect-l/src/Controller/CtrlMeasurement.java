package Controller;

import Model.FlowMeasurement;
import Model.FlowMeasurementDAO;
import Model.SamplingSiteDAO;
import Model.WaterSpringsDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @author jefry
 */
public class CtrlMeasurement {

    FlowMeasurementDAO dao = new FlowMeasurementDAO();
    int id;
    WaterSpringsDAO springDAO = new WaterSpringsDAO();
    SamplingSiteDAO samplingDAO = new SamplingSiteDAO();
    int idSprings;
    int idSampling;

    public void loadDataMeasurements(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<FlowMeasurement> measurement = dao.readFlowMeasurements();
        for (FlowMeasurement flow : measurement) {
            Object[] row = {flow.getId(), flow.getCapacity(), flow.getMetod(), flow.getObservation(), flow.getDate(), flow.getWeather(),
                flow.getDone(), this.springDAO.getNameWater(flow.getSpringsId()), this.samplingDAO.getNameSampling(flow.getSamplingId())};
            model.addRow(row);
        }
    }

    public void addFlowMeasurement(JTextField capacity, JTextField metod, JTextField observation, JTextField date, JComboBox<String> weather, JComboBox<String> done) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateF = dateFormat.parse(date.getText());
            this.dao.create(new FlowMeasurement(Double.parseDouble(capacity.getText()), metod.getText(), observation.getText(), (String) weather.getSelectedItem(), (String) done.getSelectedItem(), dateF, this.idSprings, this.idSampling));
            JOptionPane.showMessageDialog(null, "La medición de caudal se ha guardado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la medición de caudal, error: " + e.toString());
        }
    }

    public void selectedRow(JTable table, JTextField capacity, JTextField metod, JTextField observation, JTextField date,
            JComboBox<String> weather, JComboBox<String> done, JComboBox springs, JComboBox sampling) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                capacity.setText(table.getValueAt(row, 1).toString());
                metod.setText(table.getValueAt(row, 2).toString());
                observation.setText(table.getValueAt(row, 3).toString());
                date.setText(table.getValueAt(row, 4).toString());
                weather.setSelectedItem(table.getValueAt(row, 5).toString());
                done.setSelectedItem(table.getValueAt(row, 6).toString());
                springs.setSelectedItem(table.getValueAt(row, 7).toString());
                sampling.setSelectedItem(table.getValueAt(row, 8).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    public void deleteFlowMeasurement() {
        this.dao.delete(this.id);
    }

    public void getIDSprings(JComboBox springs) {
        this.idSprings = this.springDAO.getIDWaterSprings(springs.getSelectedItem().toString());
    }

    public void getIdSampling(JComboBox sampling) {
        this.idSampling = this.samplingDAO.getIDSampling(sampling.getSelectedItem().toString());
    }
}
