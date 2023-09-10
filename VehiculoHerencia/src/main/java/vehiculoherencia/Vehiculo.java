/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoherencia;

/**
 *
 * @author mario
 */
public class Vehiculo {
    
    static double kilometrosTotales = 0; //atributo de clase
    double kilometrosRecorridos; //atributo de instancia (objeto)

    public Vehiculo(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    
    public void recorrerVehiculo(){
    };
    
    public void verKilometrojeVehiculo(){
    }

    @Override
    public String toString() {
        return "kilometrosRecorridos=" + kilometrosRecorridos + '}';
    }
}
