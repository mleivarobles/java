
package adivinanumero;

/**
 *
 * @author mario
 */
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Piensa en un número entre 1 y 100, yo intentaré adivinarlo.");
            
            int limiteInferior = 1;
            int limiteSuperior = 100;
            int intentos = 0;
            boolean adivinado = false;
            
            while (!adivinado) {
                int estimacion = (limiteInferior + limiteSuperior) / 2;
                intentos++;
                
                System.out.println("¿Es " + estimacion + " tu número? (s para sí, m para menor, a para mayor)");
                String respuesta = scanner.nextLine().toLowerCase();
                
                if (respuesta.equals("s")) {
                    System.out.println("¡Lo adiviné en " + intentos + " intentos!");
                    adivinado = true;
                } else if (respuesta.equals("m")) {
                    limiteSuperior = estimacion - 1;
                } else if (respuesta.equals("a")) {
                    limiteInferior = estimacion + 1;
                } else {
                    System.out.println("Respuesta no válida. Por favor, responde con 's', 'm' o 'a'.");
                }
            }
        }
        
    }
}