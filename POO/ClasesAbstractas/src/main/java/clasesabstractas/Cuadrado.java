/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

/**
 *
 * @author mario
 */
public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado() {
    }
    
    public Cuadrado(double lado, double posicionx, double posiciony) {
        super(posicionx, posiciony);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    

    @Override
    public double calculaArea() {
        double area;
        area = Math.pow(lado,2);
        return (lado * lado);
        
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
}
