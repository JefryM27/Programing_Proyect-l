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
public class UserDAO {

    public List<User> readUsers() {
        DBConnection db = new DBConnection();
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM user";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String userName = resultSet.getString("name");
                String mail = resultSet.getString("mail");
                String password = resultSet.getString("password");
                int entity_id = resultSet.getInt("entity_id");
                int rol_id = resultSet.getInt("rol_id");

                User user = new User(id, userName, mail, password, entity_id, rol_id);
                users.add(user);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return users;
    }

}
