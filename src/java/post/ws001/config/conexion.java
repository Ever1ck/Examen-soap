/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.ws001.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author choco
 */
public class conexion {
    private static final String URL="jdbc:postgresql://ec2-34-197-84-74.compute-1.amazonaws.com/d1j4m7599nfbnr";
    private static final String DRIVER="org.postgresql.Driver";
    private static final String PASS="e2cac99d6bf56c260e8e5b9515a35fa731a750ec1e3308ae776e464403cfe195";
    private static final String USER="uaxtgqoxpgwcvq";
    private static Connection cx = null;
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
             if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
        return cx;
    }
}
