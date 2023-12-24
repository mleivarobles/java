/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;

import model.Evento;
import model.Fiesta;
import model.Matrimonio;


/**
 *
 * @author mario
 */
public class DAOEvento {
    
    private static ArrayList<Evento> eventos = new ArrayList<>();
    
    public static Evento existeEquipo(String codigo){
        for (Evento e : eventos) {
            if(e.getCodigo().equalsIgnoreCase(codigo)){
                return  e;
            }
        }
        return null;
    }
    
    public static boolean ingresar(Evento e){
        try {
            eventos.add(e);
            System.out.println("Evento ingresado con exito: " + e.getCodigo());
            listar();
        } catch (Exception ex) {
            System.out.println("Error al ingresar un evento" + ex.toString());
            return false;
        }
        return true;
    }
    
    public static boolean actualizar(Evento evento){
        String codigo = evento.getCodigo();
        for (Evento e : eventos) {
            if(e.getCodigo().equalsIgnoreCase(codigo)){
                
                e.setDescripcion(evento.getDescripcion());
                e.setCantidadAsistentes(evento.getCantidadAsistentes());
                e.setCantidadMesas(evento.getCantidadMesas());
                e.setTamanioRecinto(evento.getTamanioRecinto());
                e.setPrecio(evento.getPrecio());
                
                
                if(e instanceof Fiesta fiesta){
                    fiesta.setTieneAlcohol(((Fiesta)evento).isTieneAlcohol());
                    fiesta.setNroDj(((Fiesta)evento).getNroDj());
                }else if(e instanceof Matrimonio matrimonio){
                    matrimonio.setTieneMusica(((Matrimonio)evento).isTieneMusica());
                    matrimonio.setCantPlatos(((Matrimonio)evento).getCantPlatos());
                }
                System.out.println("Evento actualizado " + codigo);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static void listar(){
        if(!eventos.isEmpty()){
            for (Evento e : eventos) {
                System.out.println(e);
            }
        }else{
            System.out.println("No hay eventos en la lista!!!");
        }
    }
    
    
    public static boolean eliminar(String codigo){
        for (int i = 0; i < eventos.size(); i++) {
            if(eventos.get(i).getCodigo().equalsIgnoreCase(codigo)){
                eventos.remove(i);
                System.out.println("Evento eliminado " + codigo);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<String> listarEquipos(){
        ArrayList<String> lista = new ArrayList<>();
        if(!eventos.isEmpty()){
            for (Evento e : eventos) {
                //lista.add(e.getCodigo() + "-" + e.getDescripcionModelo());
                lista.add(e.getCodigo());
            }
        }else{
            System.out.println("No hay equipos en la lista!!!");
        }
        return lista;
    }
}
