/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package scooterarraylist;

/**
 *
 * @author mario
 */
public class ScooterArrayList {

    public static void main(String[] args) {
        
        //creo 2 instancias (objetos) de la clase puestos
        Puesto puesto1 = new Puesto(1, "Bodeguero");
        Puesto puesto2 = new Puesto(1, "Asistente");
        
        //creo 3 instancias de la clase Empleado
        Empleado emp1 = new Empleado(192,"Juan Perez", 'M', 20, 55, puesto1);
        Empleado emp2 = new Empleado(33,"Sonia Lopez", 'F', 4, 30, puesto2);
        Empleado emp3 = new Empleado(1443,"Francisca Muñoz", 'F', 7, 26, puesto1);
        
        // Creo la Empresa
        Empresa empresa = new Empresa("Scootin");
        
        //Agrego 2 empleados
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        
        //Listo todos los empleados.
        empresa.listarEmpleados();
        
        int rutBuscar = 33;
        
        if( empresa.buscarEmpleado(rutBuscar) ){
             System.out.println("El empleado existe!!!!");
        } else{
            System.out.println("El empleado no existe");
            
        }
        
        if (empresa.eliminarEmpleado(rutBuscar)){
            System.out.println("El empleado " + rutBuscar + " fue eliminado de la lista");
        } else {
            System.out.println("El empleado no existe");
        }
        
        empresa.listarEmpleados();
    }
}
