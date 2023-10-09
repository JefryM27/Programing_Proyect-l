package Controller;

import Model.DBConnection;
import View.login;
import Model.CantonDAO;
import Model.EntityDAO;
import Model.GeneralDAO;
import Model.ProvinceDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jefry
 */
public class Programing_ProyectL {

    public static void main(String[] args) {
        //DBConnection db = new DBConnection();
        //db.getConnection();
        //db.disconnect();
        //login Login = new login();
        //Login.setVisible(true);
        CantonDAO canton = new CantonDAO();
        System.out.println(canton.getName(3,"canton"));
        System.out.println(canton.getIDByName("Desamparados", "canton"));
        ProvinceDAO province = new ProvinceDAO();
        System.out.println(province.getName(3, "province"));
        System.out.println(province.getIDByName("Alajuela", "province"));
        EntityDAO entity = new EntityDAO();
        System.out.println(entity.getName(4, "entity"));
        System.out.println(entity.getIDByName("Municipalidad de San Jose", "entity"));

       /*HashMap mapa = new HashMap<String, String>();
        mapa.put("id", "int");
        mapa.put("name", "String");
        System.out.println(mapa.get("Color"));
        mapa.forEach((clave, valor) -> {
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        });*/

    }
}
