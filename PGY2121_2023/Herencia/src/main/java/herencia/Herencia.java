/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herencia;

/**
 *
 * @author mario
 */
public class Herencia {

    public static void main(String[] args) {
        
        Joya joya1 = new Joya(212,"Corona","Zafiro");
        Cadena cadena1 = new Cadena(24, 123,"Collar","oro");
        Anillo anillo1 = new Anillo(10, 890, "Anillo grande", "Plata");
        
        System.out.println(joya1);
        System.out.println(cadena1);
        System.out.println(anillo1);
    }
}
