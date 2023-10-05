/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author mario
 */
public class Ave extends Animal {
    
    private int cantAlas;
    private boolean vuela;

    public Ave(String nombre) {
        super(nombre);
    }
    
    @Override
    public void moverse(){
        System.out.println("El ave " +  this.getNombre() +" Vuela a 20KM/H");
    }
    
}
