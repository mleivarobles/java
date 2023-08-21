/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vectores2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Vectores2 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        rellenarMatrizAleatoria(matriz);
        imprimirMatriz(matriz);
        
        while(!salir){
            System.out.println("-----------Menu------------");
            System.out.println("1.- Suma diagonal principal");
            System.out.println("2.- Suma diagonal secundaria");
            System.out.println("3.- Suma filas");
            System.out.println("4.- Suma columnas");
            System.out.println("5.- promedio");
            System.out.println("6.- Salir!!!!");
            System.out.print("Elije una opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: System.out.println("La diagonal principal suma " + sumaDiagonalPrincipal(matriz));
                    break;
                case 2: System.out.println("La diagonal secundaria suma " + sumaDiagonalSecundaria(matriz));
                    break;
                case 3: sumaFilas(matriz);
                    break;
                case 4: sumaColumnas(matriz);
                    break;
                case 6: salir = true;
                    break;
            }
        }
    }
    
    public static void rellenarMatrizAleatoria(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeroAleatorio();
            }
        }
    }
    
    public static int generarNumeroAleatorio(){
        Random random = new Random();
        return random.nextInt(100); // entre 0 y 100;
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int[] i : matriz) {
            System.out.println(Arrays.toString(i));
        }
    }
    
    public static int sumaDiagonalPrincipal(int[][] matriz){
        int suma = 0;
        int contador = 0;
        for (int[] m : matriz) {
            suma += m[contador];
            contador++;
        }
        return suma;
    }
    
    public static int sumaDiagonalSecundaria(int[][] matriz){
        int suma = 0;
        int contador = matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            contador--;
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == contador){
                    suma+= matriz[i][j];
                }
            }
        }
        return suma;
    }
    
    public static void sumaFilas(int[][] matriz){
        int suma;
        int fila = 0;
        for (int[] i : matriz) {
            fila++;
            suma = 0;
            for (int j : i) {
                suma+=j;
                }
            System.out.println("La suma de la fila " + fila + " es " + suma);
        }                  
    }
    
    public static void sumaColumnas(int[][] matriz){
        int columnas = matriz[0].length;
        int sumaColumnas[] = new int[columnas];
        int filas = 0;
        int suma = 0;
        for (int[] i : matriz) {
            for (int j : i) {
                suma+=j;
                
            }
            
        }
    }
}
