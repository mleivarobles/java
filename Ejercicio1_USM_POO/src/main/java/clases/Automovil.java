/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mario
 */
public class Automovil extends Vehiculo{
    
    private int cilindrada;

    public Automovil(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
   
    public void derrapar(){
        System.out.println("El auto "+  this.toString() + " está derrapando");
    }
    
}
