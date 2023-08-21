/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cachipun;

/**
 *
 * @author mario
 */
public class PiedraPapelTijera {
    
    private int[][] tablero;

    public PiedraPapelTijera() {
        int[][] t = {
        {0,-1,1},
        {1,0,-1},
        {-1,1,0}
        };
        this.tablero = t;
    }

    public int[][] getTablero() {
        return tablero;
    }
    
    public int ganador( Mano j1, Mano j2){
        return tablero[j1.getIndex()][j2.getIndex()];
    }
    
    
}
