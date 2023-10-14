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

    public List<District> readDistrictsByCanton(String cantonName) {
        DBConnection db = new DBConnection();
        List<District> districts = new ArrayList<>();
        String sql = "SELECT * FROM district WHERE canton_id = (SELECT id FROM canton WHERE name = ?)";

        try {
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
}
