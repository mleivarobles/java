/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author mario
 */
public class Joya {
    
    private int codigo;
    private String nombre;
    private String material;
    
    //creo el constructor de la SuperClase Joya
    public Joya(int codigo, String nombre, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.material = material;
    }

    @Override
    public String toString() {
        return "{" + "codigo=" + codigo + ", nombre=" + nombre + ", material=" + material + '}';
    }

}
