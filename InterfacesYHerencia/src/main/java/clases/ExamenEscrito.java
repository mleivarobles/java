/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mario
 */
public class ExamenEscrito extends Examen{
    
    
    private static final int NOTA_MIN = 1;
    private static final int NOTA_MAX = 100;
    private static final int NOTA_APROBACION = 60;
    private static final int TIEMPO_MAX_DURACION = 90;
        
    private int duracion; // en minutos
    private int notaNumerica; // 1..100

    public ExamenEscrito(int duracion, int notaNumerica, String fechaRealizacion) {
        super(fechaRealizacion);
        this.duracion = duracion;
        this.notaNumerica = notaNumerica;
    }
    
}
