package Model;

/**
 *
 * @author jefry
 */
public class WaterSprings {

    private int id;
    private String springName;
    private String address;
    private String latitute;
    private String lenght;
    private String description;
    private int provinceId;
    private int cantonId;
    private int districtId;
    private int entityId;

    public WaterSprings() {
    }

    public WaterSprings(String springName, String address, String latitute, String lenght, String description, int provinceId, int cantonId, int districtId, int entityId) {
        this.springName = springName;
        this.address = address;
        this.latitute = latitute;
        this.lenght = lenght;
        this.description = description;
        this.provinceId = provinceId;
        this.cantonId = cantonId;
        this.districtId = districtId;
        this.entityId = entityId;
    }

    public WaterSprings(int id, String springName, String address, String latitute, String lenght, String description, int provinceId, int cantonId, int districtId, int entityId) {
        this.id = id;
        this.springName = springName;
        this.address = address;
        this.latitute = latitute;
        this.lenght = lenght;
        this.description = description;
        this.provinceId = provinceId;
        this.cantonId = cantonId;
        this.districtId = districtId;
        this.entityId = entityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpringName() {
        return springName;
    }

    public void setSpringName(String springName) {
        this.springName = springName;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCantonId() {
        return cantonId;
    }

    public void setCantonId(int cantonId) {
        this.cantonId = cantonId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

}
