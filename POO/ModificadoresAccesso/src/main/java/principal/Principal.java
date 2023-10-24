/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import mascota.*;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    Ave pinguino = new Ave("Pinguino",2,false,"tierra");
    Ave cuervo = new Ave("Cuervo",2,true,"Aire");
    Perro doncan = new Perro("Quiltro", 11, "Mediano");
    
    doncan.agregarAmigo(pinguino);
    doncan.agregarAmigo(cuervo);
    
    
    System.out.println(doncan);
    
    
    }   
}
