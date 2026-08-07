/*
    === PIEDRA, PAPEL O TIJERA (al mejor de 5) ===
*/
import java.util.Random;
import java.util.Scanner;

public class Cachipun {

    public static int quienGana(int persona, int maquina){
        //Piedra", "Papel", "Tijera
        //   0        1        2

        if(persona == maquina){
            System.out.println("Empate!!!");
            return 0;
        }
        if((persona == 0 && maquina == 1) || ( persona == 1 && maquina == 2) || (persona == 2 && maquina == 0)){
            System.out.println("Perdiste la ronda!!!!");
            return 2;
        }else{
            System.out.println("Ganaste la ronda!!!!!");
            return 1;
        }      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int persona = 0;
        int maquina = 0;
        String[] eleccion = {"Piedra", "Papel", "Tijera"};
        int marcador[] = {0,0,0};
        int ganador = -1;
        
        for (int i = 0; i < 5; i++) { // 5 rondas
            System.out.println("\n--- Ronda "+(i+1)+" ---");
            System.out.print("Elige (1: Piedra 2:Papel 3: Tijera): ");
            persona = scanner.nextInt()-1;
            maquina = random.nextInt(2); //0..1..2
            System.out.println("Tú: " + eleccion[persona] + " vs " + eleccion[maquina]);
            ganador = quienGana(persona, maquina);
            marcador[ganador] = marcador[ganador] + 1;
        }
        
        System.out.println("==== Fin del Juego ====");
        if(marcador[1] == marcador[2]){
            System.out.println("Empate " + marcador[1] + " a " + marcador[2]);
        }else if (marcador[1] > marcador[2]) {
            System.out.println("Ganaste " + marcador[1] +  " a " + marcador[2]);
        }else{
            System.out.println("Perdiste " + marcador[1] +  " a " + marcador[2]);
        }
        scanner.close();
    }
}
