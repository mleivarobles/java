/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Cliente;
import com.mysql.cj.util.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mleiva
 */
public class ClienteDao {
    
    public Connection conectarBD(){
        String bd = "java";
        String usuario = "root";
        String password = "mysql";
        String host = "localhost"; 
        String puerto = "3306";
        //String driver = "com.mysql.jdbc.Driver";
        String driver = "com.mysql.cj.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + bd + "?useSSL=false";
        
        Connection conexion = null;
         
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
    }
    
    public void agregarCliente(Cliente cliente){
        try {
            Connection conexion = conectarBD();            
            
            String sql = "INSERT INTO `java`.`cliente` (`nombre`, `apellido`, `email`, `telefono`) "
                    + "VALUES ('" + cliente.getNombre() + "', "
                    + "'" + cliente.getApellido() + "', "
                    + "'" + cliente.getEmail()+ "', "
                    + "'" + cliente.getTelefono() +"')";
            
            Statement sqlStatement = conexion.createStatement();
            sqlStatement.execute(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarCliente(Cliente cliente){
        try {
            Connection conexion = conectarBD();            
            
            String sql = "UPDATE `java`.`cliente` "
                    + "SET `nombre` = '" + cliente.getNombre() + "', "
                    + "`apellido` = '" + cliente.getApellido() + "', "
                    + "`email` = '" + cliente.getEmail() +"', "
                    + "`telefono` = ' " + cliente.getTelefono() + "' "
                    + "WHERE (`idcliente` = ' " + cliente.getId()+ "');";
            
            Statement sqlStatement = conexion.createStatement();
            sqlStatement.execute(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> listarCliente(){
        List<Cliente> listado = new ArrayList<>();

        try {
            Connection conexion = conectarBD(); 
            String sql = "SELECT * FROM java.cliente;";

            Statement sqlStatement = conexion.createStatement(); 
            ResultSet resultado = sqlStatement.executeQuery(sql);


            while(resultado.next()){
                Cliente cliente = new Cliente();

                cliente.setId(resultado.getString("idcliente"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("apellido"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
                listado.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;
    }
    
    public void eliminarCliente(String id){
               try {
            Connection conexion = conectarBD(); 
            String sql = "DELETE FROM java.cliente WHERE idcliente =" + id;

            Statement sqlStatement = conexion.createStatement(); 
            sqlStatement.execute(sql);
          
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarCliente(Cliente cliente) {
        if(StringUtils.isEmptyOrWhitespaceOnly(cliente.getId())){
            agregarCliente(cliente);
        } else {
            actualizarCliente(cliente);
        }
    }
    
}
