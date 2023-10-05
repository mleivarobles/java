/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Polimorfismo {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Pez pez = new Pez("pez");
        Ave ave = new Ave("ave");
        Pez pecesito = new Pez("pecesito");
        Ave avecita = new Ave("avecita");
        Pez pecesote = new Pez("pecesote");
        
        animales.add(pez);
        animales.add(ave);
        animales.add(pecesito);
        animales.add(avecita);
        animales.add(pecesote);
        
        
        for (int i = 0; i < animales.size(); i++) {     
            animales.get(i).moverse();
       
        }
        
        
        
        
    }
}
