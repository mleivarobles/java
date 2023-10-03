/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanino;

/**
 *
 * @author mario
 */
public class CityCar extends Vehiculo {
    
    private double rendimiento;

    public CityCar(double rendimiento, String patente, String modelo, Categoria categoria) {
        super(patente, modelo, categoria);
        this.rendimiento = rendimiento;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Rendimiento: " + rendimiento);
    }
    
}
