/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package collatz;

import java.util.Scanner;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Collatz {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar numero para calcular secuencia de Collatz: ");
        int numeroInicial = entrada.nextInt();
        
        System.out.println("Secuencia de Collatz para " + numeroInicial + ":");
        calcularCollatz(numeroInicial);
    }
    
    public static void calcularCollatz(int numero) {
        while (numero != 1) {
            System.out.print(numero + " -> ");
            
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = 3 * numero + 1;
            }
        }
        
        System.out.println(numero); // Agregar el último número, que es 1
    }
}
