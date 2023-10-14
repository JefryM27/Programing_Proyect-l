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
public class CantonDAO extends GeneralDAO {

    /*
    public CantonDAO() {
        super.getName(1, "canton");
    }
     */
    public List<Canton> readCantons() {
        DBConnection db = new DBConnection();
        List<Canton> cantons = new ArrayList<>();
        String sql = "SELECT * FROM canton";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
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
}

