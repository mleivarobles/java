/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargaconstructores;

/**
 *
 * @author mario
 */
public class Caja {
    
    private double base;
    private double ancho;
    private double altura;
    private String tipoCaja;
    private String color;

    public Caja(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
    }
    
    public Caja() {
        this.base = 0;
        this.ancho = 0;
        this.altura = 0;
    }

    public Caja(double base, double ancho, double altura, String tipoCaja) {
        this(base, ancho, altura);
        this.tipoCaja = tipoCaja;
    }

    public Caja(double base, double ancho, double altura, String tipoCaja, String color) {
        this(base, ancho, altura, tipoCaja);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Caja{" + "base=" + base + ", ancho=" + ancho + ", altura=" 
                + altura + ", tipoCaja=" 
                + tipoCaja + ", Color = " + color +'}';
    }
    
    public double volumen(){
        return base * ancho * altura;
    }
}
