/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.Cliente;
import negocio.Producto;
import java.util.Date;

/**
 *
 * @author mario
 */
public class Solicitud {
    
    private static int cantSolicitudes = 1;
    private int nroSolicitud;
    private Date fecha;
    private Cliente cliente;
    private double total; //suma de todos los productos
    private String productos; //separados por ;

    public Solicitud() {
        this.nroSolicitud = obtenerNroSolicitud();
    }
    
    public Solicitud(Date fecha, Cliente cliente) {
        this.nroSolicitud = obtenerNroSolicitud();
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = 0;
        this.productos = new String();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProductos(Producto producto){
        String cadena;
        this.total+= producto.getPrecio();
        
        cadena = ";" + producto.getDescripcion() + " " +
                producto.getSubCategoria() + " " + producto.getMedida();
         this.productos = this.productos.concat(cadena);
    }
    
    public void aplicarDescuento(double descuento){
        this.total = this.total * (1 - descuento/100);
    }
    
    private int obtenerNroSolicitud(){
        return Solicitud.cantSolicitudes++;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "nroSolicitud=" + nroSolicitud + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total + ", productos=" + productos + '}';
    }
}

