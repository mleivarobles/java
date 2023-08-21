/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mario
 */
public class Profesor {
    
    public String variablePubica = "variablePubica"; // es accesible dentro de todas las clases del proyecto
    private String variablePrivada = "variablePrivada"; //solo es accesible dentro de la clase profesor
    protected String variableProtected = "variableProtected"; //es accesible dentro de la misma clase y de otras clases del package
    
    static String institucion = "DUOC"; //esta variable tendrá el mismo valor para todas las instancias de la clase.  
    
    public static void main(String[] args) {
        
        Profesor profe1 = new Profesor();
        System.out.println(profe1.variablePrivada);
        
        Profesor profe2 = new Profesor();
        Profesor profe3 = new Profesor();
        System.out.println(Profesor.institucion); // a la variable se accede por la clase independiente de las clase
        
        Profesor.institucion = "ESUCOMEX";
        System.out.println(Profesor.institucion);
    }
    
}
