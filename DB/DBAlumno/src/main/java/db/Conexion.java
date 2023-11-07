/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class Conexion {
    
    public static String bd = "jpa_test";
    public static String user = "java_user";
    public static String password = "java";
    
    public static String url = "jdbc:mysql://localhost:3306/"+bd;
    
    public static Connection conn;
    public static Statement sentencia;
    
    public static void conectar(){
        try {
            //com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);
            
            if(conn != null){
                System.out.println("Conexión ok con la bd: " + bd);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Hubo un error en la conexión " + e.toString());
        }
    }
    
    public static void desconectar() throws SQLException{
        conn.close();
    }
}
