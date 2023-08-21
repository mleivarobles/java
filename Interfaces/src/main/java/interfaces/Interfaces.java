/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package interfaces;

import aves.PalomaMensajera;
import dispositivos.TelefonoMovil;

/**
 *
 * @author mario
 */
public class Interfaces {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        PartidoDeLaGente pdg = new PartidoDeLaGente();
        pdg.agregarMensajero(new PalomaMensajera());
        pdg.agregarMensajero(new PalomaMensajera());
        pdg.agregarMensajero(new PalomaMensajera());
        
        pdg.agregarMensajero(new TelefonoMovil());
        pdg.agregarMensajero(new TelefonoMovil());
        pdg.agregarMensajero(new Persona());
        
        pdg.hacerCampania();
        
        
    }
}
