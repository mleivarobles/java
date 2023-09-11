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
    private ArrayList<Examen> examenes; //el alumno tiene 0 o muchos examenes

    public Alumno(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examenes = new ArrayList<>();
    }
    
    public void agregarExamen(Examen examen){
        this.examenes.add(examen);
    }

    @Override
    public boolean aprueba() {
        boolean aprueba = true; // asumo que aprueba
        int i = 0;
        
        while( i < examenes.size() && aprueba){
           /** 
            * Buen ejemplo como se refleja el polimorfismo a nivel de clases. 
            * Estoy solicitando a la clase examen  que validé si aprobó. 
            * Independiente si es un examen oral o escrito. 
            * Dependiendo del tipo de objeto es el metodo que se invoca.
           */
            if( !examenes.get(i).aprueba() ){
                aprueba = false;
            }
            i++;
        }
        return aprueba;
    }
}
