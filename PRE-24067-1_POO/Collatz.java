import java.util.Random;
/*
La conjetura de Collatz dice que para cualquier número entero positivo, si es par lo divides por 2, 
si es impar lo multiplicas por 3 y le sumas 1, y eventualmente siempre llegas a 1.
*/
public class Collatz {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(1000000) + 1; //entre 1...100000
        int contador = 1;
        System.out.println("Numero generado: " + numero);

        while (numero != 1) {
            System.out.print(numero + " -> ");

            if (numero % 2 == 0) { //par
                numero = numero / 2;              
            }else{
                numero = (3 * numero) +1;
            }
            contador++;         
        }
        System.out.println(numero); //agrega el numero al final
        System.out.println("Cantidad de saltos: " + contador);
    }    
}
