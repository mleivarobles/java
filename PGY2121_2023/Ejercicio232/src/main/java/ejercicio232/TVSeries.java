/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio232;

/**
 *
 * @author mario
 */
public class TVSeries extends Interes {
    
    private String genero;

    public TVSeries(String genero, String usuario, String password, int tiempoConectado, int cantidadLikes) {
        super(usuario, password, tiempoConectado, cantidadLikes);
        this.genero = genero;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println(" Genero Serie: " + genero);
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
