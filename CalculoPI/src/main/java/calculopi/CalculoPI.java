/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculopi;

/**
 *
 * @author mario
 */
public class CalculoPI {

    public static void main(String[] args) {
        /**
         * PI/4 = 1-1/3 + 1/+5 -1/7 + 1/9 - 1/11......
         */
        final int n = 100000000; //constante 100MM de terminos.
        double pi = 0.0;
        double termino = 0.0;
        
        for (int i = 0; i < n; i++) {
            termino = 1.0 / (2 * i + 1);
            if ( esPar(i) ) {
                pi += termino; //pi = pi + termino
            } else {
                pi -= termino;
            }
        }
        pi*=4; // pi = pi*4
        
        System.out.println("Math.pi: " + Math.PI);
        System.out.println("Aproxpi: " + pi);
    }
    
    public static boolean esPar(int n){
        return n % 2 == 0;
    }
}

