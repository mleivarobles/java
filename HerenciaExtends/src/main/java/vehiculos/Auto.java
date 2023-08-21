/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author mario
 */
public class Auto extends Vehiculo{
    
    boolean tieneAire;
    
    void prenderAire(){
        if (!tieneAire){
            tieneAire = true;
        }
    }
    
}
