/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnbpet;

import interfaces.Alojable;

/**
 *
 * @author cetecom
 */
public class Gato extends Mascota {
 
    private String pedigri;

    public Gato(String pedigri, String nombre, double peso, 
            int edad, int diasAlojamiento, String codigo, boolean supervision) {
        super(nombre, peso, edad, diasAlojamiento, codigo, supervision);
        this.pedigri = pedigri;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + " y tiene pedrigri " + pedigri;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getValorAlojamiento();
        return (precio + precio * Alojable.INCREMENTO_GATO/100);
    }
}
