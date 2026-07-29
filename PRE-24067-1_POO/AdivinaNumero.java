import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(100) + 1; //1 a 100
        System.out.println(("numero: " + numero));
        int elegido = -1;

        while (numero != elegido) {
            System.out.print("Adivina el numero de 1..100: ");
            elegido = scanner.nextInt();
            
            if (elegido != numero) {
                System.out.println("Numero equivocado!!!!");
            }else{
                System.out.println("Bien le diste al numero!!!!!");
            }
        }
        scanner.close();
    }
}