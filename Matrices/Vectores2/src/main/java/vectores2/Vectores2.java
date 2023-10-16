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
        int[][] matriz = new int[5][5];
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        /**
         * Aclaracion imporante: 
         * La matriz se pasa como referencia a los metodos estaticos.
         * No es necesario devolver la matriz modificada.
        */
        
        rellenarMatrizAleatoria(matriz);
        imprimirMatriz(matriz);
        
        while(!salir){
            System.out.println("-----------Menu------------");
            System.out.println("1.- Suma diagonal principal");
            System.out.println("2.- Suma diagonal secundaria");
            System.out.println("3.- Suma filas");
            System.out.println("4.- Suma columnas");
            System.out.println("5.- Promedio");
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
                case 5: calcularPromedio(matriz);
                    break;
                case 6: salir = true;
                    break;
            }
        }
    }
    
    public static void calcularPromedio(int[][] matriz){
        double suma = 0;
        int contador = 0;
        
        for (int[] fila : matriz) {
            for (int i : fila) {
                suma+=i;
                contador++;
            }
        }
        double promedio = (suma / contador);
        System.out.println("El promedio de la matriz es: " + promedio );
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
        /**
         * [53, 56, 15, 63]
         * [48, 3, 76, 43]
         * [22, 48, 85, 84]
         * [75, 16, 84, 83]
         */        
        int columnas = matriz[0].length;
        int sumaColumnas[] = new int[columnas]; //vector de suma de columnas
        int columna = 0;
        
        for (int[] fila : matriz) { //recorro fila
            for (int i : fila) {    // recorro columna por columna
                sumaColumnas[columna]+= i;
                columna++;
            }
            columna = 0;
        }
        
        System.out.print("\nSuma=[ ");
        for (int i : sumaColumnas) {
            System.out.print(i +" ");
        }
        System.out.print("]\n");
    }
}
