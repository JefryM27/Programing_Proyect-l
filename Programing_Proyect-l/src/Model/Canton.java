package Model;

/**
 *
 * @author Bravo
 */
public class Canton {

    private int id;
    private String cantonName;
    private int province_id;

    public Canton() {
    }

    public Canton(String cantonName, int province_id) {
        this.cantonName = cantonName;
        this.province_id = province_id;
    }

    public Canton(int id, String cantonName, int province_id) {
        this.id = id;
        this.cantonName = cantonName;
        this.province_id = province_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantonName() {
        return cantonName;
    }

    public void setCantonName(String cantonName) {
        this.cantonName = cantonName;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

}
