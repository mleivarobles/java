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
public class Vino implements ConDescuento, EsLiquido, EsAlimento {
    
    private String marca;
    private String tipoVino;
    private double gradosAlcoholicos;
    private double precio; 
    
    private double descuento;
    private double volumen;
    private String tipoEnvase;
    private LocalDate fechaCaducidad;
    
  

    public Vino(String marca, String tipoVino, double gradosAlcoholicos, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcoholicos = gradosAlcoholicos;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public double getGradosAlcoholicos() {
        return gradosAlcoholicos;
    }

    public void setGradosAlcoholicos(int gradosAlcoholicos) {
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vino{" + "marca=" + marca + ", tipoVino=" + tipoVino +
                ", gradosAlcoholicos=" + gradosAlcoholicos +
                ", precio=" + precio + ", descuento=" + descuento + "\n" +
                ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase +
                ", fechaCaducidad=" + fechaCaducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
                ", calorias=" + getCalorias() +'}';
    }
    
    @Override
    public void setDescuento(double desc) {
        this.descuento = desc;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
            return precio - (precio * descuento/100.0); //asumo que es un % de descuento
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVoluman() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public int getCalorias() {
        return (int) (gradosAlcoholicos * 10); //hago ub cast de double a int
    }
    
}
