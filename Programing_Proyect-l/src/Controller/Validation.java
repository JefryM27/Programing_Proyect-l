
package Controller;

import Model.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bravo
 */
public class Validation {
    public static boolean validateLyrics(String value) {
        String regex = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ ]+$";
        return value.matches(regex);
    }

    public static boolean validateNumbers(String value) {
        String regex = "^[0-9]+$";
        return value.matches(regex);
    }

    public static boolean verificateLegalIdExisting(String legalId) {
        DBConnection db = new DBConnection();
        String consultaSQL = "SELECT COUNT(*) FROM entity WHERE legal_Id = ?";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, legalId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cedula en la base de datos");
        } finally {
            db.disconnect();
        }

        return false; 
    }
    
    public static boolean verificateSamplingSiteExisting(String samplingName) {
        DBConnection db = new DBConnection();
        String consultaSQL = "SELECT COUNT(*) FROM sampling_site WHERE name = ?";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(consultaSQL);
            ps.setString(1, samplingName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la cedula en la base de datos");
        } finally {
            db.disconnect();
        }

        return false; 
    }
}
