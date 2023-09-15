/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scooterarraylist;

/**
 *
 * @author mario
 */
public class Empleado {
    
    private int rut;
    private String nombreCompleto;
    private char genero;
    private int annoServicio;
    private int edad;
    private Puesto puesto;

    public Empleado(int rut, String nombreCompleto, char genero, int annoServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.annoServicio = annoServicio;
        this.edad = edad;
        this.puesto = puesto;
    }
    
    public int getRut() {
        return rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
}
