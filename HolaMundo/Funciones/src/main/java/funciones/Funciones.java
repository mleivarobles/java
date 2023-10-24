/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package funciones;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Funciones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //int[] vueltas = {52,54,53,51,51}; //primera forma
        int[] vueltas = new int[5]; // largo 5, 0,1,2,3,4
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i< vueltas.length;i++){
            System.out.print("Ingresa el tiempo de la vuelta " + (i+1) + ": ");
            vueltas[i] = sc.nextInt();
        }
        
        mostrarArreglo(vueltas);
        System.out.println("El promedio de los tiempo es " + calcularPromedio(vueltas));
        System.out.println("Hay " + calcularVueltasSuperanPromedio(vueltas) + " vueltas sobre el promedio");
        
    }
    
    public static void mostrarArreglo(int[] array){
        for(int i=0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static double calcularPromedio(int[] array){
        int suma = 0;
        
        for(int i=0; i < array.length; i++){
            suma += array[i];
        }
        
        return ( (double) suma / array.length);
    }
    
    public static int calcularVueltasSuperanPromedio(int[] array){
        int contador = 0;
        double promedio = calcularPromedio(array);
        for (int i = 0; i < array.length; i++) {
            if( array[i]> promedio ){
                contador ++;
            }
        }
        return contador;
    }
}
