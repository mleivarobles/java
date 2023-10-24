/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author mario
 */
public class Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected String color;
    
    void acelerar(){
        System.out.println("Acelerando!!!");
    }
    
    void frenar(){
        System.out.println("Frenando!!!");
    }
    
    void encender(){
        System.out.println("Encendiendo!!!");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
