/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio232;

/**
 *
 * @author mario
 */
public class RedSocial extends Interes {
    
    private String nombre;

    public RedSocial(String nombre, String usuario, String password, 
            int tiempoConectado, int cantidadLikes) {
        super(usuario, password, tiempoConectado, cantidadLikes);
        this.nombre = nombre;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println(" Nombre red Social: " + nombre);
    }

    @Override
    public void almacenarLikes() {
        //pendiente implementar ver Clase Musica
        
    }

    @Override
    public void almacenarTiempo() {
        //pendiente implementar ver Clase Musica
    }
    
}
