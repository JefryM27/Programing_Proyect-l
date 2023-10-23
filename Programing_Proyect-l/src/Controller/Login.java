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
//Method to access throught a user
    public void loginUser(String enteredMail, String enteredPassword) {
        //read the User list
        List<User> userList = dao.readUsers();
        //determines whether the user has been successfully authenticated or not.
        boolean isAuthenticated = false;
        for (User user : userList) {
            //validates if the email and password are the same as the entered data registered in the database
            if (user.getMail().equals(enteredMail) && user.getPassword().equals(enteredPassword)) {
                authenticatedUser = user;
                isAuthenticated = true;
                break;
            }
        }
        //Displays the frame if the user has been authenticated.
        if (isAuthenticated) {
            openFrame();
        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }
//Method to displays the frame 
    private void openFrame() {
        //Gets the authenticated user's role identifier
        int rolId = authenticatedUser.getRol_id();
        //if the role identifier is 2, the Admin frame is displayed.
        if (rolId == 2) {
            openAdminFrame();
        //if the role identifier is 3, the Digitizer frame is displayed.
        } else if (rolId == 3) {
            openDigitadorFrame();
        //if the role identifier is't 2 or 3, the SuperAdmin frame is displayed.
        } else {
            openSuperAdminFrame();
        }
    }
//Method to displays the SuperAdmin frame 
    private void openSuperAdminFrame() {
        SuperAdminFrame regis = new SuperAdminFrame();
        regis.setVisible(true);
    }
//Method to displays the Admin frame 
    private void openAdminFrame() {
        int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        user.setRolId(3);
        springs.setEntityId(entityId);
        sampling.setEntityADM(entityId);
        AdminFrame regis = new AdminFrame(entityId);
        regis.setVisible(true);
    }
//Method to displays the Digitizer frame 
    private void openDigitadorFrame() {
        int digitizerId = authenticatedUser.getId();
        int entityId = authenticatedUser.getEntity_id();
        user.setEntityId(entityId);
        user.setRolId(3);
        DigitadorFrame regis = new DigitadorFrame(entityId, digitizerId);
        regis.setVisible(true);
    }
}
