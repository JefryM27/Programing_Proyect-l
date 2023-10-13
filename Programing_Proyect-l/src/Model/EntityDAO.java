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
public class EntityDAO extends GeneralDAO {
/*
    public EntityDAO() {
        super.getName(1, "entity");
    }
*/
    public List<Entity> readEntities() {
        DBConnection db = new DBConnection();
        List<Entity> entities = new ArrayList<>();
        String sql = "SELECT * FROM entity";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int legalId = resultSet.getInt("legal_id");
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

}
