/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package figurasgeometricas;

/**
 *
 * @author mario
 */
public class FiguraGeometrica {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Circulo c1  = new Circulo(2);
        Rectangulo r1 = new Rectangulo(6, 2);
        
        System.out.println(c1.calcularArea());
        System.out.println(r1.calcularPerimetro());
    }
}

class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return  Math.PI * Math.pow(radio, 2);
    }
}

class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int calcularPerimetro(){
        return 2 * (base + altura);
    }
}
