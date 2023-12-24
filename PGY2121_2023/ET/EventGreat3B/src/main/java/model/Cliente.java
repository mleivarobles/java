/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mario
 */
public class Cliente {
    
    //rut, nombre completo, correo electrónico, teléfono
    
    private int rut;
    private String nombre;
    private String email;
    private int telefono;

    public int getRut() {
        return rut;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public Cliente(int rut, String nombre, String email, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + '}';
    }
}
