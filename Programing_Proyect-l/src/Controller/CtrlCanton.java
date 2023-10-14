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

    public void loadCantonsByProvince(JComboBox provinceComboBox, JComboBox cantonComboBox) {
        String selectedProvince = (String) provinceComboBox.getSelectedItem();
        List<Canton> cantons = this.canton.readCantonsByProvince(selectedProvince);

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Canton canton : cantons) {
            model.addElement(canton.getCantonName());
        }
        cantonComboBox.setModel(model);
    }
}
