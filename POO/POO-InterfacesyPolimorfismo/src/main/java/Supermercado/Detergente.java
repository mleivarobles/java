/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermercado;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Detergente implements EsLiquido, ConDescuento {
    
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;
    

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
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
    
    
    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVoluman() {
        return (volumen);
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return (tipoEnvase);
    }

    @Override
    public void setDescuento(double desc) {
        this.descuento = desc;
    }

    @Override
    public double getDescuento() {
        return(descuento);
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * descuento/100.0); //asumo que es un % de descuento
    }

    @Override
    public String toString() {
        return "Detergente{" + "marca=" + marca + ", precio=" + precio + 
                ", volumen=" + volumen + ", tipoEnvase=" + 
                tipoEnvase + ", descuento=" + descuento +
                ", precio con descuento = " + getPrecioDescuento() + '}';
    }
}
