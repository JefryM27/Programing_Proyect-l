package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bravo
 */
public class UserDAO {

    public void create(User user) {

        DBConnection db = new DBConnection();
        String consultaSQL = "INSERT INTO user (name, mail, password, entity_id, rol_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getMail());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getEntity_id());
            ps.setInt(5, user.getRol_id());
            ps.execute();
            JOptionPane.showMessageDialog(null, "El usuario se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la naciente, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

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

    public void update(User user) {
        DBConnection db = new DBConnection();
        String consultaSQL = "UPDATE user SET name=?, mail=?, password=?,entity_id=?,rol_id=? WHERE id=?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getMail());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getEntity_id());
            ps.setInt(5, user.getRol_id());
            ps.setInt(6, user.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public void delete(int id) {

        DBConnection db = new DBConnection();

        String consultaSQL = "DELETE FROM user WHERE id=?";

        try {
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el usuario");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        } finally {
            db.disconnect();
        }

    }

}
