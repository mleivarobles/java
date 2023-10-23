/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import clases.*;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        
        //creo un instituto
        Instituto duoc = new Instituto("DUOC", "Huechuraba");
        
        //creo 3 alumnos
        Alumno alumno1 = new Alumno("14427682","Juan","Perez");
        Alumno alumno2 = new Alumno("22196260","Alonso","Robles");
        Alumno alumno3 = new Alumno("5334497","Sara","Muñoz");
        
        //agrego los examemes para todos los alumnos (Orales y Escritos)
        alumno1.agregarExamen(new ExamenEscrito(78,45,"21/10/2023"));
        alumno1.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "22/09/2022"));
        
        alumno2.agregarExamen(new ExamenEscrito(100,65,"11/09/2023"));
        alumno2.agregarExamen(new ExamenEscrito(78,70,"12/09/2023"));
        alumno2.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE,"21/04/2023"));
        
        alumno3.agregarExamen(new ExamenEscrito(90,80,"11/09/2023"));
        alumno3.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "14/04/1976"));
        
        //agrego alumnos al Instituo
        duoc.agregarAlumno(alumno1);
        duoc.agregarAlumno(alumno2);
        duoc.agregarAlumno(alumno3);
        
        System.out.println("Cantidad de alumnos aprobados: " + duoc.cantAlumnosAprobados());
    }
}
