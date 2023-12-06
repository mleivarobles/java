/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import model.Automovil;
import model.Camioneta;
import model.Vehiculo;

/**
 *
 * @author mario
 */
public class DAOVehiculo {
    
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    
    public static Vehiculo existeVehiculo(String patente){
        for (Vehiculo v : vehiculos) {
            if(v.getPatente().equalsIgnoreCase(patente)){
                return v;
            }
        }
        return null;
    }
    
    public static boolean ingresar(Vehiculo v){
        String patente = v.getPatente();
        
        if(existeVehiculo(patente) == null){
            vehiculos.add(v);
            System.out.println("Vehiculo ingresado con exito: "+patente);
            listar();
            return true;
        }
        return false;
    }
    
    public static boolean modificar(Vehiculo v){
        String patente = v.getPatente();
        
        for (Vehiculo vh : vehiculos) {
            if(vh.getPatente().equalsIgnoreCase(patente)){
                vh.setMarca(v.getMarca());
                vh.setModelo(v.getModelo());
                
                if(v instanceof Automovil){                   
                    ((Automovil)vh).setRendimiento(((Automovil) v).getRendimiento());
                    ((Automovil)vh).setTieneAire(((Automovil) v).isTieneAire());
                }else{
                    ((Camioneta)vh).setCapacidadCarga( ((Camioneta) v).getCapacidadCarga());
                }
                
                System.out.println("Vehiculo actualizado " + patente);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static boolean eliminar(String patente){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getPatente().equalsIgnoreCase(patente)){
                vehiculos.remove(i);
                System.out.println("Vehiculo eliminado:  " + patente);
                listar();
                return true;
            }
        }
        return false;
    }
    
    private static void listar(){
        if(!vehiculos.isEmpty()){
            for (Vehiculo v : vehiculos) {
                System.out.println(v);
            }
        }else{
            System.out.println("No hay vehiculos en el lista!!!");
        }
    }

    public static ArrayList<String> getVehiculos() {
        ArrayList<String> lista = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            //lista.add(v.getPatente() + "-" + v.getMarca() + " " + v.getModelo());
            lista.add(v.getPatente());
        }
        return lista;
    }
    
    //Las coleccion Set no permiten elementos duplicados
    public static Set<String> getMarcasVehiculos() {
        Set<String> set = new HashSet<>();
        
        for (Vehiculo v : vehiculos) {
            set.add(v.getMarca());
        }
        return set;
    }
}
