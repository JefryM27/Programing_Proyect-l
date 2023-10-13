package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author allys
 */

public class FlowMeasurementDAO {

    public List<FlowMeasurement> readFlowMeasurements() {
        DBConnection db = new DBConnection();
        List<FlowMeasurement> measurements = new ArrayList<>();
        String sql = "SELECT * FROM flow_measurement";

        try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                double capacity = resultSet.getDouble("capacity");
                String method = resultSet.getString("metod");
                String observation = resultSet.getString("observation");
                Date date = resultSet.getDate("date");
                String weather = resultSet.getString("weather");
                String done = resultSet.getString("done");
                int springsId = resultSet.getInt("springs_id");
                int samplingId = resultSet.getInt("sampling_id");
                FlowMeasurement measurement = new FlowMeasurement(id, springsId, samplingId, capacity, method, observation, weather, done, date);
                measurements.add(measurement);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            db.disconnect();
        }

        return measurements;
    }

}
