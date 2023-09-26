/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad222_herencia;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Actividad222_Herencia {

    public static void main(String[] args) {
        
        Instagram insta1 = new Instagram(1, "historia del abuelo",true,"Juan","123");
        Instagram insta2 = new Instagram(2, "Crack",false,"Pedro","4545");
        
        System.out.println(insta1.visualizar());
        System.out.println(insta2.visualizar());
        
        Date fechaHoy = new Date();
        
        Twitter tweety = new Twitter(1,"Cae el muero de berlin",fechaHoy,"Sofia","123");
        System.out.println(tweety.visualizar());
        
    }
}
