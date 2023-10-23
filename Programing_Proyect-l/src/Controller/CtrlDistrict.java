package Controller;

import Model.District;
import Model.DistrictDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author jefry
 */
public class CtrlDistrict {

    DistrictDAO district = new DistrictDAO();
   //Method to load the Districts into the combobox
    public void loadDistrictsByCanton(JComboBox cantonComboBox, JComboBox districtComboBox) {
        String selectedCanton = (String) cantonComboBox.getSelectedItem();
        List<District> districts = this.district.readDistrictsByCanton(selectedCanton);
       //Creates a new object
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (District district : districts) {
            model.addElement(district.getDistrictName());
        }
        districtComboBox.setModel(model);
    }
}
