/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaces.Mantencion;
import interfaces.Manejar;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Auto extends Vehiculo implements Manejar, Mantencion {
    
    private int nroPuertas;

    public Auto(int nroPuertas, String marca, String modelo, int nroRueda, int anno) {
        super(marca, modelo, nroRueda, anno);
        this.nroPuertas = nroPuertas;
    }
    

    @Override
    public void acelerar() {
        System.out.println("El auto acelera a 40 k/h");
    }

    @Override
    public void frenar() {
        System.out.println("El auto frena a 10 m/s");
    }

    @Override
    public void pasarCambios() {
        System.out.println("Este auto tiene 6 marchas!!!!");
    }

    @Override
    public void limpiar() {
        System.out.println("Al auto le toca aguita y jabón");
        
    }

    @Override
    public void encerar() {
        System.out.println("Su encerado");
    }

    @Override
    public void agregarAgua() {
        System.out.println("Hay que revisar si falta agua al radiador!!!");
    }

    @Override
    public String toString() {
        return super.toString() + " Auto{" + "nroPuertas=" + nroPuertas + '}';
    }
    
    
}
