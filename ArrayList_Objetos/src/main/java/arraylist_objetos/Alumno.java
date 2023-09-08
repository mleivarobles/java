/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist_objetos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class Alumno {
    
    private int id;
    private String nombre;
    private int edad;
    private Date fechaIngreso;
    
    //construí 2 constructores

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Alumno(int id, String nombre, int edad, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }
    
    //formateo un atributo de tipo Date y lo devulvo con un formato especifico
    public String getFechaIngresoFormateada(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //MM: 09, MMM: sept, MMMM, septiembre
        String fechaFormateada = formato.format(fechaIngreso);
        return fechaFormateada;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
}
