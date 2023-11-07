/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Alumno;

/**
 *
 * @author mario
 */
public class DAOAlumno {
    
    public static void ingresarAlumno(Alumno alumno){
        String strSQL = new String();
        try {
            //INSERT INTO alumno VALUES ('8723','Alejandra Soto',29);
            
            String rut = alumno.getRut();
            String nombre = alumno.getNombre();
            int edad = alumno.getEdad();
            
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
    
    public static Alumno buscarAlumno(String rut){
        String strSQL = new String();
        Alumno alumno = new Alumno();
        try {
            //SELECT * FROM alumno where rut = 'rut';
            
            strSQL = "SELECT * FROM alumno WHERE rut = '"+rut+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            ResultSet result = Conexion.sentencia.executeQuery(strSQL);
            
            if(result.next()){
                alumno.setRut(result.getString("rut"));
                alumno.setNombre(result.getString("nombre"));
                alumno.setEdad(Integer.parseInt(result.getString("edad")));
                return alumno;
            }
            Conexion.desconectar();
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error al buscar alumno: " + strSQL);
        }
        return null;
    }
    
    public static void actualizarAlumno(String rut, String nombre, int edad){
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
    
    public static void eliminarAlumno(String rut){
        String strSQL = new String();
        try {
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
    
    public static ArrayList<Alumno> listar(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            
            //SELECT * FROM alumno;
            String strSQL = "SELECT * FROM alumno";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            ResultSet result = Conexion.sentencia.executeQuery(strSQL);
            
            while(result.next()){
                Alumno alumno = new Alumno();
                alumno.setRut( result.getString("rut"));
                alumno.setNombre(result.getString("nombre"));
                alumno.setEdad(result.getInt("edad"));
                alumnos.add(alumno);       
            }
            Conexion.desconectar();
            
        } catch (SQLException e) {
            System.out.println("No se pudo listar los alumnos: " + e.toString());
        }
        return alumnos;
    }
    
}
