/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cachipun;

/**
 *
 * @author mario
 */
public enum Mano {
    PIEDRA(0),
    PAPEL(1),
    TIJERA(2);
    
    private int index;
    
    private Mano(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
