/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scooterarraylist;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Empresa {
    
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    //El Constructor me permite inicializar la lista de empleados cada vez
    // que se cree una empresa nueva.
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    public boolean agregarEmpleado(Empleado empleado){
        return false;
    }
    
    public boolean buscarEmpleado(Empleado empleado){
        return false;
    }
    
    public boolean eliminarEmpleado(Empleado empleado){
        return false;
    }
    
    public void listarEmpleado(){
    }
}
