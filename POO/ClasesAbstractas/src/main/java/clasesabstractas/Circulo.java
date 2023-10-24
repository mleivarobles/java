/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

/**
 *
 * @author mario
 */
public class Circulo extends Figura {
    
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio, double posicionx, double posiciony) {
        super(posicionx, posiciony);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
       return ( Math.pow(radio, Math.PI) );
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
   
}
