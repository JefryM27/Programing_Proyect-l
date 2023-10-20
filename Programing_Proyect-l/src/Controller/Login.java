/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.UserDAO;
import View.AdminFrame;
import View.DigitadorFrame;
import View.SuperAdminFrame;
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
    CtrlSprings springs = new CtrlSprings();
    CtrlSampling sampling = new CtrlSampling();

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
        SuperAdminFrame regis = new SuperAdminFrame();
        regis.setVisible(true);
    }

    private void openAdminFrame() {
        int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        user.setRolId(3);
        springs.setEntityId(entityId);
        sampling.setEntityADM(entityId);
        AdminFrame regis = new AdminFrame(entityId);
        regis.setVisible(true);
    }

    private void openDigitadorFrame() {
        int digitizerId = authenticatedUser.getId();
        int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        user.setRolId(3);
        DigitadorFrame regis = new DigitadorFrame(entityId, digitizerId);
        regis.setVisible(true);
    }
}
