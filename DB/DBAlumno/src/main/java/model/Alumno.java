/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mario
 */
public class Alumno {
    
    private String rut;
    private String nombre;
    private int edad;

    public Alumno(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" 
                + nombre + ", edad=" + edad + '}';
    }
    
    public void guardarAlumno(){
        String strSQL = new String();
        try {
            //INSERT INTO alumno VALUES ('8723','Alejandra Soto',29);
            
            String sql = "'"+rut+"',"+"'"+nombre+"',"+edad;
            System.out.println("sql:"+sql);
            strSQL = "INSERT INTO alumno VALUES("+sql+")";
            
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Registro ingresado en la tabla alumno");
            Conexion.desconectar();
             
        } catch (SQLException e) {
            System.out.println("Error al ingresar alumno:" + strSQL);
        }
    }
    
    public boolean buscarAlumno(){
        String strSQL = new String();
        try {
            //SELECT * FROM alumno where rut = 'rut';
            
            strSQL = "SELECT * FROM alumno WHERE rut = '"+rut+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            ResultSet result = Conexion.sentencia.executeQuery(strSQL);
            
            if(result.next()){
                rut = result.getString("rut");
                nombre = result.getString("nombre");
                edad = Integer.parseInt(result.getString("edad"));
                return true;
            }
            Conexion.desconectar();
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error al buscar alumno: " + strSQL);
        }
        return false;
    }
    
    public void actualizarAlumno(){
        String strSQL = new String();
        try {
            /*
            UPDATE alumno
            SET nombre = 'nombre', edad = edad
            WHERE rut = 'rut';
            */
            
            strSQL = "UPDATE alumno SET nombre = '"+nombre+"',edad = "+edad
                    +" WHERE rut = '"+rut+"'"; 
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Registro alumno actualizado");
            Conexion.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error en actualizar alumno: " + strSQL);
        }
    }
    
    public void eliminarAlumno(){
        String strSQL = new String();
        try {
            Conexion.conectar();
            /*
            DELETE FROM alumno
            WHERE rut = 'rut';
            */
            
            strSQL = "DELETE FROM alumno WHERE rut = '"+rut+"+";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Alumno eliminado de la BD");
            Conexion.desconectar();
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar alumno " + strSQL);
        }
    }
}
