/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class NumeroPrimo {
    
    public static boolean esPrimo(int numero){
        boolean esNumeroPrimo = true;
        
        for(int i = 2; i< numero; i++){
            if ( (numero%i) == 0){
                esNumeroPrimo = false; //si encuentro que es divisible no es primro y salgo del bucle
                break;
            }
        }
        return esNumeroPrimo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero: ");
        int numero = sc.nextInt(); 
        
        if( esPrimo(numero) ){
            System.out.println("El numero " + numero + " es primo");
        } else{
            System.out.println("El numero " + numero + " no es primo");
        }
        
    }
}
