package Controller;

import Model.FlowMeasurement;
import Model.FlowMeasurementDAO;
import Model.SamplingSiteDAO;
import Model.WaterSprings;
import Model.WaterSpringsDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
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

    //Method to load measurement data into the table for super admin
    public void loadDataMeasurements(JTable table) {
    //Creates a new table model
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

    //Method to load measurement data into the table for admin 
    public void loadDataMeasurementsForADM(JTable table, int entityId) {
        //Creates a new table model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<FlowMeasurement> measurement = dao.readFlowMeasurements();
        for (FlowMeasurement flow : measurement) {
            // Checks if the nascent to which this measurement belongs belongs to the entity of the logged in user
            WaterSprings spring = springDAO.getWaterSprings(flow.getSpringsId());
            if (spring != null && spring.getEntityId() == entityId) {
                Object[] row = {flow.getId(), flow.getCapacity(), flow.getMetod(), flow.getObservation(), flow.getDate(), flow.getWeather(), flow.getDone(),
                    this.springDAO.getNameWater(flow.getSpringsId()), this.samplingDAO.getNameSampling(flow.getSamplingId())
                };
                model.addRow(row);
            }
        }
    }
  //Method to add new flow measurement from the table 
    public void addFlowMeasurement(JComboBox<String> metod, JTextField observation, JComboBox<String> weather, JTextField done) {
        if (!Validation.validateLyrics(observation.getText()) || !Validation.validateLyrics(done.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre y descripcion de la naciente, solo se permiten letras.");
        } else {
            try {
                double randomCapacity = randomCapacity();
                Date randomDate = randomDate();
                this.dao.create(new FlowMeasurement(randomCapacity, (String) metod.getSelectedItem(), observation.getText(), (String) weather.getSelectedItem(), done.getText(), randomDate, this.idSprings, this.idSampling));
                clearFields(observation, done);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la medición de caudal, error: " + e.toString());
            }
        }
    }
   //Method to update the flow measuremnet from the table 
    public void updateFlowMeasurement(JTable table, JComboBox<String> metod, JTextField observation, JComboBox<String> weather, JTextField done) {
        if (!Validation.validateLyrics(observation.getText()) || !Validation.validateLyrics(done.getText())) {
            JOptionPane.showMessageDialog(null, "Error en el nombre y descripcion de la naciente, solo se permiten letras.");
        } else {
            try {
                int row = table.getSelectedRow();
                if (row >= 0) {
                    double selectedCapacity = Double.parseDouble(table.getValueAt(row, 1).toString());
                    Date selectedDate = (Date) table.getValueAt(row, 4);
                    this.dao.update(new FlowMeasurement(this.id, this.idSprings, this.idSampling, selectedCapacity, (String) metod.getSelectedItem(), observation.getText(), (String) weather.getSelectedItem(), done.getText(), selectedDate));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la medición de caudal, error: " + e.toString());
            }
        }
    }
//Method to select and access a table row 
    public void selectedRow(JTable table, JComboBox<String> metod, JTextField observation,
            JComboBox<String> weather, JTextField done, JComboBox springs, JComboBox sampling) {
        try {
            int row = table.getSelectedRow();
            if (row >= 0) {
                this.id = Integer.parseInt(table.getValueAt(row, 0).toString());
                metod.setSelectedItem(table.getValueAt(row, 2).toString());
                observation.setText(table.getValueAt(row, 3).toString());
                weather.setSelectedItem(table.getValueAt(row, 5).toString());
                done.setText(table.getValueAt(row, 6).toString());
                springs.setSelectedItem(table.getValueAt(row, 7).toString());
                sampling.setSelectedItem(table.getValueAt(row, 8).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }
//Method to generated a date 
    public Date randomDate() {
        // Generate a random date between January 1 and December 31, 2022
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        long startMillis = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        long endMillis = calendar.getTimeInMillis();
        long randomMillis = startMillis + (long) (Math.random() * (endMillis - startMillis));
        return new Date(randomMillis);
    }
//Method to generated the flowmeasurement capacity 
    public double randomCapacity() {
        // Generate a random decimal number in the range 0.1 to 100
        double randomCapacity = 0.1 + (100 - 0.1) * new Random().nextDouble();
        return Math.round(randomCapacity * 100.0) / 100.0;
    }
 //Method to remove an meaurement from the table
    public void deleteFlowMeasurement() {
        this.dao.delete(this.id);
    }
 //Method to clean the table fields 
    public void clearFields(JTextField observation, JTextField done) {
        observation.setText("");
        done.setText("");
    }
 //Method to get the id springs and load in the combobox 
    public void getIDSprings(JComboBox springs) {
        this.idSprings = this.springDAO.getIDWaterSprings(springs.getSelectedItem().toString());
    }
 //Method to get the id sampling and load in the combobox 
    public void getIdSampling(JComboBox sampling) {
        this.idSampling = this.samplingDAO.getIDSampling(sampling.getSelectedItem().toString());
    }
}
