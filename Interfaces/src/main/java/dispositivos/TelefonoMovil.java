/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author mario
 */
public class TelefonoMovil extends Dispositivo implements interfaces.EnviadorDeMensaje {
    
    public void encender(){
        System.out.println("Encendiendo el dispositivo...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println("Enviando mensaje de texto con " + mensaje);
    }
}
