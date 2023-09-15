/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.time.LocalDate;

/**
 *
 * @author mario
 */
public class Evento {
    
    private static int codigo = 0; //atributo de clase, correlativo uniico
    private LocalDate fechaEvento;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private String ubicacion;
    private double precio;
    private int cantidadPersonas;
    private String[] tipoEvento; //Cumple, matriminio, cena, fiesta
    private boolean incluyeEntretencion;
    
    
    
}
