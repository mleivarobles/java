/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasepila;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Pila {
    
    private ArrayList<Integer> lista;

    public Pila() {
        this.lista = new ArrayList<>(); //inicializo lista vacia
    }
       
    
    private boolean esVacio(){
        return lista.isEmpty();
    }
    
    public void encolar(int elemento){
        this.lista.add(elemento);
        dibujarPila();
    }
    
    public void desencolar(){
        if (!esVacio()){
            int n = lista.size();
            this.lista.remove(n-1);
        } else {
            System.out.println("No hay elementos en la pila!!!!");
        }
        dibujarPila();
    }
    
    private void dibujarPila(){
        System.out.println("");
        for (int i = lista.size()-1; i >= 0; i--) {
            System.out.println("["+(i+1)+"] = |" + lista.get(i) +"|");
        }
        System.out.println("      ----");
    }
}
