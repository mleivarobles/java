/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad222_herencia;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Twitter extends RedSocial {
    
    private int id;
    private String noticia;
    private Date fecha;

    public Twitter() {
    }
    
    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}';
    }
    
    
    @Override
    public String visualizar(){
        return "El usuario conectado es " + super.visualizar() + ": " + noticia + ": " + fecha;
    }
    
}
