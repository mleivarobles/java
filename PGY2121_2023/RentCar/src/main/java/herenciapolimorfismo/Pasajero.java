/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo;

/**
 *
 * @author mario
 */
public class Pasajero extends Vehiculo {
    
    private int cantidadPasajeros;

    public Pasajero(int cantidadPasajeros, double precioArriendo, int cantidadDias, String patente) {
        super(precioArriendo, cantidadDias, patente);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public void mostrarDetalleBoleta() {
        double precio = super.getPrecioArriendo();
        double descuento = precio * (Descontable.DESCUENTO_PASAJEROS/100);
        double precioIva = precio * (Descontable.IVA/100); 
        double total = precio + precioIva - descuento;
        
        System.out.println("\nVehiculo Pasajero");
        System.out.println("Precio Arriendo: " + precio);
        System.out.println("Descuento: " + descuento );
        System.out.println("IVA: " + precioIva);
        System.out.println("TOTAL: " + total );
    }
    
}
