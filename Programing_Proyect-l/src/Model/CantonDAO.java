package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bravo
 */
public class CantonDAO{
//Method to create a list to read the Cantons according to the province ID
    public List<Canton> readCantonsByProvince(String provinceName) {
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //Create the new list 
        List<Canton> cantons = new ArrayList<>();
        //set the query with sql
        String sql = "SELECT * FROM canton WHERE province_id = (SELECT id FROM province WHERE name = ?)";
        
        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, provinceName);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String cantonName = resultSet.getString("name");
                int province_id = resultSet.getInt("province_id");

                Canton canton = new Canton(id, cantonName, province_id);
                cantons.add(canton);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return cantons;
    }
//Method to get the Canton and show the name  
    public int getIDCanton(String name) {
        int value = 0;
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //set the query with sql
        String sql = "SELECT id FROM canton WHERE name = ?";
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
  //Method to string the Canton name according to id 
    public String getNameCanton(int id) {
        String value = "";
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //set the query with sql
        String sql = "SELECT name FROM canton WHERE id = ?";
        try {
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
