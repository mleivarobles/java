/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio232;

/**
 *
 * @author mario
 */
public class Musica extends Interes {
    
    private final String tipoMusica;
    private static int totalLikes; //atributo de clase para registrar el total de likes
    private static int totalMinutos;//atributo de clase para registro total de minutos conectados

    public Musica(String tipoMusica, String usuario, String password, 
            int tiempoConectado, int cantidadLikes) {
        super(usuario, password, tiempoConectado, cantidadLikes);
        this.tipoMusica = tipoMusica;
        this.almacenarLikes();
        this.almacenarTiempo();
    }

    public static int getTotalLikes() {
        return totalLikes;
    }

    public static int getTotalMinutos() {
        return totalMinutos;
    }
    
    @Override
    public void listar(){
        super.listar();
        System.out.println(" Tipo de musica: " + tipoMusica);
    }

    @Override
    public void almacenarLikes() {
        Musica.totalLikes = Musica.totalLikes + getCantidadLikes();
    }

    @Override
    public void almacenarTiempo() {
        Musica.totalMinutos = Musica.totalMinutos + getTiempoConectado();
        
    }

    
}
