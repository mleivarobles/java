/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mario
 */
public class Automovil extends Vehiculo {
    
    private double rendimiento;
    private boolean tieneAire;

    public Automovil(String patente, String marca, String modelo,
            double rendimiento, boolean tieneAire) {
        super(patente, marca, modelo);
        this.rendimiento = rendimiento;
        this.tieneAire = tieneAire;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    @Override
    public String toString() {
        return "Automovil{" +super.toString()+ ", rendimiento=" + rendimiento + ", tieneAire=" + tieneAire + '}';
    }
    
    
}
