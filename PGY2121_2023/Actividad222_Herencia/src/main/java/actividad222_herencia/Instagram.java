/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad222_herencia;

/**
 *
 * @author mario
 */
public class Instagram extends RedSocial {
    
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }
    
    
    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Instagram{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}';
    }
    
    @Override
     public String visualizar(){
         //Uso de operador ternario
        return "El usuario conectado es " + super.visualizar() + (estado ? ": " + historia:"");
    }
    
    
}
