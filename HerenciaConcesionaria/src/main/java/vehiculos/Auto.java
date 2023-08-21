/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author mario
 */
public class Auto extends Vehiculo {
    
    private boolean tieneAire;
    
    public void prenderAire(){
        System.out.println(marca);
        if (tieneAire){
            System.out.println("Encendiendo aire...");
        } else{
            System.out.println("El auto no tiene aire!!!!");
        }
    }   
}
