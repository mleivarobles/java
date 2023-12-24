/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
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
                System.out.println("Rut ya existe " + rut);
                return  c;
            }
        }
        return null;
    }
    
    public static boolean ingresar(Cliente c){
        if(existeCliente(c.getRut()) == null ) {
            clientes.add(c);
            System.out.println("Cliente ingresado con exito: " + c.getRut());
            listar();
            return true;
        }
        return false;
    }
    
    public static boolean actualizar(Cliente cliente){
        int rut = cliente.getRut();
        for (Cliente c : clientes) {
            if(c.getRut() == rut){
                c.setNombre(cliente.getNombre());
                c.setEmail(cliente.getEmail());
                c.setTelefono(cliente.getTelefono());
                System.out.println("Cliente actualizado " + rut);
                listar();
                return true;
            }
        }
        return false;
    }
    
    public static void listar(){
        if(!clientes.isEmpty()){
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }else{
            System.out.println("No hay clientes en la lista!!!");
        }
    }
    
    public static boolean eliminar(int rut){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getRut() == rut){
                clientes.remove(i);
                System.out.println("Cliente eliminado " + rut);
                listar();
                return true;
            }
        }
        return false;
    }
}
