/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pruebatrainne;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class PruebaTrainne {
    
    /**
     * Supong un sistema de reserva de asientos de un teatro.
     * El teatro cuenta con 10 filas de 10 asientos cada una. Se necesitas
     * desarrollar un sistema (sin uso de BD, unicamente manejo de datos en forma
     * logica) que permita llevar a cabo lo siguiente.
     * 
     * 1.- Cargar el mapa de filas y asientos. Marque con una "X" los asientos
     * ocupados y con una "L" los libres. Al iniciar el programa todos los asientos
     * son libres.
     * 
     * 2.- Manejar la reseva de asiento contemplando que un asiento
     * solo puede ser reservado si se encuentra en estado "L". Si se encuentra
     * en estado "X" se debera permitir al comprado elegir otro asiento.
     * 
     * 3.- Para finalizar el programa se deberá ingresar un valor en particular.
     * Considerar que no existe una cantidad de veces exacta que el programa
     * se puede ejecutar.
     * 
     * 4.- Contemplar que solo exisre 10 filas y 10 asientos. No se puede vender
     * asientos fuera de esa numeración.
     * @param args 
     */

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Teatro municipal = new Teatro("Municipal");
        int opcion = 0;
        
        
        
        do{
            System.out.println("\nPrueba Trainne Junior");
            System.out.println("1.- Mostrar asientos");
            System.out.println("2.- Reservar asientos");
            System.out.println("3.- Salir");
            System.out.print("Ingresar una opcion:");
            opcion = Integer.parseInt(entrada.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("\nMostrar asientos");
                    municipal.mostrarButacas();
                    break;
                case 2:
                    System.out.println("\nReservar asientos");
                    municipal.reservarAsiento();
                    
                    break;
                case 3:
                    System.out.println("\nAdios!!!");
                    break;
            }
            
        }while( opcion !=3 );
        
    }
}
