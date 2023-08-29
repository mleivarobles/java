/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author mario
 */
public class Cafe {
    
    private String nombre;
    private String paisOrigen;
    private double acidez;
    private double valor;

    public Cafe(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cafe{" + "nombre=" + nombre + '}';
    }
}
