/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package empresaeventos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mario
 */
public class EmpresaEventos {

    public static void main(String[] args) {
        //Creo una empresa
        Empresa empresa1 = new Empresa("TutiLaFiesta");
        
        //creo un fomato para manejo de fechas
        LocalDate fechaEvento1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //Hago la conversión de la fecha en formato String a LocalDate
        try {
            fechaEvento1 = LocalDate.parse("20/09/2022", formatter);
        } catch (Exception e) {
            System.out.println("Fecha con formato invalido!!!!!");
        }
        
        //Creo varias fechas a partir de la fechaEvento1
        LocalDate fechaEvento2 = fechaEvento1.plusDays(45);
        LocalDate fechaEvento3 = fechaEvento1.minusDays(500);
        LocalDate fechaEvento4 = fechaEvento1.plusYears(2);
        LocalDate fechaEvento5 = fechaEvento1.plusYears(1);
        
        
        //Creo varios eventos
        Evento evento1 = new Evento(fechaEvento1,4500,165, TipoEvento.CUMPLEAÑOS);
        Evento evento2 = new Evento(fechaEvento2,13000,48, TipoEvento.FIESTA);
        Evento evento3 = new Evento(fechaEvento3,9000,90, TipoEvento.CENA);
        Evento evento4 = new Evento(fechaEvento4,22000,30, TipoEvento.MATRIMONIO);
        Evento evento5 = new Evento(fechaEvento5,11000,45, TipoEvento.MATRIMONIO);
        
        //Agrego los eventos a la lista
        empresa1.agregarEventos(evento1);
        empresa1.agregarEventos(evento2);
        empresa1.agregarEventos(evento3);
        empresa1.agregarEventos(evento4);
        empresa1.agregarEventos(evento5);
        
        //Listar los eventos por orden de fechas 
        empresa1.listarEventosPorFecha();
        
        
        //Determinar el total de ventas por tipo de evento
        empresa1.totalVentasPorTipo();
        
        //Determinar el tipo de evento más solicitado 
        empresa1.tipoEventoMasSolicitado();
        
    }
}
