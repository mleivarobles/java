/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package numeroperfecto;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class NumeroPerfecto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresar el numero: ");
        int numero = teclado.nextInt();
        
        
        if ( esPerfecto(numero )){
            System.out.println("El numero " + numero + " es perfecto");
        } else{
            System.out.println("El numero no es perfecto");
        }
    }
    
    public static boolean esPerfecto(int numero){
        int suma = 0;
        int contador = 1;
        
        while(contador < numero){
            //calculo si es divisor
            if( numero % contador == 0){
                suma+= contador;
            }
            contador++;
        }
        
        return suma == numero;
    }
}
