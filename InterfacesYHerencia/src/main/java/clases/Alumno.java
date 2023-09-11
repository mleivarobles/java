/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaces.Aprobable;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Alumno implements Aprobable {
    
    private String rut;
    private String nombre;
    private String apellido;
    private ArrayList<Examen> examanes; //el alumno tiene 0 o muchos examenes

    public Alumno(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examanes = new ArrayList<>();
    }
    
    public void agregarExamen(Examen examen){
        this.examanes.add(examen);
    }

    @Override
    public boolean aprueba() {
        return true;
    }
}
