/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package primeraclase;

/**
 *
 * @author mario
 */
public class PrimeraClase {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Pedro","Fernandez", 20);
        Alumno alumno3 = new Alumno("Diego","Soto", 35);
        Alumno alumno4 = new Alumno("Javer","Perez", 57);
        
        alumno1.confirmarAprobado(4.5);
        alumno2.confirmarAprobado(7.4);
        alumno3.confirmarAprobado(0.0);
        
        alumno1.setNombre("Francisca");
        alumno1.setApellido("Saavedra");
        alumno1.setEdad(90);
        
        System.out.println(alumno1.toString());
        alumno1.confirmarAprobado(3.9);
    }
}
