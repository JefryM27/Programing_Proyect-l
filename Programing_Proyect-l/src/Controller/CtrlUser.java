package Controller;

import Model.User;
import Model.UserDAO;
import View.Register;
import View.login;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author allys
 */
public class CtrlUser {

    UserDAO user = new UserDAO();
    int id;
    User authenticatedUser = null;

    public void loginUser(String enteredMail, String enteredPassword) {
        List<User> userList = user.readUsers();
        boolean isAuthenticated = false;
        for (User user : userList) {
            if (user.getMail().equals(enteredMail) && user.getPassword().equals(enteredPassword)) {
                authenticatedUser = user;
                isAuthenticated = true;
                break;
            }
        }
        if (isAuthenticated) {
            openFrame();
        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteUser(){
        this.user.delete(this.id);
    }

    private void openFrame() {
        int rolId = authenticatedUser.getRol_id();
        if (rolId == 2) {
            openAdminFrame();
        } else if (rolId == 3) {
            openDigitadorFrame();
        } else {
        }
    }

    private void openAdminFrame() {
        Register regis = new Register();
        regis.setVisible(true);
    }

    private void openDigitadorFrame() {
        Register regis = new Register();
        regis.setVisible(true);
        regis.cbxEntitySprings.setVisible(false);
    }
}
