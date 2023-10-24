/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package colecciongenerica;

/**
 *
 * @author mario
 */
public class ColeccionGenerica {

    public static void main(String[] args) {
        //ejemplo del Generador de Sorteo de String palabras
        GeneradorSorteo<ClubFutbol> sorteo = new GeneradorSorteo<>();
        
        sorteo.add(new ClubFutbol("UdeC",Pais.CHILE));
        sorteo.add(new ClubFutbol("ColoColo",Pais.CHILE));
        sorteo.add(new ClubFutbol("Catolica",Pais.CHILE));
        sorteo.add(new ClubFutbol("Uchile",Pais.CHILE));
        sorteo.add(new ClubFutbol("LDUQ",Pais.ECUADOR));
        
        while( !sorteo.isEmpty()){
            System.out.println("El siguiente sorteado es: " + sorteo.remove());
        }
        
        System.out.println("Quedan equipos?: " + !sorteo.isEmpty() );
    }
    
    public static void delay(int n){
        try {
            Thread.sleep(n * 1000); //pausa en n segundos
            
        } catch (InterruptedException e) {
            System.out.println("Error de delay " + e.getMessage());
        }
    }
}
