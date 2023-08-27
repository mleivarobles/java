/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package claseresumen;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ClaseResumen {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Amelia", "Rodriguez");
        Alumno alumno2 = new Alumno("Jorge", "ElCurioso");
        
        
        alumno2.setApellido("Zapata");
        alumno2.setApellido("Larrian");
               
        
        System.out.println("Nombre alumno1 " + alumno1.getNombre());
        System.out.println("Apellido alumno2 " + alumno2.getApellido());
        
        System.out.println("Imprimrir toda la información del alumno " + alumno1);
        
        System.out.println("Alumno2 " + alumno2.getNombreCompleto());
        
        
        Scanner entrada = new Scanner(System.in);
        
        //validar que la edad >0
        // se repite do while mientras la condición sea verdadera.
        int edad;
        System.out.println("dowhile");
        do{
            System.out.print("Ingresar edad del alumno: ");
            edad = entrada.nextInt(); // >0
        }while( edad < 0 || edad > 99 ); // >
        
        entrada.nextLine();
        System.out.println("while");
        edad = -1;
        while( edad <0 || edad > 99){
            System.out.print("Ingresar edad del alumno: ");
            edad = entrada.nextInt(); // >0
        }
        
        alumno1.setEdad(edad); //modificando el atributo edad
        System.out.println(alumno1);
        
    }
}
