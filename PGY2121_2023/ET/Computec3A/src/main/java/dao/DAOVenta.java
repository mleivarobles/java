/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import model.Laptop;
import model.Reporte;
import model.Venta;

/**
 *
 * @author mario
 */
public class DAOVenta {
    
    private static ArrayList<Venta> ventas = new ArrayList<>();
 
    public static boolean ingresar(Venta v){
        
            if(ventas.add(v)){
                System.out.println("Venta registrado ok!!!");
                listar();
                return true;
            }
        return false;
    }

    private static void listar(){
        if(!ventas.isEmpty()){
            for (Venta v : ventas) {
                System.out.println(v);
            }
        }else{
            System.out.println("No hay ventas registradas!!!");
        }
    }
    
    public static ArrayList<Reporte> listarVentas(){
        ArrayList<Reporte> lista = new ArrayList<>();

        for (Venta venta : ventas) {
            String modelo = venta.getEquipo().getDescripcionModelo();
            String nombre = venta.getCliente().getNombre();
            int telefono = venta.getCliente().getTelefono();
            String correo = venta.getCliente().getEmail();
            double precio = venta.getEquipo().getPrecio();
            Date fecha = venta.getFecha();
            
            String tipoEquipo;
            
            if(venta.getEquipo() instanceof Laptop){
                tipoEquipo = "laptop";
            }else{
                tipoEquipo = "desktop";
            }
            
            Reporte reporte;
            reporte = new Reporte(modelo,nombre,telefono,correo,precio,tipoEquipo, fecha);
            lista.add(reporte);
        }
        return lista;
    }
    
    public static int cantidadVentas(){
        return ventas.size();
    }
    
    public static double totalVentas(){
        double total = 0;
        for (Venta v : ventas) {
            total += v.getEquipo().getPrecio();
        }
        return total;
    }
}
