
package Model;

/**
 *
 * @author allys
 */
public class Entity {
    private int id,legalId,telephone;
    private String name,email,address,description;
    
    public Entity(){}

 
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
