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

    public List<Canton> readCantonsByProvince(String provinceName) {
        DBConnection db = new DBConnection();
        List<Canton> cantons = new ArrayList<>();
        String sql = "SELECT * FROM canton WHERE province_id = (SELECT id FROM province WHERE name = ?)";

        try {
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

    public int getIDCanton(String name) {
        int value = 0;
        DBConnection db = new DBConnection();
        String sql = "SELECT id FROM canton WHERE name = ?";
        try {
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
    
    public String getNameCanton(int id) {
        String value = "";
        DBConnection db = new DBConnection();
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
