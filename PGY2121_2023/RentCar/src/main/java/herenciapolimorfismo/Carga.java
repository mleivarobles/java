/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo;

/**
 *
 * @author mario
 */
public class Carga extends Vehiculo{
    
    private int capacidadCarga;

    public Carga(int capacidadCarga, double precioArriendo, int cantidadDias, String patente) {
        super(precioArriendo, cantidadDias, patente);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDetalleBoleta() {
        double precio = super.getPrecioArriendo();
        double descuento = precio * (Descontable.DESCUENTO_CARGA/100);
        double precioIva = precio * (Descontable.IVA/100); 
        
        System.out.println("\nCarga");
        System.out.println("Precio Arriendo: " + precio);
        System.out.println("Descuento: " + descuento );
        System.out.println("IVA: " + precioIva);
        System.out.println("TOTAL: " + (precio + precioIva - descuento) );
    }
}
