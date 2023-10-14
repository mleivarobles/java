/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio232;

/**
 *
 * @author mario
 */
public abstract class Interes implements Almacenable{
    
    private String usuario;
    private String password;
    private int tiempoConectado;
    private int cantidadLikes;

    public Interes(String usuario, String password, int tiempoConectado, int cantidadLikes) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
        this.cantidadLikes = cantidadLikes;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public int getCantidadLikes() {
        return cantidadLikes;
    }
    
    public void listar(){
        System.out.print("Usuario: " + usuario);
    }
    
}
