import java.util.Scanner;

/**
 * SerieLeibniz
 * π/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...
 * Crea un programa que calcule esta sumatoria usando un ciclo. El programa debe:
 * Pedir al usuario cuántos términos quiere calcular (por ejemplo 1000, 10000, 1000000)
 * Mostrar el valor aproximado de π en cada paso de a 1000 términos
 * Al final mostrar tu aproximación vs el valor real de Math.PI
 */

public class SerieLeibniz {

    public static int esImpar(int i){
        return i % 2; //0 es par, 1 es impar
    }

    public static void main(String[] args) {

        int limite = 0;
        double suma = 0.0;
        double termino = 0.0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos terminos calculamos: ");
        limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            termino = 1.0 / i;
            if (esImpar(i) == 1){
                contador++;
                if (contador == 2){
                    contador = 0;
                    termino = -termino;
                }
            suma = suma + termino;
            }            
            if ( i % 1000 == 0){
                System.out.println("Terminos: " + i + " | PI = " + 4.0 * suma);
            }
        }
        double aproximacion = 4 * suma;
        System.out.println("Valor real de PI: " + Math.PI);
        System.out.println("Tu aproximación: " + aproximacion);
        System.out.printf("Diferencia: %.15f%n", Math.abs(Math.PI - aproximacion));
        scanner.close();
    }
}