package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bravo
 */
public class SamplingSiteDAO {
//Method to create a Sampling Site
    public void create(SamplingSite sampling) {
       //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "INSERT INTO sampling_site (name, province_id, canton_id, district_id, entity_id) VALUES (?, ?, ?, ?, ?)";
        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, sampling.getSamplingName());
            ps.setInt(2, sampling.getProvince_id());
            ps.setInt(3, sampling.getCanton_id());
            ps.setInt(4, sampling.getDistrict_id());
            ps.setInt(5, sampling.getEntity_id());
            ps.execute();
            JOptionPane.showMessageDialog(null, "El sitio de muestro se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar la medicion del caudal, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }
  //Method to create a list to read SamplingSites
    public List<SamplingSite> readSamplingSites() {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list 
        List<SamplingSite> samplingSites = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM sampling_site";

        try {
            //Preapare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String samplingName = resultSet.getString("name");
                int province_id = resultSet.getInt("province_id");
                int canton_id = resultSet.getInt("canton_id");
                int district_id = resultSet.getInt("district_id");
                int entity_id = resultSet.getInt("entity_id");

                SamplingSite site = new SamplingSite(id, samplingName, province_id, canton_id, district_id, entity_id);
                samplingSites.add(site);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return samplingSites;
    }
//Method to create a list to read SamplingSites by entities
    public List<SamplingSite> readSamplingSitesByEntity(int entityID) {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list
        List<SamplingSite> samplingSites = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM sampling_site WHERE entity_id = ?";

        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, entityID); // Establecer el ID de entidad
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String samplingName = resultSet.getString("name");
                int province_id = resultSet.getInt("province_id");
                int canton_id = resultSet.getInt("canton_id");
                int district_id = resultSet.getInt("district_id");
                int entity_id = resultSet.getInt("entity_id");

                SamplingSite site = new SamplingSite(id, samplingName, province_id, canton_id, district_id, entity_id);
                samplingSites.add(site);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return samplingSites;
    }
//Method to update SamplingSite in databases
    public void update(SamplingSite sampling) {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "UPDATE sampling_site SET name=?, province_id=?, canton_id=?,district_id=?,entity_id=? WHERE id=?";
        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, sampling.getSamplingName());
            ps.setInt(2, sampling.getProvince_id());
            ps.setInt(3, sampling.getCanton_id());
            ps.setInt(4, sampling.getDistrict_id());
            ps.setInt(5, sampling.getEntity_id());
            ps.setInt(6, sampling.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        } finally {
            db.disconnect();
        }
    }
  //Method to delete the SamplingSite of databases
    public void delete(int id) {
       //Establishes the connection to the databases
        DBConnection db = new DBConnection();
      //Set the query with sql
        String consultaSQL = "DELETE FROM sampling_site WHERE id=?";

        try {
            //Prepare the declaration
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el sitio de muestreo");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }
//Method to get the SamplingId and show the name 
    public int getIDSampling(String name) {
        int value = 0;
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM sampling_site WHERE name = ?";
        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                value = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return value;
    }
 //Method to string the Sampling name according to id 
    public String getNameSampling(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM sampling_site WHERE id = ?";
        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                value = resultSet.getString("name");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }
        return value;
    }
}
