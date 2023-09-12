/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos;

/**
 *
 * @author mario
 */
public class Estudiante {
    
    private int rut;
    private String dv;
    private String nombre;
    private int edad;

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", edad=" + edad + '}';
    }   
}
