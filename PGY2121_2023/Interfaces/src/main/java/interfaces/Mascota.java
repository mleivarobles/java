/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author mario
 */
public class Mascota implements PorPagar {
    
    private String especie;
    private String nombre;
    private double valor;

    public Mascota(String especie, String nombre, double valor) {
        this.especie = especie;
        this.nombre = nombre;
        this.valor = valor;
    }
    
    @Override
    public double calculaPrecioFinal() {
        
        return valor * (1-DESCUENTO_MASCOTA); 
    }
    
}
