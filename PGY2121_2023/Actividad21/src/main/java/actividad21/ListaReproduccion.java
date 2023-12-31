/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad21;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ListaReproduccion {
    
    private String nombre;
    private ArrayList<Cancion> listaCanciones;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.listaCanciones = new ArrayList<>();
    }
    
    public void agregarCancion(Cancion cancion){
        this.listaCanciones.add(cancion);
    }
    
    public void listarCancion(){
        for (int i = 0; i < listaCanciones.size(); i++) {
            System.out.println("["+(i+1)+"]: " + listaCanciones.get(i));            
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaReproduccion{");
        sb.append("nombre=").append(nombre);
        sb.append(", listaCanciones=").append(listaCanciones);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }
    
}
