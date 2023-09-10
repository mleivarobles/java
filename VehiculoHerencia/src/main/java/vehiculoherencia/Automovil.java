/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoherencia;

import java.util.Random;

/**
 *
 * @author mario
 */
public class Automovil extends Vehiculo {
    
    private double cilindrada;

    public Automovil(double cilindrada, double kilometrosRecorridos) {
        super(kilometrosRecorridos);
        this.cilindrada = cilindrada;
    }

    public void derrapar(){
        System.out.println("Estoy derrapando con el automovil");
    }
    
    @Override
    public void recorrerVehiculo() {
        Random tiempo = new Random();
        Random velocidad = new Random(); //2
        
        double distancia = tiempo.nextInt(10) * velocidad.nextInt(20);
        Vehiculo.kilometrosTotales += distancia;
        
        this.kilometrosRecorridos += distancia;
    }
    
    public void verKilometrajeVehiculo() {
        System.out.println("La bicileta ha recorrido " + this.kilometrosRecorridos);
    }

    @Override
    public String toString() {
        return "Automovil{" + "cilindrada=" + cilindrada + " ,"+ super.toString() +'}';
    }
}
