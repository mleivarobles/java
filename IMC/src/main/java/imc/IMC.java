/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package imc;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class IMC {

    public static void main(String[] args) {
        /*
        IMC = peso
            estatura2
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar el peso:");
        double peso = teclado.nextDouble();
        System.out.print("Ingresar la estatura:");
        double estatura = teclado.nextDouble();
        
        //double imc = peso / estatura*estatura;
        
        double imc = calcularImc(peso, estatura);

        System.out.println("IMC=" +imc);
        
        if(imc < 16){
            System.out.println("Delgadez severa!!!");
        } else if ( imc >=16 && imc <  17){
            System.out.println("Delgadez moderada!!!");
        } else if (imc >=17 && imc < 18.5){
            System.out.println("Delgadez leve!!");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso Normal!!!");
        } else {
            System.out.println("Otro IMC");
        }
    }
    
    public static double calcularImc(double peso, double estatura){
        double imc = peso / Math.pow(estatura,2);
        return imc;
    }
}
