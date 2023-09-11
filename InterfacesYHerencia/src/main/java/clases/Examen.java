/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaces.Aprobable;

/**
 *
 * @author mario
 */
public abstract class Examen implements Aprobable{
    
    /**
     * Todos las clases que extiendas de examen deben
     * implementar el metodo aprobo();
     * 
     * La clase Examen debe ser abstracta porque no tiene suficientes atributos
     * para calcular si un examen aprobó
     * Al hacerse abstracta delega esa labor en sus subcclases que si deben implementar
     * el metodo.
     */
    
    private String fechaRealizacion; //no es tipo fecha, solo referencial por eso es string y no tipo Date
    
    public Examen(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    
}
