/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cafetera;

/**
 *
 * @author mario
 */
public class Cafetera {

    public static void main(String[] args) {
        Cafe latte = new Cafe("latte");
        Termo t1 = new Termo(1000,latte);
        
        System.out.println("Termo1:" + t1);
        
        t1.rellenarTermo(100);
        t1.servirTaza(10);
        System.out.println("La capacidad actual es de " + t1.getCapActual() );
        
        t1.rellenarTermo(900);
        t1.rellenarTermo(100);
    }
}
