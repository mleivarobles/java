
package model;

import java.text.DecimalFormat;

/**
 *
 * @author mario
 */
public class Laptop extends Equipo {
    
    private Double tamanoPantalla;
    private int cantidadPuertosUsb;
    public static int contador = 0;

    public Laptop(String codigo, Double tamanoPantalla, int cantidadPuertosUsb, 
            String descripcionModelo, String cpu, int discoDuro, int cantidadRam, double precio) {
        super(codigo, descripcionModelo, cpu, discoDuro, cantidadRam, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.cantidadPuertosUsb = cantidadPuertosUsb;
    }

    public Double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public int getCantidadPuertosUsb() {
        return cantidadPuertosUsb;
    }

    public void setTamanoPantalla(Double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCantidadPuertosUsb(int cantidadPuertosUsb) {
        this.cantidadPuertosUsb = cantidadPuertosUsb;
    }
    
    @Override
    public String generarCodigo(String codigo) {
        if(codigo.isBlank()){
            Laptop.contador ++;
            DecimalFormat df = new DecimalFormat("0000");
            return ("lap"+df.format(Laptop.contador));
        }else{
            return codigo;
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +super.toString()+ ", tamanoPantalla=" + tamanoPantalla + ", cantidadPuertosUsb=" + cantidadPuertosUsb + '}';
    }
    
    
    
}
