/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author mario
 */
public class DAOCliente {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    public static Cliente buscarCliente(int rut){
        for (Cliente c : clientes) {
            if (c.getRut() == rut){
                return c;
            }
        }
        return null;
    }
    
    public static boolean agregarCliente(Cliente cli){
        int nuevoRut = cli.getRut();
        if(buscarCliente(nuevoRut) == null){
            clientes.add(cli);
            return true;
        }
        return false;
    }
    
    public static void listarCliente(){
        for (Cliente c : clientes) {
            System.out.println(c);
            
        }
    }
    
    public static int totalCliente(){
        return clientes.size();
    }
    
    public static boolean esVacia(){
        return clientes.isEmpty();
    }
    
    public static Cliente traerPrimerCliente(){
        return clientes.get(0);
    }
    
    public static Cliente siguiente(int i){
        
        if( > ){
        }
        return clientes.get(0);
    }
}
