/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mario
 */
public abstract class Equipo {
    
    private String codigo; //para identificar cada equipo de manera unica
    private String descripcionModelo;
    private String cpu;
    private int discoDuro;
    private int cantidadRam;
    private double precio;

    //nuevo equipo
    public Equipo(String codigo, String descripcionModelo, String cpu, int discoDuro, 
            int cantidadRam, double precio) {
        this.codigo = generarCodigo(codigo);
        this.descripcionModelo = descripcionModelo;
        this.cpu = cpu;
        this.discoDuro = discoDuro;
        this.cantidadRam = cantidadRam;
        this.precio = precio;
    }
    
   
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcionModelo() {
        return descripcionModelo;
    }

    public String getCpu() {
        return cpu;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcionModelo(String descripcionModelo) {
        this.descripcionModelo = descripcionModelo;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract String generarCodigo(String codigo);

    @Override
    public String toString() {
        return "codigo=" + codigo + ", descripcionModelo=" + 
                descripcionModelo + ", cpu=" + cpu + ", discoDuro=" + discoDuro + 
                ", cantidadRam=" + cantidadRam + ", precio=" + precio;
    }
    
}
