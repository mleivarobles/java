/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package resumenmateria;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ResumenMateria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Tipos de datos
        // tipo de datos nombre de la vararible = 0;
        int edad = 67;
        double temperatura = 14.5;
        String nombre;        
        nombre = "Java";
        boolean esRojo; //false o true        
        esRojo = false;
        char genero = 'f';
        
        // tipo de comentario
        
        /* 
        Esto tambien es un comentario
        */
        
        /**
         * Información para comentarios en javadoc
         */
        
        //salida por pantalla
        
        System.out.println("Mi nombre es " + nombre + " y mi edad es " + edad);
        
        // ingreso por pantalla (al usuario)
        // ingreso de un entero
        
        Scanner entrada = new Scanner(System.in);        
        //System.out.println("Ingrese un valor:");
        System.out.print("Ingrese un valor:"); // el cursor queda en la misma linea solictando datos
        int valor = entrada.nextInt(); //espera el ingreso de un entero.
        System.out.println("El valor ingesado es " + valor);
        
        entrada.nextLine(); //despues de un valor se debe incluir esta linea.
        
        //ingreso de un string o cadena
        System.out.print("Ingresar nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Mi nombre es " + nombre);
        
        //estructuras repetitivas 
        //do-while
        //while
        //for
        
        System.out.print("Ingresar valor1: ");
        int valor1 = entrada.nextInt();       
        System.out.print("Ingresar valor2: ");
        int valor2 = entrada.nextInt();
        System.out.print("Ingresar valor3: ");
        int valor3 = entrada.nextInt();
        
        //dowhile 1...n veces
        
        System.out.println("dowhile");
        int contador = 0;
        
        do{ //repetir
            System.out.print("Ingresar valor: ");
            valor1 = entrada.nextInt(); 
            contador = contador + 1;
        }while( contador < 3);  //hasta el contador sea igual 3
        
        //while 0..n veces
        
        System.out.println("while");
        contador = 0;
        while( contador < 3){
            System.out.print("Ingresar valor: ");
            valor1 = entrada.nextInt(); 
            contador = contador + 1;
        };
        
        
        System.out.println("For");
        //for i=0, 1, 2, 3, 4
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresar valor " + i +": ");
            valor1 = entrada.nextInt(); 
            suma = suma + valor1;
        }
        System.out.println("Suma= " + suma);
        
        //estrucutras de decisión
        // if-else y switch
        
        System.out.print("Ingresar opcion= ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 0: System.out.println("se ingresó el 0");
                break;
            case 1: System.out.println("se ingresó el 1");
                break;
            case 2: System.out.println("Se ingresó el 2");
                break;
            default: System.out.println("Se ingresó otro numero y era el " + opcion);
                break;
        }

        if ( opcion == 0){
            System.out.println("Ingresó un 0");
        } else if ( opcion == 1){
            System.out.println("Ingresó un 1");
        } else if ( opcion == 2){
            System.out.println("Ingresó un 2");
        } else {
            System.out.println("Se ingreso otro numero y era " + opcion);
        }
        
        boolean esAzul = false; //no es azul
        
        if ( !esAzul ){ // esAzul == false; !esAzul
            System.out.println("Es azul!!!");
        } else {
            System.out.println("Es de otro color");
        }
    }
}
