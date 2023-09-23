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
        int cantEventos = TipoEvento.values().length;
        int[] totalVentas = new int[cantEventos]; //creo un arreglo para almacenar las ventas
        
        for (Evento e : this.eventos) {
            totalVentas[ e.getTipo().ordinal()] += e.getPrecio();
        }
        System.out.println("\nTotal ventas por tipo:");
        int i = 0;
        for (TipoEvento value : TipoEvento.values()) {
            System.out.println(value.toString() + ": " + totalVentas[i]);
            i++;
        }
    }
    
    public void tipoEventoMasSolicitado(){
        int cantEventos = TipoEvento.values().length;
        int[] totalEventos = new int[cantEventos]; //creo un arreglo para almacenar las ventas
        
        for (Evento e : eventos) {
            totalEventos[ e.getTipo().ordinal()] += 1;
        }
        
        System.out.println("\nTipo de Evento más solicitado:");
        int mas = 0;
        for (int i = 0; i < cantEventos; i++) {
            if ( totalEventos[i] > mas ){
                mas = i;
            }
        }
        
        for (Evento e : eventos) {
            if ( mas == e.getTipo().ordinal()){
                System.out.println(e.getTipo());
                break;
            }
        }
        
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", eventos=" + eventos + '}';
    }
}
