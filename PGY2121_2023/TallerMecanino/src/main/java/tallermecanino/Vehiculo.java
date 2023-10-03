/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanino;

/**
 *
 * @author mario
 */
public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Categoria categoria;

    public Vehiculo() {
    }
    
    public Vehiculo(String patente, String modelo, Categoria categoria) {
        this.patente = patente;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public String getPatente() {
        return patente;
    }
    
    public void imprimir(){
        System.out.println("Patente:" + patente);
        System.out.println("Modelo:" + modelo);
        System.out.println("Categoria:" + categoria);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

