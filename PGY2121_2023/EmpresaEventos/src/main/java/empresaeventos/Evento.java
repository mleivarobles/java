/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author mario
 */
public class Evento implements Comparable<Evento> {
    
    private static int contador = 0; //atributo de clase, correlativo unico
    
    private int codigo;
    private LocalDate fechaEvento;
    private LocalDate horaIni;
    private LocalDate horaFin;
    private String ubicacion;
    private double precio;
    private int cantidadPersonas;
    private TipoEvento tipo; //Enum
    private boolean incluyeEntretencion;

    public Evento() {
        Evento.contador++;
        this.codigo = Evento.contador; //por cada objeto creado incremento en uno el contador
    }
    
    public Evento(LocalDate fechaEvento, double precio, int cantidadPersonas) {
        
        Random random = new Random();
        this.fechaEvento = fechaEvento;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.tipo = TipoEvento.CENA;  //[random.nextInt(4)]; //0,1,2,3        
        Evento.contador++;
        this.codigo = Evento.contador; //por cada objeto creado incremento en uno el contador
    }
    
    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    @Override
    public int compareTo(Evento t) {
        int retorno = 0; //asumo que es igual la fecha
        
        if( this.fechaEvento.isBefore(t.getFechaEvento())){
            retorno = -1;
        } else if(this.fechaEvento.isAfter(t.getFechaEvento())){
            retorno = 1;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", fechaEvento=" + fechaEvento + ", precio=" + precio + ", cantidadPersonas=" + cantidadPersonas + ", tipo=" + tipo + '}';
    }

}
