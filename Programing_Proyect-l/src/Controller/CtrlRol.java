package Controller;

import Model.Rol;
import Model.RolDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Bravo
 */
public class CtrlRol {

    RolDAO rol = new RolDAO();
 //Method to load the Rol into the combobox
    public void loadRol(JComboBox c) {
        List<Rol> rols = this.rol.readRols();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Rol rol : rols) {
            model.addElement(rol.getRolName());
        }
        c.setModel(model);
    }
}
