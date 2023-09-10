/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author mario
 */
public class Auto {
    
    private String patente;
    private String marca;
    private String modelo;

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto{");
        sb.append("patente=").append(patente);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }  
}
