/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignaturas;

/**
 *
 * @author mario
 */
public class Alumno extends Persona {
    
    private int calificacion;

    public Alumno(int calificacion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.calificacion = calificacion;
    }  

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean getDisponiblidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
