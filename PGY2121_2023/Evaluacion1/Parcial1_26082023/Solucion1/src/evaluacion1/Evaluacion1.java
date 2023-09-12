/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion1;

import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class Evaluacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        Estudiante estudiante = new Estudiante();
        Asignatura asignatura = new Asignatura();
        
        do{
            System.out.println("\n------Sistema Nota Final------");
            System.out.println("1.- Ingresar Estudiante");
            System.out.println("2.- Ingresar Asignatura");
            System.out.println("3.- Calcular Nota Presentación y si está eximido");
            System.out.println("4.- Ingresar Nota Examen y estado final");
            System.out.println("5.- Salir");
            System.out.print("Ingresar opcion: ");
            opcion = entrada.nextInt();
            
            switch( opcion ){
                case 1: 
                    entrada.nextLine();
                    System.out.println("\nIngreso de información de estudiante");
                    System.out.print("Rut Estudiante: ");
                    String rut = entrada.nextLine();
                    
                    System.out.print("Dv Estudiante: ");
                    String dv = entrada.nextLine();
                    
                    String nombreEstudiante;
                    do{
                        System.out.print("Nombre Estudiante: ");
                        nombreEstudiante = entrada.nextLine();
                    }while( nombreEstudiante.length()== 0);
                    
                    int edad = 0;
                    do{
                        System.out.print("Edad Estudiante: ");
                        edad = entrada.nextInt();
                    }while( edad<18 || edad>99);
                    
                    estudiante.setRut(rut);
                    estudiante.setDv(dv);
                    estudiante.setNombre(nombreEstudiante);
                    estudiante.setEdad(edad);
                    
                    System.out.println(estudiante);
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("\nIngreso de información de asignatura");
                    
                    System.out.print("Codigo asignatura: ");
                    String codigo = entrada.nextLine();
                    
                    System.out.print("Nombre asignatura: ");
                    String nombreAsignatura = entrada.nextLine();
                    
                    System.out.println("Nombre estudiante: " + estudiante.getNombre() );
                    
                    double nota1, nota2, nota3;
                                        
                    System.out.print("Nota1: ");
                    nota1 = entrada.nextDouble();
                    System.out.print("Nota2: ");
                    nota2 = entrada.nextDouble();
                    System.out.print("Nota3: ");
                    nota3 = entrada.nextDouble();
                    
                    asignatura.setCodigo(codigo);
                    asignatura.setNombre(nombreAsignatura);
                    asignatura.setEstudiante(estudiante);
                    asignatura.setNota1(nota1);
                    asignatura.setNota2(nota2);
                    asignatura.setNota3(nota3);
                    
                    System.out.println(asignatura);
                    break;
                case 3:
                    System.out.println("\nCalculando nota presentacion");
                    double notaPresentacion = redondear(calcularNotaPresentacion(asignatura));
                    
                    System.out.println("Nota de presentacion: " + notaPresentacion );
                    asignatura.setPresentacion(notaPresentacion);
                    
                    if(calcularEximicion(notaPresentacion)){
                        System.out.println("El estudiante está eximido!!!!");
                    } else {
                        System.out.println("El estudiante debe dar examen");
                    }                   
                    break;
                case 4:
                    System.out.println("\nNota Examen y final");
                    System.out.print("Nota examen: ");
                    
                    
                    double examen = entrada.nextDouble();
                    double presentacion = asignatura.getPresentacion();
                    double notaFinal = redondear(calcularNotaFinal(presentacion, examen));
                   
                    
                    if ( notaFinal >= 4.0){
                         System.out.println("Estudiante aprobado con nota " + notaFinal);
                         asignatura.setEstado("Aprobado");
                    } else {
                         System.out.println("Estudiante reprobado con nota " + notaFinal);
                         asignatura.setEstado("Reprobado");
                    }
                    asignatura.setExamen(examen);
                    System.out.println(asignatura);
                    break;
            }
        }while(opcion !=5 );   
    }
    
    private static double redondear(double nota) {  
        return Math.round(nota * 100.0)/100.0; //redondeo a 2 decimales
    }
    
    public static double calcularNotaFinal(double presentacion, double examen){
        return presentacion*0.6 + examen*0.4;
    }
    
    public static boolean calcularEximicion(double nota){
        return nota >= 5.0;
    }
    
    public static double calcularNotaPresentacion(Asignatura asignatura){
        double nota1 = asignatura.getNota1();
        double nota2 = asignatura.getNota2();
        double nota3 = asignatura.getNota3();
        
        return nota1*0.3 + nota2*0.3 + nota3*0.4;
    }
}
