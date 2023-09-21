/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadorternario;

/**
 *
 * @author mario
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private int cantHijos;

    public Persona(String nombre, int edad, int cantHijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantHijos = cantHijos;
    }
    
    public void presentar(){
        String saludo = "Hola mi nombre es " + nombre;
        
        if(cantHijos == 0 ){
            saludo += " y no tengo hijos";
        } else {
            saludo += " y tengo " + cantHijos + (cantHijos >1 ? " hijos" : " hijo");
        }
        
        System.out.println(saludo);
    }
}
