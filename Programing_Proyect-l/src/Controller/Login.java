/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDAO;
import View.AdminFrame;
import View.DigitadorFrame;
import View.Register;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bravo
 */
public class Login {

    User authenticatedUser = null;
    UserDAO dao = new UserDAO();
    CtrlUser user = new CtrlUser();

    public void loginUser(String enteredMail, String enteredPassword) {
        List<User> userList = dao.readUsers();
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

    private void openFrame() {
        int rolId = authenticatedUser.getRol_id();
        if (rolId == 2) {
            openAdminFrame();
        } else if (rolId == 3) {
            openDigitadorFrame();
        } else {
            openSuperAdminFrame();
        }
    }

    private void openSuperAdminFrame() {
        Register regis = new Register();
        regis.setVisible(true);
    }

    private void openAdminFrame() {
        int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        AdminFrame regis = new AdminFrame(entityId);
        regis.setVisible(true);
    }

    private void openDigitadorFrame() {
         int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        DigitadorFrame regis = new DigitadorFrame();
        regis.setVisible(true);
    }
}
