/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arraylist_objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class ArrayList_Objetos {

    public static void main(String[] args) {
        
        //crear lista de objetos del tipo de Alumno
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
              
        Date fechaEspecifica = new Date(122, 7, 17); // año 1900+122= 2022, mes=parte de 0 y dia=17
        
        //creo 2 objtos del tipo alumno
        Alumno alumno1 = new Alumno(1, "Juan Perez");
        Alumno alumno2 = new Alumno(2, "Jose Soto",22, new Date()); // new Date() devulve la fecha actual (hoy)
        Alumno alumno3 = new Alumno(4, "Sonia Muñoz",34,fechaEspecifica);
        
        //agrego 2 alumnos a la lista alumnos
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        
        System.out.println("Lista de Alumnos: " + alumnos);
        
        //recorro la lista con for each
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        
        System.out.println("La lista tiene " + alumnos.size() + " alumnos");
        
        System.out.println("El alumno " + alumno2.getNombre() + " ingresó el día " + alumno2.getFechaIngresoFormateada());
        System.out.println("El alumno " + alumno3.getNombre() + " ingresó el día " + alumno3.getFechaIngresoFormateada());
        
        Alumno alumno4 = alumnos.get(1); //accedo al objeto de tipo alumno que está en la posición 1
        
        System.out.println(alumno4);
        
    }
}
