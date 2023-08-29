/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author mario
 */
public class Termo {
    
    private double capMaxima;
    private double capActual;
    private double temperatura;
    private Cafe cafe; //cafe

    public Termo(double capMaxima, Cafe cafe) {
        this.capMaxima = capMaxima;
        this.capActual = 0;
        this.temperatura = 0;
        this.cafe = cafe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Termo{");
        sb.append("capMaxima=").append(capMaxima);
        sb.append(", capActual=").append(capActual);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", cafe=").append(cafe);
        sb.append('}');
        return sb.toString();
    }

    public double getCapActual() {
        return capActual;
    }
   
    public void rellenarTermo(double relleno){
        if ( capActual + relleno <= capMaxima ) {
            this.capActual+= relleno;
            System.out.println("El termo quedó con " + capActual );
        } else {
            System.out.println("El relleno superó la capcidad maxima de " + capMaxima);
        }
    }
    
    public void servirTaza(double taza){
        if ( capActual >= taza ){
            this.capActual-= taza;
            System.out.println("Se rebajó en una taza de " + taza);
        } else {
            System.out.println("No es posible servir la taza de " + taza);
        }
    }
}
