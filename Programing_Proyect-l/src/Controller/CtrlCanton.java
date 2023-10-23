package Controller;

import Model.Canton;
import Model.CantonDAO;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author allys
 */
public class CtrlCanton {

    CantonDAO canton = new CantonDAO();
    //Method to load the Cantons into the combobox
    public void loadCantonsByProvince(JComboBox provinceComboBox, JComboBox cantonComboBox) {
        String selectedProvince = (String) provinceComboBox.getSelectedItem();
        List<Canton> cantons = this.canton.readCantonsByProvince(selectedProvince);
    //Creates a new object
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Canton canton : cantons) {
            model.addElement(canton.getCantonName());
        }
        cantonComboBox.setModel(model);
    }
}
