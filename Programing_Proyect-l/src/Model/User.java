package Model;

/**
 *
 * @author Bravo
 */
public class User {

    private int id;
    private String userName;
    private String mail;
    private String password;
    private int entity_id;
    private int rol_id;

    public User() {
    }

    public User(String userName, String mail, String password, int entity_id, int rol_id) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.entity_id = entity_id;
        this.rol_id = rol_id;
    }

    public User(int id, String userName, String mail, String password, int entity_id, int rol_id) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.entity_id = entity_id;
        this.rol_id = rol_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEntity_id() {
        return entity_id;
    }

    public void setEntity_id(int entity_id) {
        this.entity_id = entity_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

}
