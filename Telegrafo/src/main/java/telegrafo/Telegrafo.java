/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package telegrafo;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Telegrafo {

    public static void main(String[] args) {
        /**
         * Han solicitado calcular el costo que tiene enviar un mensaje por telégrafo. Se conoce:
            o Cada letra cuesta $100
            o Los caracteres especiales que no sean letras cuestan $300
            o Los dígitos tienen un valor de $20.
            o Los espacios no tienen valor.
            El mensaje para enviar es un string, y las letras como acentos y otros (ñ, á, é, í, ó, ú) se
            consideran caracteres especiales.
            
            * Por ejemplo: 
            * Mensaje: Tengo 2 hijos y 1 perro quiltro!!!
            Salida: Enviar el mensaje tiene un valor de $3800 pesos
         */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la frase: ");
        String entrada = scanner.nextLine();
        int valor  = calcularValor(entrada);
        
        System.out.println("Enviar el mensaje tiene un valor de $"+ valor + " pesos");
    }
    
    public static int calcularValor(String entrada){
        final String letrasMin ="abcdefghijklmnñopqrstuvwxyz";
        final String letras = letrasMin.concat(letrasMin.toUpperCase());
        final String digitos = "0123456789";
        
        String entradaSinEspacio = entrada.replace(" ", "");
        int valor = 0;
        
        for (int i = 0; i < entradaSinEspacio.length(); i++) {
            char c =  entradaSinEspacio.charAt(i);
            
            if (letras.indexOf(c) >=0 )  {
                    valor+= 100;
               }else if(digitos.indexOf(c) >=0){
                    valor+=20;
               }else  {
                   valor+=300;
            }
        }
        return valor;
    }
}
