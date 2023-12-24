/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.Fiesta;
import model.RegistroEvento;
import model.Reporte;

/**
 *
 * @author mario
 */
public class DAORegistroEvento {
    
    private static ArrayList<RegistroEvento> ventas = new ArrayList<>();
 
    public static boolean ingresar(RegistroEvento re){
        
            if(ventas.add(re)){
                System.out.println("Registro evento registrado ok!!!");
                listar();
                return true;
            }
        return false;
    }

    private static void listar(){
        if(!ventas.isEmpty()){
            for (RegistroEvento re : ventas) {
                System.out.println(re);
            }
        }else{
            System.out.println("No hay ventas registradas!!!");
        }
    }
    
    public static ArrayList<Reporte> listarVentas(){
        ArrayList<Reporte> lista = new ArrayList<>();

        for (RegistroEvento venta : ventas) {
          
            String descripcion = venta.getEvento().getDescripcion();
            String nombre = venta.getCliente().getNombre();
            int telefono = venta.getCliente().getTelefono();
            String correo = venta.getCliente().getEmail();
            double precio = venta.getEvento().getPrecio();
            Date fecha = venta.getFecha();
            
            String tipoEvento;
 
            if(venta.getEvento() instanceof Fiesta){
                tipoEvento = "Fiesta";
            }else{
                tipoEvento = "Matrimonio";
            }
            
            Reporte reporte;
            reporte = new Reporte(descripcion,nombre,telefono,correo,precio,tipoEvento, fecha);
            lista.add(reporte);
        }
        return lista;
    }
    
    public static int cantidadVentas(){
        return ventas.size();
    }
    
    public static double totalVentas(){
        double total = 0;
        for (RegistroEvento v : ventas) {
            total += v.getEvento().getPrecio();
        }
        return total;
    }
}
