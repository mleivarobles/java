/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mario
 */
public class ExamenOral extends Examen {
    
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion, String fechaRealizacion) {
        super(fechaRealizacion);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }  

    @Override
    public boolean aprueba() {
        return nivelSatisfaccion.ordinal() >= NivelSatisfaccion.SUFICIENTE.ordinal();
    }
}
