/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vectores;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Vectores {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        int[] vector = new int[4];
        
        vector[0] = 7;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 8;
                
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresar N° " + (i+1) +": ");
            vector[i] = ingreso.nextInt();
        }
        
        for (int i : vector) {
            System.out.print(i + " ");
        }
    }
}
