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
public class Bicicleta extends Vehiculo {
    
    private int pinnones;

    public Bicicleta(int pinnones, double kilometrosRecorridos) {
        super(kilometrosRecorridos);
        this.pinnones = pinnones;
    }
    public void levantarRuedas(){
        System.out.println("Estoy levantando la rueda de la bici!!!!");
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "pinnones=" + pinnones + " , "+ super.toString()+'}';
    }

    @Override
    public void recorrerVehiculo() {
        Random tiempo = new Random();
        Random velocidad = new Random(); //2
        
        double distancia = tiempo.nextInt(10) * velocidad.nextInt(20);
        Vehiculo.kilometrosTotales += distancia;
        
        this.kilometrosRecorridos += distancia ;
    }

    public void verKilometrajeVehiculo() {
        System.out.println("La bicileta ha recorrido " + this.kilometrosRecorridos);
    }
}
