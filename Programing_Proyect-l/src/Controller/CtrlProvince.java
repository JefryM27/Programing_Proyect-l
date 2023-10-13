
package Controller;

import Model.Province;
import Model.ProvinceDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Bravo
 */
public class CtrlProvince {
     ProvinceDAO province = new ProvinceDAO();
   
    public void loadProvince(JComboBox c) {
        List<Province> provinces = this.province.readProvinces();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Province province : provinces) {
            model.addElement(province.getProvinceName());
        }
        c.setModel(model);
    }
}
