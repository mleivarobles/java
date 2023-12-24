/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author mario
 */
public class RegistroEvento {
    
    private Cliente cliente;
    private Evento evento;
    private Date fecha; //fecha y hora

    public RegistroEvento(Cliente cliente, Evento evento) {
        this.cliente = cliente;
        this.evento = evento;
        //this.fecha = new Date(); //registro fecha y hora actual de la venta        
        this.fecha = fechaAleatoria(); //para ejemplos
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public Date getFecha() {
        return fecha;
    }
    
    private Date fechaAleatoria(){
        
        int añoInicio = 2014;
        int añoFin = 2023;

        Random random = new Random();
        int añoAleatorio = random.nextInt(añoFin - añoInicio + 1) + añoInicio;
        int diaDelAñoAleatorio = random.nextInt(365) + 1;

        Instant instanteAleatorio = LocalDate.ofYearDay(añoAleatorio, diaDelAñoAleatorio).atStartOfDay().toInstant(ZoneOffset.UTC);
        Date fechaRandom = Date.from(instanteAleatorio);

        return fechaRandom;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", evento=" + evento + ", fecha=" + fecha + '}';
    }    
}
