/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.interfacesypolimorfismo;

import Supermercado.*;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Principal {

    public static void main(String[] args) {
       System.out.println("Hello World!");
        
       Detergente deter1 = new Detergente("Limpiatodo", 450);
        
       deter1.setTipoEnvase("Botella Plastico");
       deter1.setVolumen(1000);
       deter1.setDescuento(10);
       System.out.println(deter1);
       
       CajaCereales cereales1 = new CajaCereales("Quaker", 450, "maiz"); 
       cereales1.setCaducidad(LocalDate.of(2023, 8, 31));
       System.out.println(cereales1);
       
       Vino vino1 = new Vino("Santa Rita", "Vino Blanco", 17.00, 15300);
       vino1.setCaducidad(LocalDate.of(2023, 10, 25));
       
       System.out.println(vino1);
       
    }
}
