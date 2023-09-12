/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package colecciones_arraylist;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Colecciones_ArrayList {

    public static void main(String[] args) {
        /**
         * Los array son estructuras de datos no muteable 
         * y de larho estaticp
        */
        //array de enteros de largo5
        // posiciones 0,1,2,3,4
        int[] vector = new int[5]; //array de enteros
        String[] alumnos = new String[10]; // array de string
        
        vector[0] = 45;
        vector[1] = 22;
        vector[2] = 3;
        vector[4] = 50;
        //vector[5] = 50; La posición 5 es invalido
        int suma = 0;
        
        //recorro el vector con for de contador
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento[" + i+"]: " + vector[i]);
            suma+= vector[i];
        }
        System.out.println("Suma del vector: " + suma + "\n");
        
        // recorro el vector con for-each
        for (int i : vector) {
            System.out.println(i);
        }
        
        
        alumnos[0] = "Pedro";
        alumnos[6] = "Sofia";
        alumnos[8] = "Juan";
        
        System.out.println("");
        
        for (String alumno : alumnos) {
            if (alumno != null){
                System.out.println(alumno);
            }
        }
        
        /**
         * Los ArrayList es una implementación de la interfaz Lis()
         */
        
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.println("\n<> ArrayList <>");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Tomas");
        nombres.add("Judas");
        nombres.add("Pablo");
        
        //recorre con for con contador
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        //recorre con for-each
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        //busqueda con contains y indexOf
        String buscado = "Tomas";
        if( nombres.contains(buscado)){
            System.out.println(buscado + " existe y está en el indice " + nombres.indexOf(buscado));
        }
        
        System.out.println("La lista de nombres tiene " + nombres.size() + " elementos");
        
        String eliminado = "Judas";
        
        if( nombres.contains(eliminado)){
            nombres.remove(eliminado);
            System.out.println("El elemento " + eliminado + " fue eliminado");
        } else {
            System.out.println("El elemento " + eliminado + " no fue encontrado");
        }
        
        System.out.println("La lista de nombres tiene " + nombres.size() + " elementos");
    }
}
