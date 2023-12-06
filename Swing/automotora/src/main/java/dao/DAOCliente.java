/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import model.Cliente;

/**
 *
 * @author mario
 */
public class DAOCliente {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    public static Cliente existeCliente(int rut){
        for (Cliente c : clientes) {
            if(c.getRut() == rut){
                return c;
            }
        }
        return null;
    }
    
    public static boolean ingresar(Cliente c){
        int rut = c.getRut();
        
        if(existeCliente(rut) == null){
            clientes.add(c);
            System.out.println("Cliente ingresado con exito: "+rut);
            listar();
            return true;
        }
        return false;
    }
    
    public static boolean modificar(Cliente c){
        int rut = c.getRut();
        
        for (Cliente cl : clientes) {
            if(cl.getRut() == rut){
                cl.setNombre(c.getNombre());
                cl.setTelefono(c.getTelefono());
                cl.setCorreo(c.getCorreo());
                System.out.println("Cliente actualizado " + rut);
                listar();
                return true;
            }
            
        }
        return false;
    }
    
    public static boolean eliminar(int rut){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getRut() == rut){
                clientes.remove(i);
                System.out.println("Cliente eliminado:  " + rut);
                listar();
                return true;
            }
        }
        return false;
    }
    
    private static void listar(){
        if(!clientes.isEmpty()){
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }else{
            System.out.println("No hay clientes en el lista!!!");
        }
    }
    
    public static Set<Integer> getClientes(){
        Set<Integer> set = new HashSet<>();
        for (Cliente cliente : clientes) {
            set.add(cliente.getRut());
        }
        return set;
    }
}
