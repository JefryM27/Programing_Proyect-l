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

    public List<Rol> readRols() {
        DBConnection db = new DBConnection();
        List<Rol> rols = new ArrayList<>();
        String sql = "SELECT * FROM rol";

        try {
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
}
