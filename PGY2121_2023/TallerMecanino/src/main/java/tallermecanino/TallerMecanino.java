/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tallermecanino;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class TallerMecanino {

    public static void main(String[] args) {
        
        Taller taller1 = new Taller("Reparador");
        Scanner entrada = new Scanner(System.in);
        Categoria cat1 = new Categoria(1,"CityCar");
        Categoria cat2 = new Categoria(2,"TodoTerreno");
        int opcion = 0;
        
        CityCar city1 = new CityCar(11.5,"CBFH80","RGV",cat1);
        CityCar city2 = new CityCar(8,"HYJU90","MRX",cat1);
        
        TodoTerreno todo1 = new TodoTerreno(TipoTraccion.FOUR4WD,5.5,"LOLO67","MDR",cat2);
        TodoTerreno todo2 = new TodoTerreno(TipoTraccion.AWD,8.4,"NMYU12","MDR",cat2);
        
        do{
            System.out.println("\n---Menu Taller---");
            System.out.println("1.- Agregar vehiculo");
            System.out.println("2.- Actualizar modelo del vehiculo");
            System.out.println("3.- Imprimir todos los vehiculos");
            System.out.println("4.- Imprimir por categoria");
            System.out.println("5.- Eliminar vehiculo");
            System.out.println("6.- Salir");
            System.out.print("Ingresar una opcion: ");
            
            opcion = Integer.parseInt(entrada.nextLine());
            
            switch(opcion){
                case 1:
                    taller1.agregarVehiculo(city1);
                    taller1.agregarVehiculo(city2);
                    taller1.agregarVehiculo(todo1);
                    taller1.agregarVehiculo(todo2);
                    break;
                    
                case 2:
                    System.out.print("Ingresar patente: ");
                    String patente = entrada.nextLine();
                    
                    String modelo = new String();
                    
                    do{
                        System.out.print("Ingresar nuevo modelo: ");
                        modelo = entrada.nextLine();
                    }while(modelo.isEmpty());
                    
                    taller1.actualizarModelo(patente, modelo);
                    break;
                    
                case 3:
                    taller1.imprimirTodosVehiculos();
                    break;
                    
                case 4:
                    taller1.imprimirTodoTerrenos();
                    taller1.imprimirCityCar();
                    break;
                    
                case 5:
                    do{
                        System.out.print("Ingresar patente para eliminar: ");
                        patente = entrada.nextLine();
                    }while( patente.isEmpty());
                    
                    taller1.eliminarVehiculo(patente);
                    break;
                    
                case 6:
                    System.out.println("Saliendo del sistema!!!!");
                    break;
            }
        }while( opcion != 6);
    }
}
