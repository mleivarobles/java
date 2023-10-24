/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricainstrumentos;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
class Sucursal {
    
    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarInstrumento(Instrumento i){
        this.instrumentos.add(i);
    }
    
    public void listarInstrumentos(){
        System.out.println("\nListado de Instrumentos de la sucursal " + nombre);
        System.out.println("-----------------------");
        for(Instrumento i: instrumentos){
            System.out.println(i);
        }
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> lista = new ArrayList<>();
        for(Instrumento i: instrumentos){
            if(i.getTipo().equals(tipo)){
                lista.add(i);
            }
        }
        return lista;
    }
    
    public boolean borrarInstrumento(String id){
        for (Instrumento i : instrumentos) {
            if(i.getIdInstrumento().equals(id)){
                if(instrumentos.remove(i)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public double[] porcInstrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];
        
        for (Instrumento i : instrumentos) {
            porcentajes[i.getTipo().ordinal()]++;
        }
        
        for (int i = 0; i < CANT_INSTRUMENTOS; i++) {
            porcentajes[i] = (double) (porcentajes[i]/instrumentos.size()) * 100;
        }
        return porcentajes;
    }
}
