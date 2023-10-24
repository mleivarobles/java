/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author mario
 */
public class Moto extends Vehiculo {
    
    double anchoManubrio;

    public Moto(double anchoManubrio) {
        this.anchoManubrio = anchoManubrio;
    }
    
    public void levantarRueda(){
        marca = "Trek";
        System.out.println(marca);
        System.out.println("Levantando  la rueda!!!!");
    }
}
