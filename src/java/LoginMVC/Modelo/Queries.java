/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author charlie
 */
public class Queries extends DBConection{
    public boolean authenticate(String user, String pass) throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = null;
        String q = "SELECT * FROM Usuarios";
        rs=st.executeQuery(q);
        
        while(rs.next()){
            if(user.equals(rs.getString("Usuario")) && pass.equals(rs.getString("Contrasena"))){
                return true;
            }
        }
        
        return false;
    }
    
//    public static void main(String[] args) throws SQLException {
//        Queries query = new Queries();
//        System.out.println(query.authenticate("david", "123"));
//    }
}
