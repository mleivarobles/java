/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributosstatic;

/**
 *
 * @author mario
 */
public class Atleta {
    
    private int id;
    private String nombre;
    private double tiempoPrueba;
    
    private static int contadorAtletas = 1;
    private static String seleccion = "Chile";
    private static double tiempoEquipo;

    public Atleta(String nombre, double tiempoPrueba) {
        this.id = Atleta.contadorAtletas++; //parte en 0 suma 1 y luego asigna.
        this.nombre = nombre;
        this.tiempoPrueba = tiempoPrueba;
    }
    
    public void correr400(){
        //tiempoEquipo = tiempoEquipo + tiempoPrueba;
        Atleta.tiempoEquipo+= tiempoPrueba;
    }
    
    public static void nombreSeleccion(){
        System.out.println("Seleccion " + Atleta.seleccion);
    }
    
    public static void tiempoTotalEquipo(){
        System.out.println("Tiempo total " + Atleta.tiempoEquipo);
    }

    @Override
    public String toString() {
        return "Atleta{" + "id=" + id + ", nombre=" + nombre + ", tiempoPrueba=" + tiempoPrueba + '}';
    }
}
