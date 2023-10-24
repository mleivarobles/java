
package mascota;

import interfaces.Descuento;

/**
 *
 * @author mario
 */
public abstract class Mascota implements Descuento {
    
    private String codigo;
    private String nombre;
    private double peso;
    private int diasAlojamiento;
    private boolean requiereSupervision;

    //constructor de clase Mascota
    public Mascota(String codigo, String nombre, double peso, 
            int diasAlojamiento, boolean requiereSupervision) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.diasAlojamiento = diasAlojamiento;
        this.requiereSupervision = requiereSupervision;
    }

    public String getCodigo() {
        return codigo;
    }
        
    //metodo para mostrar datos que será sobreescrito por las subclases
    public void mostrarDatos(){
        System.out.print(" Mascota: "+ nombre);  
    }
    
    //metodo para calcular el valor del alojamiento de una mascota
    //Como es publico es heredado por las subclases.
    public double cacularValorAlojamiento(){
        return diasAlojamiento * Descuento.VALOR_DIA_ALOJAMIENTO;
    }
    
}
