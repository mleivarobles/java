/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package excepcion;

import java.util.InputMismatchException;
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
        } 
        catch (InputMismatchException e){
            System.out.println("Ingreso no valido. Debe ser un entero!!!!");
                
        }
        catch(ArithmeticException e){
            System.out.println("Operación invalida. Division por cero");
            
        }
        catch (Exception e) {
            System.out.println("Se ha producido un error " + e.getMessage());
            e.printStackTrace(System.out); //tambien puede seguir el flujo System.err
            
        } finally {
            System.out.println(resultado);
        }
       
    }
}
