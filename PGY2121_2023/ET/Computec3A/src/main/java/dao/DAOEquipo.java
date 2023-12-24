/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Desktop;
import model.Equipo;
import model.Laptop;

/**
 *
 * @author mario
 */
public class DAOEquipo {
    
    private static ArrayList<Equipo> equipos = new ArrayList<>();
    
    public static Equipo existeEquipo(String codigo){
        for (Equipo e : equipos) {
            if(e.getCodigo().equalsIgnoreCase(codigo)){
                return  e;
            }
        }
        return null;
    }
    
    public static boolean ingresar(Equipo e){
        try {
            equipos.add(e);
            System.out.println("Equipo ingresado con exito: " + e.getCodigo());
            listar();
        } catch (Exception ex) {
            System.out.println("Erro al ingresar un equipo " + ex.toString());
            return false;
        }
        return true;
    }
    
    public static boolean actualizar(Equipo equipo){
        String codigo = equipo.getCodigo();
        for (Equipo e : equipos) {
            if(e.getCodigo().equalsIgnoreCase(codigo)){
                
                e.setDescripcionModelo(equipo.getDescripcionModelo());
                e.setCpu(equipo.getCpu());
                e.setDiscoDuro(equipo.getDiscoDuro());
                e.setCantidadRam(equipo.getCantidadRam());
                e.setPrecio(equipo.getPrecio());
                
                if(e instanceof Laptop laptop){
                    laptop.setTamanoPantalla(((Laptop)equipo).getTamanoPantalla());
                    laptop.setCantidadPuertosUsb(((Laptop)equipo).getCantidadPuertosUsb());
                }else if(e instanceof Desktop desktop){
                    desktop.setPotenciaFuente(((Desktop)equipo).getPotenciaFuente());
                    desktop.setFactorForma(((Desktop)equipo).getFactorForma());
                }
                System.out.println("Equipo actualizado " + codigo);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static void listar(){
        if(!equipos.isEmpty()){
            for (Equipo e : equipos) {
                System.out.println(e);
            }
        }else{
            System.out.println("No hay equipos en la lista!!!");
        }
    }
    
    
    public static boolean eliminar(String codigo){
        for (int i = 0; i < equipos.size(); i++) {
            if(equipos.get(i).getCodigo().equalsIgnoreCase(codigo)){
                equipos.remove(i);
                System.out.println("Cliente eliminado " + codigo);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<String> listarEquipos(){
        ArrayList<String> lista = new ArrayList<>();
        if(!equipos.isEmpty()){
            for (Equipo e : equipos) {
                //lista.add(e.getCodigo() + "-" + e.getDescripcionModelo());
                lista.add(e.getCodigo());
            }
        }else{
            System.out.println("No hay equipos en la lista!!!");
        }
        return lista;
    }
}
