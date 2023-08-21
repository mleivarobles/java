/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barajainglesa;

import cartas.Carta;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class BarajaInglesa {
    
    private ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }
    
    public void mostrarBarajas(){
        for (Carta carta : cartas) {
            carta.mostrar();
        }
    }
    
    private void generarCartas(){
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJokers();
    }
    
    private void generarCartasNumerales(){
        https://www.youtube.com/watch?v=bZqg0kAFY5A&t=451s
    }
    
    private void generarCartasFiguras(){
    }

    private void generarCartasJokers(){
    }
}
