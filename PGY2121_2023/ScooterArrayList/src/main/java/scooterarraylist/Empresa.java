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
        return this.empleados.add(empleado);
    }
    
    public boolean buscarEmpleado(int rut){
        for (Empleado empleado : empleados) {
            if(empleado.getRut() == rut){
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEmpleado(int rut){
        for (Empleado empleado : empleados) {
            if (buscarEmpleado(rut)){
                this.empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }
    
    public void listarEmpleados(){
        for (int i = 0; i < empleados.size(); i++) {
            
            System.out.println("["+(i+1)+"]: " + empleados.get(i).getNombreCompleto());
        }
    }
    
}
