package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author allys
 */

public class FlowMeasurementDAO {
    
    
    public void create(FlowMeasurement measurement) {
        DBConnection db = new DBConnection();
        String consultaSQL = "INSERT INTO flow_measurement (capacity, metod, observation, date, weather, done, springs_id, sampling_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setDouble(1, measurement.getCapacity());
            ps.setString(2, measurement.getMetod());
            ps.setString(3, measurement.getObservation());
            ps.setDate(4, new java.sql.Date(measurement.getDate().getTime()));
            ps.setString(5, measurement.getWeather());
            ps.setString(6, measurement.getDone());
            ps.setInt(7, measurement.getSpringsId());
            ps.setInt(8, measurement.getSamplingId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La medicion del caudal se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la medicion del caudal, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public List<FlowMeasurement> readFlowMeasurements() {
        DBConnection db = new DBConnection();
        List<FlowMeasurement> measurements = new ArrayList<>();
        String sql = "SELECT * FROM flow_measurement";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                double capacity = resultSet.getDouble("capacity");
                String method = resultSet.getString("metod");
                String observation = resultSet.getString("observation");
                Date date = resultSet.getDate("date");
                String weather = resultSet.getString("weather");
                String done = resultSet.getString("done");
                int springsId = resultSet.getInt("springs_id");
                int samplingId = resultSet.getInt("sampling_id");
                FlowMeasurement measurement = new FlowMeasurement(id, springsId, samplingId, capacity, method, observation, weather, done, date);
                measurements.add(measurement);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return measurements;
    }
    
    public void update(FlowMeasurement flowmeasurement){
        DBConnection db= new DBConnection();
        String consultaSQL= "UPDATE flow_measurement SET capacity=?, metod=?, observation=?,date=?,weather=?,done=?,springs_id=?,sampling_id=? WHERE id=?";
        try{
             PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
             ps.setDouble(1, flowmeasurement.getCapacity());
             ps.setString(2, flowmeasurement.getMetod());
             ps.setString(3, flowmeasurement.getObservation());
             ps.setDate(4, new java.sql.Date(flowmeasurement.getDate().getTime()));
             ps.setString(5, flowmeasurement.getWeather());
             ps.setInt(6, flowmeasurement.getSpringsId());
             ps.setInt(8, flowmeasurement.getSamplingId());
             ps.execute();
             JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        }finally{
            db.disconnect();
        }
    }
    
    public void delete(int id) {

        DBConnection db = new DBConnection();

        String consultaSQL = "DELETE FROM flow_measurement WHERE id=?";

        try {
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la medicion del caudal");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }finally {
            db.disconnect();
        } 
    }
}
