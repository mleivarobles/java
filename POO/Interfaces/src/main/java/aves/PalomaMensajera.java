/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aves;

/**
 *
 * @author mario
 */
public class PalomaMensajera extends Ave implements interfaces.EnviadorDeMensaje {
    
    public void volarRapido(){
        System.out.println("Volando!!!");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println("Tirando el papelito " + mensaje);
    }
    
}
