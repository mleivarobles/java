/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clasesabstractas;

/**
 *
 * @author mario
 */
public class ClasesAbstractas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Circulo circulo1 = new Circulo(4.5,5,6);
        System.out.println(circulo1.calculaArea());
        
        Cuadrado cuadrado1 = new Cuadrado(5,2,3);
        cuadrado1.setLado(6);
        System.out.println(cuadrado1.calculaArea());
        
        System.out.println("");
        
        int num1, num2, num3;
        char letra = 'j';
        
        num1 = 4;
        num2 = 3;
        
        num3 = num1 + num2;
        
        System.out.println(num1 + "+"+ num2+ "="+ num3);
    }
}
