/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package palindrome;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Palindrome {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar la frase: ");
        String frase = entrada.nextLine();
        
        
        /**
         * Ejemplos de frases
         * Anula la luna
         * La ruta natural
         */
        
        if (esPalindrome(frase) ){
            System.out.println("La frase corresponde a un Palidrome");
        } else {
            System.out.println("Upsss no es!!!");
        }
    }
    
    public static boolean esPalindrome(String frase){
        
        //se eliminan espacios y se convierte a minusculas
        frase = frase.replaceAll("\\s+","").toLowerCase();
        
        int i = 0;
        char c1;
        char c2;
        
        for (int j = frase.length()-1; j >= 0 ; j--) {
            c1 = frase.charAt(i);
            c2 = frase.charAt(j);
            
            System.out.println("C1:" + c1 +" y "+ "C2: " + c2);
           
            
            if (c1 != c2) {
                return false;
            }
            i++;
        }
        return true;
    }
}
