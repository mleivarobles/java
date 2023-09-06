/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaces.Manejar;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Moto extends Vehiculo implements Manejar {
    
    private boolean tieneAlforjas;

    public Moto(boolean tieneAlforjas, String marca, String modelo, int nroRueda, int anno) {
        super(marca, modelo, nroRueda, anno);
        this.tieneAlforjas = tieneAlforjas;
    }
    
    @Override
    public void acelerar() {
        System.out.println("La moto acelera de 0 a 100 en 4 segundos");
    }

    @Override
    public void frenar() {
        System.out.println("La moto frena en seco");
    }

    @Override
    public void pasarCambios() {
        System.out.println("La moto pasa cambios con el pie!!!");
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "tieneAlforjas=" + tieneAlforjas + '}';
    }
    
    
    
}
