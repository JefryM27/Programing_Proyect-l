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
public class SamplingSiteDAO {

    public List<SamplingSite> readSamplingSites() {
        DBConnection db = new DBConnection();
        List<SamplingSite> samplingSites = new ArrayList<>();
        String sql = "SELECT * FROM sampling_site";

        try {
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

}
