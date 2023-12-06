/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mario
 */
public class Camioneta extends Vehiculo {
    
    private double capacidadCarga;

    public Camioneta(String patente, String marca, String modelo,
            double capacidadCarga) {
        super(patente, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta{" + super.toString()+ ", capacidadCarga=" + capacidadCarga + '}';
    }
    
    
}
