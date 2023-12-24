/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author mario
 */
public final class Desktop extends Equipo {
    
    private double potenciaFuente;
    private String factorForma;
    public static int contador = 0;

    public Desktop(String codigo, double potenciaFuente, String factorForma, 
            String descripcionModelo, String cpu, int discoDuro, 
            int cantidadRam, double precio) {
        
        super(codigo, descripcionModelo, cpu, discoDuro, cantidadRam, precio);
        this.potenciaFuente = potenciaFuente;
        this.factorForma = factorForma;
    }

    public double getPotenciaFuente() {
        return potenciaFuente;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setPotenciaFuente(double potenciaFuente) {
        this.potenciaFuente = potenciaFuente;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }
    
    @Override
    public String generarCodigo(String codigo) {
        if(codigo.isBlank()){
            Desktop.contador ++;
            DecimalFormat df = new DecimalFormat("0000");
            return ("desk"+df.format(Desktop.contador));
        }else{
            return codigo;
        } 
    }

    @Override
    public String toString() {
        return "Desktop{" + super.toString()+ ", potenciaFuente=" + potenciaFuente + 
                ", factorForma=" + factorForma + '}';
    }
    
    
    
}
