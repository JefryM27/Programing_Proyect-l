
package Model;

/**
 *
 * @author jefry
 */
public class WaterSprings {
    private int id;
    private String springName;
    private String direction;
    private int latitude;
    private int lenght;
    private String descriptoin;
    private int provinceId;
    private int cantonId;
    private int districtId;
    private int entityId;

    public WaterSprings(int id, String springName, String direction, int latitude, int lenght, String descriptoin, int provinceId, int cantonId, int districtId, int entityId) {
        this.id = id;
        this.springName = springName;
        this.direction = direction;
        this.latitude = latitude;
        this.lenght = lenght;
        this.descriptoin = descriptoin;
        this.provinceId = provinceId;
        this.cantonId = cantonId;
        this.districtId = districtId;
        this.entityId = entityId;
    }
    
    
    
}
