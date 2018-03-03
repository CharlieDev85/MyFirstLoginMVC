/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author charlie
 */
public class DBConection {

    public static final String USERNAME = "root";
    public static final String PASSWORD = "Charlie";
    public static final String HOST = "localhost";
//    default port for mysql is 3306
    public static final String PORT = "3306";
    public static final String DATABASE = "Login1";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    public java.sql.Connection con;

    public DBConection() {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void main(String[] args) {
//        DBConection conec = new DBConection();
//    }

}
