
package Model;

/**
 *
 * @author allys
 */
public class District {
    private int id,cantonId;
    private String name;
    
    public District(){}
    public District(int cantonId,String name){
        this.cantonId= cantonId;
        this.name= name;
    }
    public District(int id,int cantonId,String name){
        this.id= id;
        this.cantonId= cantonId;
        this.name= name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
