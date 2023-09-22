/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mario
 */
public class Empresa {
    
    private String nombre;
    private ArrayList<Evento> eventos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.eventos = new ArrayList<>();
    }
    
    public void agregarEventos(Evento evento){
        this.eventos.add(evento);
    }
    
    public void listarEventosPorFecha(){
        Collections.sort(eventos); //ordeno por fecha ascendente, ver clase Evento
        
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
    
    public void totalVentasPorTipo(){
        //cumpleaños", "matrimonio","cena","fiesta"
        
        
        
        System.out.println("Pendiente de implementar");
    }
    
    public TipoEvento tipoEventoMasSolicitado(){
        System.out.println("Pendiente de implementar");
        return null;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", eventos=" + eventos + '}';
    }
}
