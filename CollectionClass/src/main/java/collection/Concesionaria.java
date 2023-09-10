/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author mario
 */
public class Concesionaria {
    
    private String nombre;
    private Collection<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new LinkedList<>();
    }
    
    public void mostrarAutos(){
        if (!autos.isEmpty()) {
            for (Auto auto : autos) { 
                System.out.println(auto);
            }
        } else {
            System.out.println("No hay autos!!!!!");
        }
    }
    
    public void agregarAutos(Auto auto){
        this.autos.add(auto);
    }
    
    public void buscarPatente(String patente){
        boolean flag = false;
        for (Auto auto : autos) {
            if ( auto.getPatente().equalsIgnoreCase(patente) ){
                System.out.println("El auto con patente " + patente + " existe");
                flag = true;
            }
        }
        if (!false){
            System.out.println("El auto con patente " + patente + " no existe");
        }
    }
    
}
