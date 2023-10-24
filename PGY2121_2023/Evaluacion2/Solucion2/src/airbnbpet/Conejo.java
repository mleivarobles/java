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
public class Conejo extends Mascota {
    
    private String comida;

    public Conejo(String comida, String nombre, double peso, 
            int edad, int diasAlojamiento, String codigo, boolean supervision) {
        super(nombre, peso, edad, diasAlojamiento, codigo, supervision);
        this.comida = comida;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + " y come " + comida;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getValorAlojamiento();
        return( precio - precio * Alojable.DESCUENTO_CONEJO/100);
    }
    
}
