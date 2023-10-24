/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author cetecom
 */
public interface Alojable {
    
    public double VALOR_DIA_ALOJAMIENTO = 25000;
    public double INCREMENTO_PERRO = 7;
    public double INCREMENTO_GATO = 5;
    public double DESCUENTO_CONEJO = 7;
    
    public double calcularPrecioFinal();
}
