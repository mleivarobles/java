/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class RentCar {
    
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public RentCar(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }
    
    
    private boolean existePatente(String patente){
        for (Vehiculo v : vehiculos) {
            if( v.getPatente().equalsIgnoreCase(patente) ){
                return true;
            }
        }
        return false;
    }
    
    public void agregarVehiculo(Vehiculo v){
        String patente = v.getPatente();
        
        
        if(!existePatente(patente)){
            this.vehiculos.add(v);
        } else {
            System.out.println("El vehiculo de patente "+ patente+ " ya existe");
        }
    }
    
    public void listarVehiculos(){
        if( !vehiculos.isEmpty()){
            for (Vehiculo v : vehiculos) {
                System.out.println(v);
            }
        } else {
          System.out.println("No hay vehiculos en arriendo!!!");
        }
    }
    
    public int arriendoSiete(){
        int cantidad = 0;
        
        for (Vehiculo v : vehiculos) {
            if(v.getCantidadDias() >= 7 ){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public void mostrarBoletas(){
        for (Vehiculo v : vehiculos) {
            v.mostrarDetalleBoleta();
        }
    }

}

