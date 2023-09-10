/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clasepila;

import java.util.Random;

/**
 *
 * @author mario
 */
public class ClasePila {

    public static void main(String[] args) {
        Pila pila1 = new Pila();
        Random random = new Random();
        pila1.desencolar();
        
        for (int i = 0; i < 10; i++) {
            pila1.encolar( random.nextInt(100));
        }
    }
}
