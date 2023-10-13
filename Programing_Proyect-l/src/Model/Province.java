package Model;

/**
 *
 * @author jefry
 */
public class Province {

    private int id;
    private String provinceName;

    public Province() {
    }

    public Province(String provinceName) {
        this.provinceName = provinceName;
    }

    public Province(int id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

}
