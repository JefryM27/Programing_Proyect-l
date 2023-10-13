package Model;

/**
 *
 * @author allys
 */
public class District {

    private int id, cantonId;
    private String districtName;

    public District() {
    }

    public District(int cantonId, String districtName) {
        this.cantonId = cantonId;
        this.districtName = districtName;
    }

    public District(int id, String districtName, int cantonId) {
        this.id = id;
        this.cantonId = cantonId;
        this.districtName = districtName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantonId() {
        return cantonId;
    }

    public void setCantonId(int cantonId) {
        this.cantonId = cantonId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
