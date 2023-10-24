/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vehiculoherencia;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Bicicleta bici1 = new Bicicleta(8,0);
        Automovil auto1 = new Automovil(1600.00, 34);
        
        System.out.println(auto1.toString());
        System.out.println(bici1.toString());
        
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        
        while(!salir){
            System.out.println("\nVEHÍCULOS");
            System.out.println("1.- Recorre con la bicicleta​");
            System.out.println("2.- Levanta la rueda delantera con la bicicleta​");
            System.out.println("3.- Recorre con el auto​");
            System.out.println("4.- Derrapa con el auto​");
            System.out.println("5.- Ver kilometraje de la bicicleta​");
            System.out.println("6.- Ver kilometraje del auto​");
            System.out.println("7.- Ver kilometraje total​");
            System.out.println("8.- Salir​");
            System.out.print("Elige una opción (1-8):");
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1: bici1.recorrerVehiculo();
                    break;
                case 2: bici1.levantarRuedas();
                    break;
                case 3: auto1.recorrerVehiculo();
                    break;
                case 4: auto1.derrapar();
                    break;
                case 5: bici1.verKilometrajeVehiculo();
                    break;
                case 6: auto1.verKilometrajeVehiculo();
                    break;
                case 7: System.out.println("Kilometros totales; " + Vehiculo.kilometrosTotales);
                    break;
                case 8: salir = true;
                    break;
            }
        }
    }     
}
