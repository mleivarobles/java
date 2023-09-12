/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion1;

/**
 *
 * @author cetecom
 */
public class Estudiante {
    
    private String rut;
    private String dv;
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setRut(String rut) {
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
