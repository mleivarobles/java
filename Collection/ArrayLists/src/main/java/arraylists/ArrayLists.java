/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arraylists;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ArrayLists {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    //agregar elementos a la lista
    ArrayList<Persona> lista = new ArrayList<>();
    lista.add(new Persona(1,"Juan",40));
    lista.add(new Persona(2,"Pedro",20));
    lista.add(new Persona(3,"Diego",10));
    lista.add(new Persona(4,"Elena",15));
    
    //recorre por indices
    for(int i =  0; i < lista.size(); i++){
        System.out.println(lista.get(i).getNombre());
    }
    
        System.out.println("");
    //recorre elemento por elemento for-each
    for(Persona p: lista){
        System.out.print(p.getNombre() + " -> ");
    }
    
    
    }
}
