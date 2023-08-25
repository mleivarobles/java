/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package excepcion;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Excepcion {

    public static void main(String[] args) {
        int valor;                    
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor?: ");
        
        try {
            valor = entrada.nextInt();
            resultado = 10 / valor;
        } catch (Exception e) {
            System.out.println("Se ha producido un error " + e.getMessage());
            
        } finally {
            System.out.println(resultado);
        }
       
    }
}
