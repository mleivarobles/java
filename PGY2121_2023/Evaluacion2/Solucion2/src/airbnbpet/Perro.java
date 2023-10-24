/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnbpet;

import interfaces.Alojable;

/**
 *
 * @author cetecom
 */
public class Perro extends Mascota {
    
    private int vecesEjercicio;

    public Perro(int vecesEjercicio, String nombre, double peso, 
            int edad, int diasAlojamiento, String codigo, boolean supervision) {
        super(nombre, peso, edad, diasAlojamiento, codigo, supervision);
        this.vecesEjercicio = vecesEjercicio;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + " y hace ejercicio " + vecesEjercicio + " veces al día";
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getValorAlojamiento();
        if(vecesEjercicio > 3){
            precio = precio + precio*Alojable.INCREMENTO_PERRO/100;
        }
        return precio;
    }
}
