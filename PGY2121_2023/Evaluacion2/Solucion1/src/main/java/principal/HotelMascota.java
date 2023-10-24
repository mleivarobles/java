/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import mascota.Mascota;

/**
 *
 * @author mario
 */
public class HotelMascota {
    
    private String nombre;
    private ArrayList<Mascota> mascotas;

    public HotelMascota(String nombre) {
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
        if(!existeCodigo(codigo)){
            this.mascotas.add(m);
        }else{
            System.out.println("Las mascota de codigo " + codigo + " ya existe");
        }
    }
    
    public void listarTodasMascotas(){
        if(mascotas.isEmpty()){
            System.out.println("No hay mascotas en el AirbnbPet!!!");
        } else {
            for (Mascota m : mascotas) {
                m.mostrarDatos();                
            }
        }
    }
    
    public int cantidadMascotas(){
        return mascotas.size();
    }
    
    public double calcularTotalValor(){
        double total = 0;
        for (Mascota m : mascotas) {
            total = total + m.calcularValorAlojamiento();
        }
        return total;
    }
}
