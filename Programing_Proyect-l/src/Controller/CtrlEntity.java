
package Controller;

import Model.Entity;
import Model.EntityDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author jefry
 */
public class CtrlEntity {
    EntityDAO entity = new EntityDAO();
    int id;
   
    public void loadEntity(JComboBox c) {
        List<Entity> entities = this.entity.readEntities();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Entity entity : entities) {
            model.addElement(entity.getEntityName());
        }
        c.setModel(model);
    }
    
    public void deleteEntity(){
        this.entity.delete(this.id);
    }
}
