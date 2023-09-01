/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sumaarraylist;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author mario
 */
public class SumaArrayList {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int i = 0;
        
        System.out.print("Largo del arreglo?: ");
        int largo = entrada.nextInt();
        
        //itero la cantidad de elementos del ArrayList
        do{
            System.out.print("Ingresar numero " + (i+1) + ": ");
            int numero = entrada.nextInt();
            numeros.add(numero);
            i++;
        }while(i < largo);
        
        //recorro ArrayList con for-each
        for (Integer numero : numeros) {
            System.out.print(numero + " ") ;
        }
        
        System.out.println("\nLa suma es: " + sumarArray(numeros) );
    }
    
    public static int sumarArray(ArrayList numeros){
        int suma = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            suma += (int) numeros.get(i);
        }
        return suma;
    }

}
