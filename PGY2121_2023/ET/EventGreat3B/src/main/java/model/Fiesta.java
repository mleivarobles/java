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
public final class Fiesta extends Evento {
    
    private boolean tieneAlcohol;
    private int nroDj;
    public static int contador = 0;

    public Fiesta(String codigo, boolean tieneAlcohol, int nroDj, String descripcion, int cantidadAsistentes, int tamanioRecinto, int cantidadMesas, double precio) {
        super(codigo, descripcion, cantidadAsistentes, tamanioRecinto, cantidadMesas, precio);
        this.tieneAlcohol = tieneAlcohol;
        this.nroDj = nroDj;
    }
    
    @Override
    public String generarCodigo(String codigo) {
        if(codigo.isBlank()){
            Fiesta.contador ++;
            DecimalFormat df = new DecimalFormat("0000");
            return ("fies"+df.format(Fiesta.contador));
        }else{
            return codigo;
        } 
    }

    public boolean isTieneAlcohol() {
        return tieneAlcohol;
    }

    public int getNroDj() {
        return nroDj;
    }

    public void setTieneAlcohol(boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    }

    public void setNroDj(int nroDj) {
        this.nroDj = nroDj;
    }
    
    @Override
    public String toString() {
        return "Fiesta{" + super.toString() +" tieneAlcohol=" + tieneAlcohol + ", nroDj=" + nroDj + '}';
    }
}
