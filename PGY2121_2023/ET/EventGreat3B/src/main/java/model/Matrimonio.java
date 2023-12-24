
package model;

import java.text.DecimalFormat;

/**
 *
 * @author mario
 */
public class Matrimonio extends Evento {
    
    private boolean tieneMusica;
    private int cantPlatos;
    public static int contador = 0;

    public Matrimonio(String codigo, boolean tieneMusica, int cantPlatos, String descripcion, 
            int cantidadAsistentes, int tamanioRecinto, int cantidadMesas, double precio) {
        super(codigo, descripcion, cantidadAsistentes, tamanioRecinto, cantidadMesas, precio);
        this.cantPlatos = cantPlatos;
        this.tieneMusica = tieneMusica;
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    public boolean isTieneMusica() {
        return tieneMusica;
    }

    public void setTieneMusica(boolean tieneMusica) {
        this.tieneMusica = tieneMusica;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }
    
    @Override
    public String generarCodigo(String codigo) {
        if(codigo.isBlank()){
            Matrimonio.contador ++;
            DecimalFormat df = new DecimalFormat("0000");
            return ("matri"+df.format(Matrimonio.contador));
        }else{
            return codigo;
        }
    }

    @Override
    public String toString() {
        return "Matrimonio{" + super.toString() +"cantPlatos=" + cantPlatos + ", tieneMusica=" + tieneMusica + '}';
    }
  
}
