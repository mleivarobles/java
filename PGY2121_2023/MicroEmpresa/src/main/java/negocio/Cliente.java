/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author mario
 */
public class Cliente {
    
    private String rut;
    private char dv;
    private String nombre, email, dirección, telefono;

    public Cliente() {
    }
    
    public Cliente(String rut, char dv, String nombre, String email, String dirección, String telefono) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.email = email;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", email=" + email + ", direcci\u00f3n=" + dirección + ", telefono=" + telefono + '}';
    }
}
