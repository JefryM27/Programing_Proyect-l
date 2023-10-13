
package Controller;

import Model.WaterSprings;
import Model.WaterSpringsDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Bravo
 */
public class CtrlSprings {
    
    WaterSpringsDAO spring = new WaterSpringsDAO();
   
    public void loadSprings(JComboBox c) {
        List<WaterSprings> springs = this.spring.readWaterSprings();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (WaterSprings spring : springs) {
            model.addElement(spring.getSpringName());
        }
        c.setModel(model);
    }
}
