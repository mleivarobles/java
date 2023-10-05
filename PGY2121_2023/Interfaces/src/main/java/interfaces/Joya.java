/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author mario
 */
public class Joya implements PorPagar {
    
    private String nombre;
    private double valor;

    public Joya(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    @Override
    public double calculaPrecioFinal() {
        double precioFinal = valor;
        
        if ( valor >= 10000){
            precioFinal = valor*(1-DESCUENTO_JOYA);
        }
        return precioFinal;
    }
    
}
