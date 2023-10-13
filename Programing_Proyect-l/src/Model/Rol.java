package Model;

/**
 *
 * @author jefry
 */
public class Rol {

    private int id;
    private String rolName;

    public Rol() {
    }

    public Rol(int id, String rolName) {
        this.id = id;
        this.rolName = rolName;
    }

    public Rol(String rolName) {
        this.rolName = rolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

}
