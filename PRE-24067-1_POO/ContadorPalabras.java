import java.util.Scanner;

/**
 * Crea un programa que reciba una frase por consola y muestre:
La cantidad total de palabras
La cantidad de caracteres (sin contar espacios)
La palabra más larga y cuántas letras tiene
La frase invertida (palabra por palabra, no letra por letra)
 */
public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = new String();
        int cantidad = 0;
        int letrasPalabraMasLarga = 0;
        int cantidadCaracteres = 0;
        String palabraMasLarga = new String();
        String fraseInvertida = new String();

        System.out.print("Ingresa una frase: ");
        frase = scanner.nextLine();

        //separo la frase en un array de strings usando el espacio " "
        String[] fraseSeparada = frase.split(" "); 
        for (String palabra : fraseSeparada) {
            cantidadCaracteres+=palabra.length();
            if (palabra.length() > letrasPalabraMasLarga) {
                letrasPalabraMasLarga = palabra.length();
                palabraMasLarga = palabra;
            }
            cantidad++;
        }

        for (int i = cantidad-1; i > -1; i--) {
            fraseInvertida = fraseInvertida + fraseSeparada[i];
            if (i != 0) {
                fraseInvertida = fraseInvertida + " ";               
            }
        }

        System.out.println("Cantidad de palabras: " + cantidad);
        System.out.println("Caracteres sin espacio: " + cantidadCaracteres);
        System.out.println("Palabra más larga: " + palabraMasLarga + " ("+letrasPalabraMasLarga+") letras");
        System.out.println("Frase invertida: " + fraseInvertida);
        scanner.close();
    }
}