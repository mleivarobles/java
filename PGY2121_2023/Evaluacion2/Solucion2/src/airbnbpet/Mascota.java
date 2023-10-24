/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnbpet;

import interfaces.Alojable;

/**
 *
 * @author cetecom
 */
public abstract class Mascota implements Alojable {
    
    private String nombre;
    private double peso;
    private int edad;
    private int diasAlojamiento;
    private String codigo;
    private boolean requiereSupervision;

    public Mascota(String nombre, double peso, int edad, 
            int diasAlojamiento, String codigo, boolean supervision) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.codigo = codigo;
        this.requiereSupervision = supervision;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public double getValorAlojamiento() {
        return diasAlojamiento * Alojable.VALOR_DIA_ALOJAMIENTO;
    }
    
    public String mostrarDatos(){
        return "Mascota: " + nombre;
    }
    
    @Override
    public abstract double calcularPrecioFinal();
}
