/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayuso;

/**
 *
 * @author mario
 */
public class Computador {
    
    private String marca;
    private int cantidadMemoria;
    private String característicasProcesador;
    private TipoSO tipoSO;
    private double precio;

    public Computador(String marca, int cantidadMemoria, String característicasProcesador, TipoSO tipoSO, double precio) {
        this.marca = marca;
        this.cantidadMemoria = cantidadMemoria;
        this.característicasProcesador = característicasProcesador;
        this.tipoSO = tipoSO;
        this.precio = precio;
    }

    public Computador() {
    }
    
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Computador{" + "Marca=" + marca + ", cantidadMemoria=" + cantidadMemoria + ", caracter\u00edsticasProcesador=" + característicasProcesador + ", tipoSO=" + tipoSO + ", precio=" + precio + '}';
    }
}
