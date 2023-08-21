/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cachipun;

/**
 *
 * @author mario
 */
public class Cachipun {

    public static void main(String[] args) {
        PiedraPapelTijera ppt = new PiedraPapelTijera();
        
        for (int[] p : ppt.getTablero()) {
            for (int i : p) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        
        Mano j1 = Mano.TIJERA;
        Mano j2 = Mano.PAPEL;
        
        
        int ganador = ppt.ganador(j1, j2);
        System.out.println("Ganador " + ganador);
        
        switch(ganador){
            case 0: System.out.println("Empataron");
                break;
            case -1: System.out.println("Jugador 2 gana");
                break;
            case 1: System.out.println("Jugador 1 que tiene " + j1.getIndex());
                break;
        };
    }
}
