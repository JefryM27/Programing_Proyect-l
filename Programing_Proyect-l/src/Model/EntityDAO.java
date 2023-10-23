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
//Method to create a entity
    public void create(Entity entity) {
        //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query
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
  //Method to create a list to read entities
    public List<Entity> readEntities() {
        //establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Create a new list 
        List<Entity> entities = new ArrayList<>();
        //Set the query with sql
        String sql = "SELECT * FROM entity";

        try {
            //Prepare the declaration
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
//Method to update entity in databases
    public void update(Entity entity) {
        //establishes the connection to the database
        DBConnection db = new DBConnection();
        //Set the query with sql
        String consultaSQL = "UPDATE entity SET legal_id=?, name=?, email=?,telephone=?,address=?,description=? WHERE id=?";
        try {
            //Prepare the declaration
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
  //Method to delete the Entity of databases
    public void delete(int id) {
       //Establishes the connection to the databases
        DBConnection db = new DBConnection();
       //Set the query with sql
        String consultaSQL = "DELETE FROM entity WHERE id=?";
        
        try {
            //Prepare the declaration 
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
//Method to get the EntityId and show the name  
    public int getIDEntity(String name) {
        int value = 0;
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT id FROM entity WHERE name = ?";
        try {
            //Prepare the declaration
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
 //Method to string the Entity name according to id  
    public String getNameEntity(int id) {
        String value = "";
        //Establishes the connection to the databases
        DBConnection db = new DBConnection();
        //Set the query with sql
        String sql = "SELECT name FROM entity WHERE id = ?";
        try {
            //Prepare the declaration
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
