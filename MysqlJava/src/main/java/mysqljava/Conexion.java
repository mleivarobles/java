/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mario
 */
public class Conexion {
    
    Connection conexion = null;
    
    String host = "localhost";
    String bd = "jpa_test";
    String user = "java_user";
    String password = "java";
    int puerto = 3306;
    
    String cadena = "jdbc:mysql//" + host +":" + puerto + "/" + bd;
        
    public Connection conectar(){
        
        System.out.println(cadena);
        
        try {
            Class.forName("com.mysql.jdbc.driver");
            conexion = DriverManager.getConnection(cadena,user,password);
            System.out.println("Se conectó a la BD " + bd);
            
        } catch (Exception e) {
            System.out.println("No se conectó a la BD " +  bd);
        }
        
        return conexion;
    }
}
