/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnbpet;

import java.util.ArrayList;

/**
 *
 * @author cetecom
 */
public class HotelPet {
    
    private String nombre;
    private ArrayList<Mascota> mascotas;

    public HotelPet(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }
    
    private boolean existeCodigo(String codigo){
        for (Mascota m : mascotas) {
            if(m.getCodigo().equalsIgnoreCase(codigo)){
                return true;
            }
            
        }
        return false;
    }
    
    public void agregarMascota(Mascota m){
        String codigo = m.getCodigo();
        if(existeCodigo(codigo)){
            System.out.println("El codigo " + codigo +" ya existe en el hotel");
        } else {
            this.mascotas.add(m);
        }
    }
    
    public void listarMascotas(){
        for (Mascota m : mascotas) {
            System.out.println(m.mostrarDatos());
        }
    }
    
    public int totalMascotas(){
        return mascotas.size();
    }
    
    public double calcularPagoMascotas(){
        double total = 0;
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre() + " debe pagar: " + m.calcularPrecioFinal() );
            total = total + m.calcularPrecioFinal();
        }
        return total;
    }
}
