/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Instituto {
    
    private String nombre;
    private String ciudad;
    private ArrayList<Alumno> alumnos; //tiene 0 o muchos alumnos

    public Instituto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.alumnos = new ArrayList<>(); // inicializo la lista de alumnos
    }
    
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    
    
    
    
}
