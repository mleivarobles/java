/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author mario
 */
public class Anillo extends Joya{
    
    private int medida;

    public Anillo(int medida, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.medida = medida;
    }

    @Override
    public String toString() {
        return (super.toString() + " medida anillo: " + medida);
    }
}
