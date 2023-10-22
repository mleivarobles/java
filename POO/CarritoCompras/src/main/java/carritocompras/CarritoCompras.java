/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carritocompras;

import Clases.*;

/**
 *
 * @author mario
 */
public class CarritoCompras {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Comida comida1 = new Comida("Arroz con pollo", 300);
        Bebida bebida1 = new Bebida("Pepsi Zero", "Pepsi", 1.5);
        
        bebida1.setCapacidad(0.75);
        System.out.println(bebida1);
    }
}
