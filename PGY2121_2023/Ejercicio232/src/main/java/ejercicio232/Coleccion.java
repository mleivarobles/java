/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio232;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Coleccion {
    
    private ArrayList<Interes> intereses;

    public Coleccion() {
        this.intereses = new ArrayList<>();
    }

    public void agregarInteres(Interes i){
        this.intereses.add(i);
    }
    
    public void listarIntereses(){
        for (Interes interes : intereses) {
            interes.listar();
        }
    }
    
    public void masLike(){
        Interes tema = null;
        int max = -1;
        
        for (Interes interes : intereses) {
            int cantidad = interes.getCantidadLikes();
            if( cantidad > max ){
                max = cantidad;
                tema = interes;
            }
        }
        
        if(tema instanceof Musica){
            System.out.println("\nMusica es el interes con más likes: " + max);
        } else if(tema instanceof RedSocial){
            System.out.println("\nRedSocial es el interes con más likes: " + max);
        } else {
            System.out.println("\nTVSeries es el interes con más likes: " + max);
        }
    }
}
