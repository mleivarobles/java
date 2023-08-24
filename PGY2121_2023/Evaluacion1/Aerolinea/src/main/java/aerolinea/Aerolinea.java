/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aerolinea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Aerolinea {

    public static void main(String[] args) {
        int opcion = 0;
        Pasajero pasajero = new Pasajero();
        Pasaje pasaje = new Pasaje();
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("\n-----Menu Aerolinea-----");
            System.out.println("1.- Ingresar Pasajero");
            System.out.println("2.- Ingresar Pasaje");
            System.out.println("3.- Información de Pasaje");
            System.out.println("4.- Salir");
            System.out.print("Ingresar una opcion=");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: ingresarPasajero(pasajero);
                    break;
                case 2: ingresarPasaje(pasaje, pasajero);
                    break;
                case 3: imprimirPasaje(pasaje);
                    break;
           }
            
        }while(opcion != 4);
        
        entrada.close();
        
    }
    
    public static void imprimirPasaje (Pasaje pasaje){
        System.out.println("Información Pasaje");
        System.out.println("Fecha:" +  pasaje.getFechaPasaje());
        System.out.println("Valor: " + pasaje.getValor());
        System.out.println("Valor con regargo: " + pasaje.calcularRecargo());
        System.out.println("Pasajero");
        System.out.println(pasaje.getPasajero());
    }
    
    public static void ingresarPasaje(Pasaje pasaje, Pasajero pasajero){
        Scanner entrada = new Scanner(System.in);
        int nroVuelo = 0;
        String destino, fecha;
        
        System.out.print("\nNro. Vuelo:");
        nroVuelo = entrada.nextInt();
        entrada.nextLine(); //consumo el salto de linea \n
        
        System.out.print("Destino vuelo:");
        destino = entrada.nextLine();
        
        LocalDate fechaVuelo = LocalDate.now();
        boolean fechaValida = false;
        double valorPasaje = 0;
        
        do{
            System.out.print("Fecha vuelo (dd/mm/yyyy):");
            fecha = entrada.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            try {
                fechaVuelo = LocalDate.parse(fecha, formatter);
                //fechaVuelo = LocalDate.parse(fecha);
                
                if( validarFechaPasaje (fechaVuelo) ){
                    fechaValida = true;    
                } else {
                    System.out.println("La fecha del pasaje no puede ser menor a hoy!!!");
                }
            } catch (Exception e) {
                System.out.println("Formato fecha invalida dd/mm/yyyy!!!!");
            }
            
        }while(!fechaValida);
        
        boolean valorValido = false;
        do{
            System.out.print("Valor pasaje:");
            valorPasaje = entrada.nextDouble();
            
            if( validarValorPasaje(valorPasaje)){
                valorValido = true;
            } else{
                System.out.println("El valor del pasaje no puede ser menor a 10.000!!!");
            }
        }while(!valorValido);
               
        boolean asientoValido = false;
        int nroAsiento;
        
        do{
            System.out.print("Nro. asiento:");
            nroAsiento = entrada.nextInt();
            
            if ( validarNroAsiento(nroAsiento) ){
                asientoValido = true;
            } else {
                System.out.println("Nro. Asiento no valido!!!");
            }
        }while(!asientoValido);
        
        entrada.nextLine();
        
        pasaje.setNroVuelo(nroVuelo);
        pasaje.setPasajero(pasajero);
        pasaje.setDestino(destino);
        pasaje.setFechaPasaje(fechaVuelo);
        pasaje.setValor(valorPasaje);
        pasaje.setNroAsiento(nroAsiento);
        
        String traeEquipaje;
        
        System.out.print("Lleva equipaje S/N?:");
        traeEquipaje = entrada.nextLine();
        
        if( traeEquipaje.equalsIgnoreCase("S") ){
            pasaje.setTraeEquipaje(true);
        } else {
            pasaje.setTraeEquipaje(false);
        }
    }
    
    public static boolean validarNroAsiento(int nroAsiento){
        return nroAsiento >= 1 && nroAsiento <= 90;
    }
    
       
    public static boolean validarValorPasaje(double valorPasaje){
        return valorPasaje >= 10000;
    }
    
    
    public static boolean validarFechaPasaje(LocalDate fecha){
        LocalDate fechaHoy = LocalDate.now();          
        return fecha.isAfter(fechaHoy) || fecha.isEqual(fechaHoy);
    }
    
    public static void ingresarPasajero(Pasajero pasajero){
        Scanner entrada = new Scanner(System.in);
        boolean flag = false;
        String rut, nombre, apellido;
        String edad;
        int edadInt = 0;
        
        System.out.println("");
        do{
            System.out.print("Rut pasajero:");
            rut = entrada.nextLine();
            if (!rut.isEmpty()){
                flag = true;
            }
        }while(!flag);
        
        flag = false;
        do{
            System.out.print("Nombre pasajero:");
            nombre = entrada.nextLine();
            if (!nombre.isEmpty()){
                flag = true;
            }
        }while(!flag);
        
        flag = false;
        do{
            System.out.print("Apellido pasajero:");
            apellido = entrada.nextLine();
            if (!apellido.isEmpty()){
                flag = true;
            }
        }while(!flag);
        
        flag = false;
        do{
            System.out.print("Edad pasajero:");
            edad = entrada.nextLine();
            if (!edad.isEmpty()){
                try {
                    edadInt = Integer.parseInt(edad);
                    flag = true;
                } catch (NumberFormatException e) {
                    System.out.println("Edad invalida!!!!!");
                }
            }
        }while(!flag);
        
        pasajero.setRut(rut);
        pasajero.setNombre(nombre);
        pasajero.setApellido(apellido);
        pasajero.setEdad(edadInt);        
    }
    


}
