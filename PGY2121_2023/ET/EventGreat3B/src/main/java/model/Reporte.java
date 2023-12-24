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
    
    private String tipoEvento;
    private String descripcion;
    private String nombre;
    private int telefono;
    private String correo;
    private double precio;
    private Date fecha;

    public Reporte(String descripcion, String nombre, int telefono, 
            String correo, double precio, String tipoEvento, Date fecha) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.precio = precio;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha; //fecha de hoy
    }

    public Date getFecha() {
        return fecha;
    }
    
    public String getDescripcion() {
        return descripcion;
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

    public String getTipoEvento() {
        return tipoEvento;
    }
}
