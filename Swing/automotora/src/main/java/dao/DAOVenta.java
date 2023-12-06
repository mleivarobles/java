/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
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
    
    public static double valorVentasAnio(int yyyy){
        double venta = 0;
        
        for (Venta v : ventas) {
            Date fecha = v.getFechaVenta();
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(fecha);
            
            int anio = calendario.get(Calendar.YEAR);
            
            if(anio == yyyy){
                venta += v.getPrecioVenta();
            }
        }
        System.out.println("El total de ventas para el año " + yyyy+ " es " + venta );
        return venta;
    }
    
    public static ArrayList<String> vehiculoMasVendidos(){
        ArrayList<String> lista = new ArrayList<>();
        Set<String> marcas = DAOVehiculo.getMarcasVehiculos();
        String registro;
        
        //top3
        for (String marca : marcas) {
            double valorTotal = 0;
            for (Venta venta : ventas) {
                if(marca.equalsIgnoreCase(venta.getVehiculo().getMarca())){
                    valorTotal+=venta.getPrecioVenta();
                }
            }
            registro = "\nLa marca " + marca +" tuvo ventas por " + valorTotal;
            lista.add(registro);
        }
        return lista;
    }
        
    public static ArrayList<String> clientesMasCompras(){
        ArrayList<String> lista = new ArrayList<>();
        Set<Integer> clientes = DAOCliente.getClientes();
        String registro;
        
        //top3
        for (int cl : clientes) {
            int cantidad = 0;
            String nombre = new String();
            for (Venta venta : ventas) {
                if(cl == venta.getCliente().getRut()){
                    cantidad++;
                    nombre = venta.getCliente().getNombre();
                }
            }
            
            registro = "\nCliente " + cl + " - " +nombre+ " realizó " + cantidad +" compras";
            lista.add(registro);
        }
        return lista;
    }
}
