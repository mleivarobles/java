/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Venta {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaVenta;
    private double precioVenta;

    public Venta(Cliente cliente, Vehiculo vehiculo, double precioVenta) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaVenta = new Date(); //fecha actual
        this.precioVenta = precioVenta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", fechaVenta=" + fechaVenta + ", precioVenta=" + precioVenta + '}';
    }
    
}
