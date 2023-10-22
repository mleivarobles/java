/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raices;


/**
 *
 * @author mario
 */
public class Raiz {
    
    private double a;
    private double b;
    private double c;

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminante(){
        //double disc = Math.pow(b,2) - 4 * a * c;
        double disc = b*b - 4 * a * c; 
        
        return disc;
    }
    
    private boolean tieneRaices(){   
        return getDiscriminante() >= 0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    
    private void obtenerRaiz(){
        double raiz; 
        raiz = -b / 2*a;
        System.out.println("La ecuación tiene solución unica= " + raiz);
    }
    
    private void obtenerRaices(){
        double raiz1;
        double raiz2;
        double disc = getDiscriminante();
        
        raiz1 = (-b - Math.sqrt(disc)) / 2*a ;
        raiz2 = (-b + Math.sqrt(disc)) / 2*a;
        System.out.println("La raices de la solucion son= " + raiz1 + " y " + raiz2);
    }
    
    public void calcular(){
        
        if(tieneRaiz()){
            obtenerRaiz();
        } else if(tieneRaices()){
            obtenerRaices();
        } else {
            System.out.println("La ecuación no tiene raices reales!!!!!");
        }
    }
}

