/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricainstrumentos;

/**
 *
 * @author mario
 */
class Instrumento {
    
    private String idInstrumento;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String idInstrumento,double precio, TipoInstrumento tipo) {
        this.idInstrumento = idInstrumento;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public String getIdInstrumento() {
        return idInstrumento;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "idInstrumento=" + idInstrumento + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
}
