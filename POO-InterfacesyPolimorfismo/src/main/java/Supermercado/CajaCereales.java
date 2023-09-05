/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class CajaCereales implements EsAlimento {
    
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate fechaCaducidad;
    private int calorias;

    public CajaCereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }
    
    

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return (fechaCaducidad);
    }

    @Override
    public int getCalorias() {
        
        if (tipoCereal.toLowerCase().equals("espelta")){ //el metodo equals es case sensitive
            return 5;
        } else if (tipoCereal.equals("maiz")){
            return 8; 
        } else if (tipoCereal.equals("trigo")){
            return 12;
        } else {
            return 15;
        } 
    }

    @Override
    public String toString() {
        return "CajaCereales{" + "marca=" + marca + ", precio=" + 
                precio + ", tipoCereal=" + tipoCereal + ", fechaCaducidad=" + 
                fechaCaducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", "
                + "calorias=" + getCalorias() + '}';
    }
    
    
    
    
}
