
package Model;

/**
 *
 * @author jefry
 */
public class Province {
   private int id;
   private int provinceName;

    public Province(int id, int provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }
   
   
}
