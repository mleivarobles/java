/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package listasbasico;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Lista {
    
    /**
     * Es un ejemplo de uso de LinkedList.  
     * @param args
     */
    

    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresar datos: ");
            String valor = entrada.next();
            //lista.push(valor); //hace una pila
            lista.add(valor); // hace una fila
        }
        
        // for each para recorrer la lista
        for (String valor : lista) {
            System.out.print(valor + " -> ");
        }
        
        System.out.println("La lista tiene " + lista.size() + " elementos");
        
        String buscar = "Sandra";        
        if( lista.contains(buscar)){
            System.out.println(buscar + " está en la posicion " + lista.indexOf(buscar));
        } else {
            System.out.println(buscar + " no está en la lista");
        }
        
        String eliminar = "Juan";
        
        if (lista.remove(eliminar)){
            System.out.println("El valor " + eliminar + " fue eliminado");
        } else{
            System.out.println("Error en la eliminación");
        }
        
        String agregar = "Francisca";
        
        lista.add(2, agregar); //agrego un elemento en la 2da posicipn
        
        //for con contador para recorrer la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " -> ");
        }
        
       System.out.println("La lista tiene " + lista.size() + " elementos");
    }
}
