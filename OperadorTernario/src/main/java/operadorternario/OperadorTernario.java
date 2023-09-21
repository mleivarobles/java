/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadorternario;

/**
 *
 * @author mario
 */
public class OperadorTernario {

    public static void main(String[] args) {
        /**
         * El operador ternario permite evaluar en una linea
         * expresion IF-ELSE
         * Sintaxis.
         * 
         * expr_logica ? valor_si_true : valor_si_false
         */
        
        Persona p1 = new Persona("Juan Perez", 45, 1);
        Persona p2 = new Persona("Fabiola Soto", 24, 2);
        Persona p3 = new Persona("Margarita Lopez", 29, 3);
        Persona p4 = new Persona("Marcela Gonzalez", 22, 0);
        
        p1.presentar();
        p2.presentar();
        p3.presentar();
        p4.presentar();
    }
}
