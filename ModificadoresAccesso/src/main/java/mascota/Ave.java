/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

/**
 *
 * @author mario
 */
public class Ave {
    
    public String especie;
    protected int cantidadAlas;
    private boolean esVolador;
    String habitat;

    public Ave(String especie, int cantidadAlas, boolean esVolador, String habitat) {
        this.especie = especie;
        this.cantidadAlas = cantidadAlas;
        this.esVolador = esVolador;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Ave{" + "especie=" + especie + '}';
    }
    
    
}
