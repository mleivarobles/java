/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package streaming;

/**
 *
 * @author mario
 */
public class Streaming {

    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Crazy Night","Alanis",700, true, false);
        
        System.out.println(cancion1.getArtista());
        System.out.println(cancion2.getTitulo());
        cancion2.adelantarCancion(90);
        System.out.println(cancion2.getPosicion());
        cancion2.imprimirCancion();
        System.out.println(cancion2.tipoCancion());
    }
}
