/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herenciaconcesionaria;

import vehiculos.*;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Auto a = new Auto();
        Moto m = new Moto();
        
        Vehiculo v = new Vehiculo();
        System.out.println(v.marca);
        
    }
}
