/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package matrizcaracol;

import java.util.Random;

/**
 *
 * @author mario
 */
public class MatrizCaracol {

    public static void main(String[] args) {
        int n = 5; //matriz cuadrada nxn
        /**
         * 1  2  3  4  5
         * 16 17 18 19 6
         * 15 24 25 20 7
         * 14 23 22 21 8
         * 13 12 11 10 9
          */
        
        
        int[][] matriz = new int[n][n];
        
        primeraLinea(matriz);
        imprimirMatriz(matriz);
        
    }
    
    public static void primeraLinea(int[][] matriz){
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[0][j] = j+1;
        }
    }
    
    public static void generarMatrizAleatoria(int[][] matriz){
        int n = matriz[0].length;
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); //0..99
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        int n = matriz[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println("");
        }
                
    }
    
}
