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
//Method to create a User
    public void create(User user) {
       //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "INSERT INTO user (name, mail, password, entity_id, rol_id) VALUES (?, ?, ?, ?, ?)";
        try {
            //Prepare the declaration
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
  //Method to create a list to read users
    public List<User> readUsers() {
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list
        List<User> users = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM user";

        try {
            //Prepare the declaration
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
//Method to update user in databases
    public void update(User user) {
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "UPDATE user SET name=?, mail=?, password=?,entity_id=?,rol_id=? WHERE id=?";
        try {
            //Prepare the declaration
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
 //Method to delete the user of databases
    public void delete(int id) {
      //Establishes the connection to the databases
        DBConnection db = new DBConnection();
      //Set the query with sql
        String consultaSQL = "DELETE FROM user WHERE id=?";

        try {
            //Prepare the declaration
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
