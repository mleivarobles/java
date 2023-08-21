/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayordenamiento;

import java.util.Random;

/**
 *
 * @author mario
 */
public class ArrayOrdenamiento {

    public static void main(String[] args) {
        int[] array = new int[100000];
        
        llenarArray(array);
        //imprimirArray(array);
        
        long inicio = System.currentTimeMillis();
        ordenarBubbleSort(array); //demora 14 segundos para 100mil registros.
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" segundos");
        
        //imprimirArray(array);
       
    }
    
    public static void ordenarBubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void llenarArray(int[] array){
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
    }
    
    public static void imprimirArray(int[] array){
        for (int i : array) {
            System.out.println(i +" ");
        }
    }
}
