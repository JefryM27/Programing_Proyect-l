
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
   
    public void loadDistrict(JComboBox c) {
        List<District> districts = this.district.readDistricts();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (District district :districts) {
            model.addElement(district.getDistrictName());
        }
        c.setModel(model);
    }
}
