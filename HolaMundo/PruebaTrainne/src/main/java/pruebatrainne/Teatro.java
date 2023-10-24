/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatrainne;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Teatro {
    
    private char[][] butacas;
    private String nombre;
    private final char LIBRE = 'L';
    private final char OCUPADO = 'X';
   

    public Teatro(String nombre) {
        inicializarButacas();
        this.nombre = nombre;
    }
    
    public void mostrarButacas(){
        for (int i = 0; i < 10; i++) {
            System.out.print("["+(i+1)+"]");
            for (int j = 0; j < 10; j++) {
                System.out.print(butacas[i][j] + " ");                
            }
            System.out.println("");
        }
    }
    
    private void inicializarButacas(){
        this.butacas = new char[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                butacas[i][j] = LIBRE;
            }
        }
    }
    
    private boolean asientoLibre(int i, int j){
        
        if (butacas[i][j] == LIBRE){
            return true;
        }
        return false;
    }
    
    public void reservarAsiento(){
        Scanner entrada = new Scanner(System.in);
        mostrarButacas();
        int fila;
        int asiento;
        boolean libre = true;
        
        do{
            do{
                System.out.print("Ingrese N° fila: ");
                fila = Integer.parseInt(entrada.nextLine());
            }while(fila<1 || fila >10);

            do{
                System.out.print("Ingrese N° asiento: ");
                asiento = Integer.parseInt(entrada.nextLine());
            }while(asiento<1 || asiento >10);

            System.out.println("Asiento["+fila+","+asiento+"]");

            libre = asientoLibre(fila-1,asiento-1);

            if(libre){
                butacas[fila-1][asiento-1] = OCUPADO;
                System.out.println("El asiento fue reservado.");
            } else {
                System.out.println("Asiento ocupado. Elija otro");
            }
        }while(!libre);
        
    }
    
}
