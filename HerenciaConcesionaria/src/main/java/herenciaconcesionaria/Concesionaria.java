/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaconcesionaria;

import vehiculos.*;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Concesionaria {
    
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculos(Vehiculo v){
        this.vehiculos.add(v);
    }
}
