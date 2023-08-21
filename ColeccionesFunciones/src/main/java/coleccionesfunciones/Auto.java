/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesfunciones;

/**
 *
 * @author mario
 */
public class Auto {
    
    private String patente;
    private String color;
    private double kilometraje;

    public Auto(String patente, String color, double valor) {
        this.patente = patente;
        this.color = color;
        this.kilometraje = valor;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto{");
        sb.append("patente=").append(patente);
        sb.append(", color=").append(color);
        sb.append(", valor=").append(kilometraje);
        sb.append('}');
        return sb.toString();
    }
}
