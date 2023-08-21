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
public class Fabrica {
    
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public void listarInstrumentos(){
        for(Sucursal s: sucursales){
            s.listarInstrumentos();
        }
    }
    
    public void agregarSucursal(Sucursal s){
        this.sucursales.add(s);
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> lista = new ArrayList<>();
        for (Sucursal s : sucursales) {
            lista.addAll(s.instrumentosPorTipo(tipo));
        }
        return lista;
    }
    
    public void borrarInstrumento(String id){
        for (Sucursal s : sucursales) {
            if(s.borrarInstrumento(id)){
                System.out.println("Fue borrado el instrumento con ID " + id);
            } else{
                System.out.println("El elemento no fue encontrado con ID " + id);
            }
        }
    }
    
    public double[] porcInstrumentosPorTipo(String nombreSucursal){
        double[] porcentajes = new double[3];
        //    PERCUSION,VIENTO,CUERDA;
        for(Sucursal s: sucursales){
            if(s.getNombre().equals(nombreSucursal)){
                porcentajes = s.porcInstrumentosPorTipo();
                
            }
        }
        return porcentajes;
    }
}
