package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jefry
 */
public class ProvinceDAO {
 //Method to create a list to read provinces
    public List<Province> readProvinces() {
      //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list 
        List<Province> provinces = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM province";

        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String provinceName = resultSet.getString("name");

                Province province = new Province(id, provinceName);
                provinces.add(province);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return provinces;
    }
//Method to get the ProvinceId and show the name 
    public int getIDProvince(String name) {
        int value = 0;
        //Establishes the connection to the databases 
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM province WHERE name = ?";
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
//Method to string the Entity name according to id
    public String getNameProvince(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM province WHERE id = ?";
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
