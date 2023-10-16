package Model;

import java.util.Date;

/**
 *
 * @author allys
 */
public class FlowMeasurement {

    private int id;
    private int springsId;
    private int samplingId;
    private double capacity;
    private String metod;
    private String observation;
    private String weather;
    private String done;
    private Date date;

    public FlowMeasurement() {
    }

    public FlowMeasurement(double capacity, String metod, String observation, String weather, String done, Date date,int springsId, int samplingId) {
        this.springsId = springsId;
        this.samplingId = samplingId;
        this.capacity = capacity;
        this.metod = metod;
        this.observation = observation;
        this.weather = weather;
        this.done = done;
        this.date = date;
    }

    public FlowMeasurement(int id, int springsId, int samplingId, double capacity, String metod, String observation, String weather, String done, Date date) {
        this.id = id;
        this.springsId = springsId;
        this.samplingId = samplingId;
        this.capacity = capacity;
        this.metod = metod;
        this.observation = observation;
        this.weather = weather;
        this.done = done;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpringsId() {
        return springsId;
    }

    public void setSpringsId(int springsId) {
        this.springsId = springsId;
    }

    public int getSamplingId() {
        return samplingId;
    }

    public void setSamplingId(int samplingId) {
        this.samplingId = samplingId;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getMetod() {
        return metod;
    }

    public void setMetod(String metod) {
        this.metod = metod;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
