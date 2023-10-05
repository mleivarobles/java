/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author mario
 */
public class Pez extends Animal {
    
    private boolean esMamifero;

    public Pez(String nombre) {
        super(nombre);
    }
    
    @Override
    public void moverse(){
        System.out.println("El pez " + this.getNombre() + " nada 500 cm en un 1 hora!!!");
    }
}
