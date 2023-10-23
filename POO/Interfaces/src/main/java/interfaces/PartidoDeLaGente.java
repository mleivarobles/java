/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class PartidoDeLaGente {
    
    ArrayList<EnviadorDeMensaje> mensajeros;

    public PartidoDeLaGente() {
        this.mensajeros = new ArrayList<>();
    }
    
    public void agregarMensajero(EnviadorDeMensaje mensajero){
        this.mensajeros.add(mensajero);
    }
    
    public void hacerCampania(){
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el PDG");
        }
    }
}
