/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas;

/**
 *
 * @author mario
 */
public abstract class Figura {
    
    protected double posicionx;
    protected double posiciony;
    public abstract double calculaArea();

    protected Figura() {
    }

    protected Figura(double posicionx, double posiciony) {
        this.posicionx = posicionx;
        this.posiciony = posiciony;
    }
    
    
    
}
