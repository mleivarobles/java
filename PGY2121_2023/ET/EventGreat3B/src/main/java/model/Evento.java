/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mario
 */
public abstract class Evento {
    
    private String codigo; //para identificar cada evento de manera unica
    private String descripcion;
    private int cantidadAsistentes;
    private int tamanioRecinto;
    private int cantidadMesas;
    private double precio;

    //nuevo equipo

    public Evento(String codigo, String descripcion, int cantidadAsistentes, 
            int tamanioRecinto, int cantidadMesas, double precio) {
        this.codigo = generarCodigo(codigo);
        this.descripcion = descripcion;
        this.cantidadAsistentes = cantidadAsistentes;
        this.tamanioRecinto = tamanioRecinto;
        this.cantidadMesas = cantidadMesas;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public int getTamanioRecinto() {
        return tamanioRecinto;
    }

    public int getCantidadMesas() {
        return cantidadMesas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public void setTamanioRecinto(int tamanioRecinto) {
        this.tamanioRecinto = tamanioRecinto;
    }

    public void setCantidadMesas(int cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract String generarCodigo(String codigo);

    @Override
    public String toString() {
        return "codigo=" + codigo + ", descripcion=" + descripcion + ", cantidadAsistentes=" + cantidadAsistentes + ", tamanioRecinto=" + tamanioRecinto + ", cantidadMesas=" + cantidadMesas + ", precio=" + precio;
    }
}
