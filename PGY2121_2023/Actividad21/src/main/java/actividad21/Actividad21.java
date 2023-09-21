/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividad21;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Actividad21 {

    public static void main(String[] args) {
        
        //Crear 2 listas
        ListaReproduccion punk = new ListaReproduccion("Punk rock");
        ListaReproduccion pop = new ListaReproduccion("Pop");
        
        //Creo 6 canciones
        Cancion cancion1 = new Cancion("Hola mundo", "Mango", 450);
        Cancion cancion2 = new Cancion("Cancion2", "Eclipse", 145);
        Cancion cancion3 = new Cancion("Cancion3", "Start", 328);
        
        Cancion cancion4 = new Cancion("Alicia", "Huxley", 1000);
        Cancion cancion5 = new Cancion("Cancion5", "Little", 390);
        Cancion cancion6 = new Cancion("Cancion6", "Mega", 320);
        
        //agrego 3 canciones a cada lista,
        
        punk.agregarCancion(cancion1);
        punk.agregarCancion(cancion2);
        punk.agregarCancion(cancion3);
        
        pop.agregarCancion(cancion4);
        pop.agregarCancion(cancion5);
        pop.agregarCancion(cancion6);
        
        // System.out.println(punk);
        // System.out.println(pop);
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("\n-----Menu Reproduccion-----");
            System.out.println("1.- Mostrar canciones lista " + punk.getNombre());
            System.out.println("2.- Mostrar canciones lista " + pop.getNombre());
            System.out.println("3.- Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Lista1");
                    break;
                case 2: 
                    System.out.println("Lista2");
                    break;
                case 3:
                    System.out.println("Adios!!!");
                    break;
        }
        }while( opcion !=3 );
    }
}
