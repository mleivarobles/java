/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author mario
 */
//La subclase Cadena es un tipo de Joya (hereda)
public class Cadena extends Joya{
    
    private int largoCadena;

    public Cadena(int largoCadena, int codigo, String nombre, String material) {
        //Invoca al constructor de la superclase (Joya) para iniciializar los
        //parametros de joya
        super(codigo, nombre, material);
        this.largoCadena = largoCadena;
    }

    @Override
    public String toString() {
        //La instrucción super.toString() invoca al metodo toString() de la superclase (Joya)
        return (super.toString() + " largo cadena:" + largoCadena);
    }
    
}
