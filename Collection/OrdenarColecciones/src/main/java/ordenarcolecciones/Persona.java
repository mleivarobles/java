/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenarcolecciones;

/**
 *
 * @author mario
 */

// La clase Persona implementa la comparación de una Persona con otro objeto de tipo Persona
public class Persona implements Comparable<Persona> {
    
    private int rut;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    //en este metodo se especifica como comparo una persona con respecto a la otra

    /*
    @Override
    public int compareTo(Persona t) {
        // devuelve un entero
        // si yo Persona (this) soy menor que la Persona t, retorno un numero negativo
        // si yo Persona (this) soy mayor que la Persona t, retorno un numero positivo
        // si somos iguales retorno un cero (0)
        // se debe elegir un criterio de orden, por ejemplo, rut, nombre, apellido y/o edad.
        // en este caso por rut
        
        return this.rut - t.getRut();  // ASCENDENTE
        return t.getRut() - this.rut;  // DESCENDENTE
    }
    */
    
    @Override
    public int compareTo(Persona t) {
        //vamos a ordenar por nombre, comento el metodo anterior
        
        //return this.nombre.compareTo(t.getNombre()); //ordena de la a..z
        return t.getNombre().compareTo(this.nombre); //orden de la z..a
    }
}
