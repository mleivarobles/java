/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package usostring;

/**
 *
 * @author mario
 */
public class UsoString {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cadena c = new Cadena();
        
        System.out.println("El largo de la cadena es " + c.cadena.length());
        System.out.println("Ahora sin espacios  " + c.cadena.trim());
        System.out.println("Ahora a mayusculas  " + c.cadena.trim().toUpperCase());
        
        String s = c.cadena.trim().toUpperCase();
        String concatenada  = s.concat("12345");
        System.out.println(concatenada);
        
        String extraido = concatenada.substring(26, 36);
        System.out.println(extraido);
        
        String reemplazo = extraido.replace("O", "O");
        
        System.out.println(reemplazo);
        
        if( reemplazo.equalsIgnoreCase("Escritorio")){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        
        var palabra = "Hola Mundo FutboleroChleno ";
        System.out.println(palabra);
        System.out.println("La palbra tiene " + calcularMayusculas(palabra) +" letras mayusculas");
        
        
        String numero = "1000";
        int entero = Integer.parseInt(numero);
        entero++;
        System.out.println(entero);
        
       
        }
        
    static int calcularMayusculas(String palabra){
        int letrasMay = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if ( Character.isUpperCase(c) ){
                letrasMay++;
            }
        }
        return letrasMay;
    }   
}

