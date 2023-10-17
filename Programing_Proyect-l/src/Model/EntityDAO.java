package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author allys
 */
public class EntityDAO {

    public void create(Entity entity) {

        DBConnection db = new DBConnection();
        String consultaSQL = "INSERT INTO entity (legal_id, name, email, telephone, address, description) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, entity.getLegalId());
            ps.setString(2, entity.getEntityName());
            ps.setString(3, entity.getEmail());
            ps.setInt(4, entity.getTelephone());
            ps.setString(5, entity.getAddress());
            ps.setString(6, entity.getDescription());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La entidad se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la entidad, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public List<Entity> readEntities() {
        DBConnection db = new DBConnection();
        List<Entity> entities = new ArrayList<>();
        String sql = "SELECT * FROM entity";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String legalId = resultSet.getString("legal_id");
                String entityName = resultSet.getString("name");
                String email = resultSet.getString("email");
                int telephone = resultSet.getInt("telephone");
                String address = resultSet.getString("address");
                String description = resultSet.getString("description");

                Entity entity = new Entity(id, legalId, telephone, entityName, email, address, description);
                entities.add(entity);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return entities;
    }

    public void update(Entity entity) {
        DBConnection db = new DBConnection();
        String consultaSQL = "UPDATE entity SET legal_id=?, name=?, email=?,telephone=?,address=?,description=? WHERE id=?";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, entity.getLegalId());
            ps.setString(2, entity.getEntityName());
            ps.setString(3,entity.getEmail());
            ps.setInt(4, entity.getTelephone());
            ps.setString(5, entity.getAddress());
            ps.setString(6, entity.getDescription());
            ps.setInt(7, entity.getId());
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

        String consultaSQL = "DELETE FROM entity WHERE id=?";

        try {
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la entidad");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public int getIDEntity(String name) {
        int value = 0;
        DBConnection db = new DBConnection();
        String sql = "SELECT id FROM entity WHERE name = ?";
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
    
    public String getNameEntity(int id) {
        String value = "";
        DBConnection db = new DBConnection();
        String sql = "SELECT name FROM entity WHERE id = ?";
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
