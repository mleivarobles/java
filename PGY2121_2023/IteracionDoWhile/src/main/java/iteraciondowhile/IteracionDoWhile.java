/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iteraciondowhile;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class IteracionDoWhile {

    public static void main(String[] args) {
        /**
         * Escriba un programa que entregue todos los divisores del 
         * número entero ingresado por el usuario
         */
        
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;
        int numero = 0;
        
        do{
            System.out.print("Ingresar el numero: ");
            String entrada = scanner.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Numero no valido!!!!!");
            }
        }while(!numeroValido);
        
        int contador = 1;
        while( contador <= numero){
            if (numero % contador == 0){
                System.out.print(contador + " ");
            }
        contador++;
        }
    }
}
