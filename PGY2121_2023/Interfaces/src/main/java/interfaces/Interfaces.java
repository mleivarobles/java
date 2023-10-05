/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package interfaces;

/**
 *
 * @author mario
 */
public class Interfaces {

    public static void main(String[] args) {
         
        Mascota perro = new Mascota("Perro","Doncan",15000);
        Mascota perro2 = new Mascota("Gato","Azrael",10000);
        
        Joya anillo = new Joya("Anillo",5000);
        Joya aro = new Joya("Aros",20000);
        
        System.out.println("Precio Doncan: " + perro.calculaPrecioFinal());
        System.out.println("Precio Azrael: " + perro2.calculaPrecioFinal());
        System.out.println("");
        System.out.println("Precio anillo: " + anillo.calculaPrecioFinal());
        System.out.println("Precio aros: " + aro.calculaPrecioFinal());
        
    }
}
