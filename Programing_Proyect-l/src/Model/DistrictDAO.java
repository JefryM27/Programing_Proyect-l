package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author allys
 */
public class DistrictDAO {
//Method to create a list to read the Districts according to the Canton id
    public List<District> readDistrictsByCanton(String cantonName) {
        //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list 
        List<District> districts = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM district WHERE canton_id = (SELECT id FROM canton WHERE name = ?)";

        try {
            //Prepare the declaration 
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, cantonName);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String districtName = resultSet.getString("name");
                int cantonId = resultSet.getInt("canton_id");

                District district = new District(id, districtName, cantonId);
                districts.add(district);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return districts;
    }
//Method to get the DistrictId and show the name  
    public int getIdDistrict(String name) {
        int value = 0;
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM district WHERE name = ?";
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
  //Method to string the District name according to id  
    public String getNameDistrict(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM district WHERE id = ?";
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
