
package Controller;

import Model.Canton;
import Model.CantonDAO;
import Model.Province;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author allys
 */
public class CtrlCanton {
    
    CantonDAO canton = new CantonDAO();
    
    public void loadCanton(JComboBox c) {
        List<Canton> cantons = this.canton.readCantons();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Canton canton : cantons) {
            model.addElement(canton.getCantonName());
        }
        c.setModel(model);
    }
}
