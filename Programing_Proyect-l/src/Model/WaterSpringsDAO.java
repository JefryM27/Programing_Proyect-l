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
public class WaterSpringsDAO {

    public List<WaterSprings> readWaterSprings() {
        DBConnection db = new DBConnection();
        List<WaterSprings> waterSpringsList = new ArrayList<>();
        String sql = "SELECT * FROM water_springs";

        try {
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
}
