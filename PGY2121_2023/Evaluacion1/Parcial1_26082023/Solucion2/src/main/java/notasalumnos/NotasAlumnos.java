/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package notasalumnos;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class NotasAlumnos {

    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        Asignatura asignatura = new Asignatura();
        
        do{
            System.out.println("\n----------Sitema Notas Final ---------");
            System.out.println("1.- Ingresar Estudiante");
            System.out.println("2.- Ingresar Asignatura");
            System.out.println("3.- Calcular nota presentacion y si está eximido");
            System.out.println("4.- Ingresar Nota Examen y calcular estado final alumno: ");
            System.out.println("5.- Salir");
            System.out.print("Ingresar opcion:");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: ingresarEstudiante(estudiante);
                    break;
                case 2: ingresarAsignatura(asignatura, estudiante);
                    break;
                case 3: calcularNotaPresentacion(asignatura);
                    break;
                case 4: ingresarNotaExamen(asignatura);
                    break;
                default: System.out.println("Opción invalida!!!");
            }
            
        }while( opcion!=5 );
    }
    
    public static void ingresarNotaExamen(Asignatura asignatura){      
        Scanner entrada = new Scanner(System.in);
        double notaExamen = 0;
        
        do{
            System.out.print("Nota de examen: ");
            notaExamen = entrada.nextDouble();
        }while(notaExamen < 1.0 || notaExamen > 7.0);
        
        asignatura.setNotaExamen(notaExamen);
        double notaPresentacion = asignatura.getNotaPresentacion();
        
        double notaFinal = notaPresentacion*0.6 + notaExamen*0.4;
        
        if( notaFinal >= 4.0){
            System.out.println("Alumno aprobado con nota final " + notaFinal);
        } else {
            System.out.println("Alumno reprobado con nota final " + notaFinal);     
        }
    }
    
    public static void calcularNotaPresentacion(Asignatura asignatura){
        double nota1 = asignatura.getNota1();
        double nota2 = asignatura.getNota2();
        double nota3 = asignatura.getNota3();
                      
        double notaPresentacion = (nota1*0.3) + (nota2*0.3) + (nota3*0.4);
        
        if (notaPresentacion >= 5.0){
            System.out.println("El alumno tiene nota " + notaPresentacion +", está eximido" );
        } else {
            System.out.println("El alumno tiene nota " + notaPresentacion + ", debe dar examen");
        }
        asignatura.setNotaPresentacion(notaPresentacion);
    }
    
    public static void ingresarAsignatura(Asignatura asignatura, Estudiante estudiante){
        Scanner entrada = new Scanner(System.in);
        String codigo, nombre;
        double nota1=0, nota2=0, nota3=0;
        
        System.out.print("Codigo asignatura: ");
        codigo = entrada.nextLine();
        
        System.out.print("Nombre asignatura: ");
        nombre = entrada.nextLine();
        
        do{
            System.out.print("Nota1: ");
            nota1 = entrada.nextDouble();
        }while(nota1 < 1.0 || nota1 > 7.0);
        
        do{
            System.out.print("Nota2: ");
            nota2 = entrada.nextDouble();
        }while(nota2 < 1.0 || nota2 > 7.0);
        
        do{
            System.out.print("Nota3: ");
            nota3 = entrada.nextDouble();
        }while(nota3 < 1.0 || nota3 > 7.0);
        
        asignatura.setCodigo(codigo);
        asignatura.setNombre(nombre);
        asignatura.setEstudiante(estudiante);
        asignatura.setNota1(nota1);
        asignatura.setNota2(nota2);
        asignatura.setNota3(nota3);
        
        System.out.println(asignatura);
                        
    }
    
    
    public static void ingresarEstudiante(Estudiante estudiante){
        Scanner entrada = new Scanner(System.in);
        int rut, edad;
        String dv, nombre;
        
        System.out.print("\nRut estudiante: ");
        rut = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.print("Dv estudiante: ");
        dv  = entrada.nextLine();
        
              
        do{
            System.out.print("Nombre estudiante: ");
            nombre = entrada.nextLine();
        }while( nombre.isEmpty());
        
        do{
            System.out.print("Edad estudiante: ");
            edad = entrada.nextInt();
        }while( edad<18 || edad > 99);
        
        estudiante.setRut(rut);
        estudiante.setDv(dv);
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        
        System.out.println(estudiante);
    }
}
