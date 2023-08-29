/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author mario
 */
public class Trabajador {
    
    private String rut;
    private String dv;
    private String nombre;

    public String getRut() {
        return rut;
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

    @Override
    public String toString() {
        return "Trabajador{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + '}';
    }
    
    
}
