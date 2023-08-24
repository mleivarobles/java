/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea;

import java.time.LocalDate;

/**
 *
 * @author mario
 */
public class Pasaje {
    
    private int nroVuelo;
    private Pasajero pasajero;
    private String destino;
    private LocalDate fechaPasaje;
    private double valor;
    private int nroAsiento;
    private boolean traeEquipaje;

    public Pasajero getPasajero() {
        return pasajero;
    }

    public LocalDate getFechaPasaje() {
        return fechaPasaje;
    }

    public double getValor() {
        return valor;
    }

    public boolean isTraeEquipaje() {
        return traeEquipaje;
    }
    
    
    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaPasaje(LocalDate fechaPasaje) {
        this.fechaPasaje = fechaPasaje;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public void setTraeEquipaje(boolean traeEquipaje) {
        this.traeEquipaje = traeEquipaje;
    }
    
    public boolean esPasajeVigente(){
        LocalDate fechaHoy = LocalDate.now();
        
        return fechaPasaje.isAfter(fechaHoy) || fechaPasaje.isEqual(fechaHoy);
        }
    
    public double calcularRecargo(){
        if (traeEquipaje){
            return valor * (1+20/100);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "nroVuelo=" + nroVuelo + ", pasajero=" + pasajero + ", destino=" + destino + ", fechaPasaje=" + fechaPasaje + ", valor=" + valor + ", nroAsiento=" + nroAsiento + ", traeEquipaje=" + traeEquipaje + '}';
    }
}
