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
public class RolDAO {
//Method to create a list to read rols
    public List<Rol> readRols() {
        //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list
        List<Rol> rols = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM rol";

        try {
            //Prepare the declaration
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String rolName = resultSet.getString("name");

                Rol rol = new Rol(id, rolName);
                rols.add(rol);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return rols;
    }
    //Method to get the RolId and show the name 
    public int getIDRol(String name) {
        int value = 0;
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM rol WHERE name = ?";
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
  //Method to string the Rol name according to id  
    public String getNameRol(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM rol WHERE id = ?";
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
