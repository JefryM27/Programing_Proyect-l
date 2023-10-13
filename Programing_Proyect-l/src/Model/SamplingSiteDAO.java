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
public class SamplingSiteDAO {

    public void create(SamplingSite sampling) {

        DBConnection db = new DBConnection();
        String consultaSQL = "INSERT INTO sampling_site (name, province_id, canton_id, district_id, entity_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, sampling.getSamplingName());
            ps.setInt(2, sampling.getProvince_id());
            ps.setInt(3, sampling.getCanton_id());
            ps.setInt(4, sampling.getDistrict_id());
            ps.setInt(5, sampling.getEntity_id());
            ps.execute();
            JOptionPane.showMessageDialog(null, "El sitio de muestro se ha guardado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NNo se pudo guardar la medicion del caudal, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

    public List<SamplingSite> readSamplingSites() {
        DBConnection db = new DBConnection();
        List<SamplingSite> samplingSites = new ArrayList<>();
        String sql = "SELECT * FROM sampling_site";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String samplingName = resultSet.getString("name");
                int province_id = resultSet.getInt("province_id");
                int canton_id = resultSet.getInt("canton_id");
                int district_id = resultSet.getInt("district_id");
                int entity_id = resultSet.getInt("entity_id");

                SamplingSite site = new SamplingSite(id, samplingName, province_id, canton_id, district_id, entity_id);
                samplingSites.add(site);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return samplingSites;
    }

    public void delete(int id) {

        DBConnection db = new DBConnection();

        String consultaSQL = "DELETE FROM sampling_site WHERE id=?";

        try {
            PreparedStatement preparedStatement = db.getConnection().prepareStatement(consultaSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el sitio de muestreo");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        } finally {
            db.disconnect();
        }
    }

}
