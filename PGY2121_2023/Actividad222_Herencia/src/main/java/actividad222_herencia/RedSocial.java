/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad222_herencia;

/**
 *
 * @author mario
 */
public class RedSocial {
    
    private String usuario;
    private String password;

    public RedSocial() {
    }
    
    
    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "usuario=" + usuario + ", password=" + password + '}';
    }
    
    public String visualizar(){
        return usuario;
    }
    
}
