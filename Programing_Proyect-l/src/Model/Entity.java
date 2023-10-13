package Model;

/**
 *
 * @author allys
 */
public class Entity {

    private int id;
    private int legalId;
    private int telephone;
    private String entityName;
    private String email;
    private String address;
    private String description;

    public Entity() {
    }

    public Entity(int legalId, int telephone, String entityName, String email, String address, String description) {
        this.legalId = legalId;
        this.telephone = telephone;
        this.entityName = entityName;
        this.email = email;
        this.address = address;
        this.description = description;
    }

    public Entity(int id, int legalId, int telephone, String entityName, String email, String address, String description) {
        this.id = id;
        this.legalId = legalId;
        this.telephone = telephone;
        this.entityName = entityName;
        this.email = email;
        this.address = address;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLegalId() {
        return legalId;
    }

    public void setLegalId(int legalId) {
        this.legalId = legalId;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
