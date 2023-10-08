
package Model;

import java.util.Date;

/**
 *
 * @author allys
 */
public class FlowMeasurement {
    private int id,springsId,samplingId;
    private double capacity;
    private String metod,observation,weather,done;
    private Date date;
    
   public FlowMeasurement(){
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
