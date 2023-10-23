package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class WaterSpringsDAO {
//Method to create a Water springs
    public void create(WaterSprings springs) {
      //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "INSERT INTO water_springs (name, address, latitute, length, description, province_id, canton_id, district_id, entity_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, springs.getSpringName());
            ps.setString(2, springs.getAddress());
            ps.setString(3, springs.getLatitute());
            ps.setString(4, springs.getLenght());
            ps.setString(5, springs.getDescription());
            ps.setInt(6, springs.getProvinceId());
            ps.setInt(7, springs.getCantonId());
            ps.setInt(8, springs.getDistrictId());
            ps.setInt(9, springs.getEntityId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La naciente se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la naciente, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }
//Method to create a list to read water springs
    public List<WaterSprings> readWaterSprings() {
         //establishes the connection to the databases
        DBConnection db = new DBConnection();
          //Create a new list 
        List<WaterSprings> waterSpringsList = new ArrayList<>();
         //Set the query with sql
        String sql = "SELECT * FROM water_springs";

        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String springName = resultSet.getString("name");
                String address = resultSet.getString("address");
                String latitute = resultSet.getString("latitute");
                String length = resultSet.getString("length");
                String description = resultSet.getString("description");
                int provinceId = resultSet.getInt("province_id");
                int cantonId = resultSet.getInt("canton_id");
                int districtId = resultSet.getInt("district_id");
                int entityId = resultSet.getInt("entity_id");

                WaterSprings waterSprings = new WaterSprings(id, springName, address, latitute, length, description, provinceId, cantonId, districtId, entityId);
                waterSpringsList.add(waterSprings);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return waterSpringsList;
    }
//Method to create a list to read WaterSprings by entity
    public List<WaterSprings> readWaterSpringsByEntity(int entityID) {
        //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list
        List<WaterSprings> waterSpringsList = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM water_springs WHERE entity_id = ?";

        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, entityID); // Establecer el ID de entidad
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String springName = resultSet.getString("name");
                String address = resultSet.getString("address");
                String latitute = resultSet.getString("latitute");
                String length = resultSet.getString("length");
                String description = resultSet.getString("description");
                int provinceId = resultSet.getInt("province_id");
                int cantonId = resultSet.getInt("canton_id");
                int districtId = resultSet.getInt("district_id");
                int entityId = resultSet.getInt("entity_id");

                WaterSprings waterSprings = new WaterSprings(id, springName, address, latitute, length, description, provinceId, cantonId, districtId, entityId);
                waterSpringsList.add(waterSprings);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return waterSpringsList;
    }
//Method to get the WaterSprings 
    public WaterSprings getWaterSprings(int id) {
        WaterSprings waterSprings = null;
        //establishes the connection to the database
        DBConnection db = new DBConnection();
         //Set the query with sql
        String sql = "SELECT * FROM water_springs WHERE id = ?";

        try 
          
            (PreparedStatement ps = db.getConnection().prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                waterSprings = new WaterSprings(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("address"),
                        resultSet.getString("latitute"),
                        resultSet.getString("length"),
                        resultSet.getString("description"),
                        resultSet.getInt("province_id"),
                        resultSet.getInt("canton_id"),
                        resultSet.getInt("district_id"),
                        resultSet.getInt("entity_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }

        return waterSprings;
    }
//Method to update WaterSprings in databases
    public void update(WaterSprings springs) {
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "UPDATE water_springs SET name=?, address=?, latitute=?,length=?,description=?,province_id=?,canton_id=?,district_id=?,entity_id=? WHERE id=?";
        try {
             //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, springs.getSpringName());
            ps.setString(2, springs.getAddress());
            ps.setString(3, springs.getLatitute());
            ps.setString(4, springs.getLenght());
            ps.setString(5, springs.getDescription());
            ps.setInt(6, springs.getProvinceId());
            ps.setInt(7, springs.getCantonId());
            ps.setInt(8, springs.getDistrictId());
            ps.setInt(9, springs.getEntityId());
            ps.setInt(10, springs.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        } finally {
            db.disconnect();
        }
    }
//Method to delete the WaterSprings of databases
    public void delete(int id) {
      //Establishes the connection to the databases
        DBConnection db = new DBConnection();
       //Set the query with sql
        String consultaSQL = "DELETE FROM water_springs WHERE id=?";

        try {
            //Prepare the declaration
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la neciente");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        } finally {
            db.disconnect();
        }

    }
//Method to get the WaterSpringsId and show the name  
    public int getIDWaterSprings(String name) {
        int value = 0;
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM water_springs WHERE name = ?";
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
 //Method to string the Water Spring name according to id  
    public String getNameWater(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM water_springs WHERE id = ?";
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
