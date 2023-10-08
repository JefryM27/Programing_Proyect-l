
package Model;

/**
 *
 * @author Bravo
 */
public class SamplingSite {
    private int id;
    private String samplingName;
    private int province_id;
    private int canton_id;
    private int district_id;
    private int entity_id;

    public SamplingSite() {
    }

    public SamplingSite(String samplingName, int province_id, int canton_id, int district_id, int entity_id) {
        this.samplingName = samplingName;
        this.province_id = province_id;
        this.canton_id = canton_id;
        this.district_id = district_id;
        this.entity_id = entity_id;
    }

    public SamplingSite(int id, String samplingName, int province_id, int canton_id, int district_id, int entity_id) {
        this.id = id;
        this.samplingName= samplingName;
        this.province_id = province_id;
        this.canton_id = canton_id;
        this.district_id = district_id;
        this.entity_id = entity_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSamplingName() {
        return samplingName;
    }

    public void setSamplingName(String samplingName) {
        this.samplingName = samplingName;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCanton_id() {
        return canton_id;
    }

    public void setCanton_id(int canton_id) {
        this.canton_id = canton_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }
    
}
