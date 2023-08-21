/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mario
 */
public class Bicicleta extends Vehiculo {
    
    private int cantidaPiniones;

    public Bicicleta(int cantidaPiniones) {
        this.cantidaPiniones = cantidaPiniones;
    }

    public int getCantidaPiniones() {
        return cantidaPiniones;
    }

    public void setCantidaPiniones(int cantidaPiniones) {
        this.cantidaPiniones = cantidaPiniones;
    }

    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(double kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void levantarRueda(){
        System.out.println("La bici "+  this.toString() + " está levantando la rueda");
    }

    
    
}
