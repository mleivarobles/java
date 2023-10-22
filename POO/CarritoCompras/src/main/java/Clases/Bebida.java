/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author mario
 */
public class Bebida {
    
    private String nombre;
    private String marca;
    private double capacidad;

    //Constructor de la clase
    public Bebida(String nombre, String marca, double capacidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bebida{" + "nombre=" + nombre + ", marca=" + marca + ", capacidad=" + capacidad + '}';
    }
    
    
}
