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
    
    //Method to create a Flow measurement
    public void create(FlowMeasurement measurement) {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query 
        String consultaSQL = "INSERT INTO flow_measurement (capacity, metod, observation, date, weather, done, springs_id, sampling_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            //Prepare the declaration
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
  //Method to create a list to read flow measurements
    public List<FlowMeasurement> readFlowMeasurements() {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list
        List<FlowMeasurement> measurements = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM flow_measurement";

        try {
            //Prepare the declaration
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
  //Method to update flow measurement in databases
    public void update(FlowMeasurement flowmeasurement){
        //Establishes the connection to the databases
        DBConnection db= new DBConnection();
        //Set the query with sql
        String consultaSQL= "UPDATE flow_measurement SET capacity=?, metod=?, observation=?,date=?,weather=?,done=?,springs_id=?,sampling_id=? WHERE id=?";
        try{
         
             PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
             ps.setDouble(1, flowmeasurement.getCapacity());
             ps.setString(2, flowmeasurement.getMetod());
             ps.setString(3, flowmeasurement.getObservation());
             ps.setDate(4, new java.sql.Date(flowmeasurement.getDate().getTime()));
             ps.setString(5, flowmeasurement.getWeather());
             ps.setString(6, flowmeasurement.getDone());
             ps.setInt(7, flowmeasurement.getSpringsId());
             ps.setInt(8, flowmeasurement.getSamplingId());
             ps.setInt(9, flowmeasurement.getId());
             ps.execute();
             JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        }finally{
            db.disconnect();
        }
    }
     //Method to delete the Flow measurement of databases
    public void delete(int id) {
       //Establishes the connection to the databases
        DBConnection db = new DBConnection();
      //Set the query with sql
        String consultaSQL = "DELETE FROM flow_measurement WHERE id=?";

        try {
            //Prepare the declaration
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
