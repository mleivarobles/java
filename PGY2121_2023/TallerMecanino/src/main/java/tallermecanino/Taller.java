/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanino;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Taller {
    
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>(); //inicializo la lista de autos que van al taller
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        String patente = vehiculo.getPatente();
        
        if ( existePatente(patente) ){
            System.out.println("El vehiculo con patente " + patente + " ya existe");
        } else {
            this.vehiculos.add(vehiculo);
            System.out.println("Hay " + this.vehiculos.size() + " vehiculos en el taller!!!");
        }
    }
    
    public boolean existePatente(String patente){
        
        for (Vehiculo vehiculo : vehiculos) {
            if( vehiculo.getPatente().equalsIgnoreCase(patente)){
                return true;
            }
        }
        return false;
    }
    
    public void imprimirTodosVehiculos(){
        
        if( vehiculos.isEmpty()){
            System.out.println("El taller no tiene vehiculos!!");
        } else{
            for (Vehiculo vehiculo : vehiculos) {
                vehiculo.imprimir();            
            }
        }
    }
    
    public boolean actualizarModelo(String patente, String modelo){       
        for (Vehiculo vehiculo : vehiculos) {
            if( vehiculo.getPatente().equalsIgnoreCase(patente) ){
                vehiculo.setModelo(modelo);
                System.out.println("El modelo de vehiculo " + patente + " se cambió!!!");                
                return true;
            }
        }
        System.out.println("El vehiculo de patente " + patente + " no existe en el taller");
        return false;
    }
    
    public void imprimirTodoTerrenos(){
        System.out.println("\nListado de TodoTerreno");
        for (Vehiculo vehiculo : vehiculos) {
            if ( vehiculo instanceof TodoTerreno){
                vehiculo.imprimir();
            }
        }
    }
    
    public void imprimirCityCar(){
        System.out.println("\nListado de CityCar");
        for (Vehiculo vehiculo : vehiculos) {
            if( vehiculo instanceof CityCar){
                vehiculo.imprimir();
            }
        }
    }
    
    public boolean eliminarVehiculo(String patente){
        for (Vehiculo vehiculo : vehiculos) {
            if ( vehiculo.getPatente().equalsIgnoreCase(patente)){
                vehiculos.remove(vehiculo);
                System.out.println("El vehiculo de patente " + patente + " fue eliminado");
                return true;
            }
        }
        System.out.println("El vehiculo no extste en el taller!!!");
        return false;
    }
    
}
