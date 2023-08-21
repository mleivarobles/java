/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesfunciones;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Concesionaria {
    
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>(); //Inicializo la lista de autos de la concesionaria
    }
    
    public void agregarAuto(Auto auto){
        this.autos.add(auto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Concesionaria{");
        sb.append("nombre=").append(nombre);
        sb.append(", autos=").append(autos);
        sb.append('}');
        return sb.toString();
    }
    
    public double calcularTotalKilometros(){
        double kilometros = 0;
        for(Auto a: autos){
            kilometros += a.getKilometraje();
        }
        
        return kilometros;
    }
    
    public double calcularPromedioKilometros(){
        double kilometros = calcularTotalKilometros();
        if(!autos.isEmpty()){
            return (kilometros/autos.size());
        } else {
            return 0;
        }
    }
    
}
