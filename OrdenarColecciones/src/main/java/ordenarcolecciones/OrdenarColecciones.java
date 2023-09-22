/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ordenarcolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mario
 */
public class OrdenarColecciones {

    public static void main(String[] args) {
        
        //creo lista de numeros. Uso el tipo de dato Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(-5);
        numeros.add(90);
        numeros.add(34);
        numeros.add(0);
        
        //creo lista de String
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pedro");
        nombres.add("Sofia");
        nombres.add("Andrea");
        nombres.add("Bella");
        
        //creo lista de Persona
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1545,"Juan","Perez",45));
        personas.add(new Persona(100,"Magda","Soto",22));
        personas.add(new Persona(1900,"Ana","Herrera",8));
        personas.add(new Persona(65,"Luis","Robles",78));
        
        //imprimo el contenido de ArrayList de las lista de numeros, 
        //nombres y personas con el mismo metodo estatico mostrarLista()
        
        mostrarLista(numeros);
        mostrarLista(nombres);
        mostrarLista(personas);
        
        //ordenar las listas con metodos de ordenamiento ya implementados en java
        //ordena la lista y la devuelve ordenada
        System.out.println("");
        Collections.sort(numeros);
        mostrarLista(numeros);
        
        Collections.sort(nombres);
        mostrarLista(nombres);
        
        //El metodo sort no puede ordenas objetos del tipo objeto (clase Persona)
        //Hay que decirle como ordenarlo (interfaz comparable). Revisar Clase Persona
        Collections.sort(personas);
        
        //Ahora la lista persona se ordena por rut (de menor a mayor)
        //Ahora la lista persona se ordena por nombre (a..z)
        mostrarLista(personas);
        
    }
    /**
     * List<?> lista
     * En este metodo recibo como parametro una Lista de cualquier 
     * tipo de implememtacion (ArrayList, LinkedList, List....)
     * El simbolo ? es un wildcard
     * @param lista
    */
    
    public static void mostrarLista(List<?> lista){
        
        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
