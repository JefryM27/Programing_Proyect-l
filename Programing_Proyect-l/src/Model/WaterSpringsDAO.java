    package Model;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class WaterSpringsDAO {
    
    public void create(WaterSprings springs) {

        DBConnection db = new DBConnection();
        String consultaSQL = "INSERT INTO water_springs (name, address, latitude, length, description, province_id, canton_id, district_id, entity_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, springs.getSpringName());
            ps.setString(2, springs.getAddress());
            ps.setString(3, springs.getLatitute());
            ps.setString(4, springs.getLenght());
            ps.setString(5, springs.getDescription());
            ps.setInt(6, springs.getProvinceId());
            ps.setInt(7, springs.getCantonId());
            ps.setInt(8, springs.getDistrictId());
            ps.setInt(9, springs.getEntityId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La naciente se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la naciente, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public List<WaterSprings> readWaterSprings() {
        DBConnection db = new DBConnection();
        List<WaterSprings> waterSpringsList = new ArrayList<>();
        String sql = "SELECT * FROM water_springs";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String springName = resultSet.getString("name");
                String address = resultSet.getString("address");
                String latitute = resultSet.getString("latitute");
                String length = resultSet.getString("length");
                String description = resultSet.getString("description");
                int provinceId = resultSet.getInt("province_id");
                int cantonId = resultSet.getInt("canton_id");
                int districtId = resultSet.getInt("district_id");
                int entityId = resultSet.getInt("entity_id");

                WaterSprings waterSprings = new WaterSprings(id, springName, address, latitute, length, description, provinceId, cantonId, districtId, entityId);
                waterSpringsList.add(waterSprings);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return waterSpringsList;
    }
    
    public void update(WaterSprings springs){
        DBConnection db= new DBConnection();
        String consultaSQL= "UPDATE water_springs SET name=?, address=?, latitude=?,length=?,description=?,province_id=?,canton_id=?,distric_id=?,entity_id=? WHERE id=?";
        try{
             PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
             ps.setString(1, springs.getSpringName());
             ps.setString(2, springs.getAddress());
             ps.setString(3, springs.getLatitute());
             ps.setString(4, springs.getLenght());
             ps.setString(5, springs.getDescription());
             ps.setInt(6, springs.getProvinceId());
             ps.setInt(7, springs.getCantonId());
             ps.setInt(8, springs.getDistrictId());
             ps.setInt(9, springs.getEntityId());
             ps.setInt(10, springs.getId());
             ps.execute();
             JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error, no se actualizó: " + e.toString());
        }finally{
            db.disconnect();
        }
    }
    
    public void delete(int id) {

        DBConnection db = new DBConnection();

        String consultaSQL = "DELETE FROM water_springs WHERE id=?";

        try {
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la neciente");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }finally {
            db.disconnect();
        }
        
    }
}
