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
public class ProvinceDAO extends GeneralDAO {

    public ProvinceDAO() {
        super.getName(1, "province");
    }

    public List<Province> readProvinces() {
        DBConnection db = new DBConnection();
        List<Province> provinces = new ArrayList<>();
        String sql = "SELECT * FROM province";

        try {
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

    public int getIDProvince(String name) {
        int value = 0;
        DBConnection db = new DBConnection();
        String sql = "SELECT id FROM province WHERE name = ?";
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
    
    public String getNameProvince(int id) {
        String value = "";
        DBConnection db = new DBConnection();
        String sql = "SELECT name FROM province WHERE id = ?";
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
