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
public class EntityDAO extends GeneralDAO {
/*
    public EntityDAO() {
        super.getName(1, "entity");
    }
*/
    
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
        }finally {
            db.disconnect();
        }
    }
}
