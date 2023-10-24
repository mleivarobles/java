/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hashmapuso;

import java.util.HashMap;

/**
 *
 * @author mario
 */
public class HashMapUso {

    public static void main(String[] args) {
        /**
         * Estructura de datos dinamicas (Heredan de la SuperClase Collection)
         * Los datos se guardan en memoria usando la estructura (key, value) 
         * similar a los Dict() de Python
         */
        
        HashMap<Integer, String> hash = new HashMap<>(); 
        
        hash.put(4, "Juan");
        hash.put(2, "Pedro"); 
        hash.put(3,"Sandra"); // si pongo la misma clave guarda el ultimo ingresado
        
        System.out.println(hash);
        
        System.out.println(hash.get(2));
        System.out.println(hash.remove(5));
        
        System.out.println("El largo del hash es " + hash.size());
        System.out.println("");
        
        //recorro el hash por medio de un for-each
        //imprimo el valor asocido al key.
        
        for (Integer key : hash.keySet()) {
            System.out.println(hash.get(key));
        }
        
    }
}
