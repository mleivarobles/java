/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo;

/**
 *
 * @author mario
 */
public abstract class Vehiculo implements Descontable {
    
    private double precioArriendo; //sin IVA
    private int cantidadDias;
    private String patente;

    public Vehiculo(double precioArriendo, int cantidadDias, String patente) {
        this.precioArriendo = precioArriendo;
        this.cantidadDias = cantidadDias;
        this.patente = patente;
    }
    
    public String getPatente() {
        return patente;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public double getPrecioArriendo() {
        return precioArriendo;
    }
    
    @Override
    public void mostrarDetalleBoleta(){};

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + '}';
    }

}
