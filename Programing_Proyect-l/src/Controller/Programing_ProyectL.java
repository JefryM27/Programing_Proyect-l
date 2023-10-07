
package Controller;

import Model.DBConnection;
import View.login;

/**
 *
 * @author jefry
 */
public class Programing_ProyectL {

    public static void main(String[] args) {
        //DBConnection db = new DBConnection();
        //db.getConnection();
        //db.disconnect();
        login Login = new login();
        Login.setVisible(true);
    }
    
}
