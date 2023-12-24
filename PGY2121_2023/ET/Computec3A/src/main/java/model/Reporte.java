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
public class Reporte {
    
    private String modelo;
    private String nombre;
    private int telefono;
    private String correo;
    private double precio;
    private String tipoEquipo;
    private Date fecha;

    public Reporte(String modelo, String nombre, int telefono, 
            String correo, double precio, String tipoEquipo, Date fecha) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.precio = precio;
        this.tipoEquipo = tipoEquipo;
        this.fecha = fecha; //fecha de hoy
    }

    public Date getFecha() {
        return fecha;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }
}
