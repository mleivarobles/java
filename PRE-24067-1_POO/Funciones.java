import java.util.Scanner;

/**
 * Funciones
 */
public class Funciones {
    public static int suma(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un valor: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingresa un valor: ");
        numero2 = scanner.nextInt();

        suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + "+" + numero2 + " es: " + suma);
        
        suma = suma(numero1, numero2);
        System.out.println("La suma de " + numero1 + "+" + numero2 + " es: " + suma);
        
        scanner.close();
    }
    
}