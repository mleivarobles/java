/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author mario
 */
public class Persona implements interfaces.EnviadorDeMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Entregando puerta a puerta el mensaje " + mensaje);
    }
    
    
}
