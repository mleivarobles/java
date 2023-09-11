/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mario
 */
public abstract class Examen {
    
    private String fechaRealizacion; //no es tipo fecha, solo referencial por eso es string y no tipo Date
    
    
    //este metodo es abstracto por que examen escrito y oral lo debeb
    //implementar de formas distintas. Y como aparece un metodo abstracto la clase
    // se covierte en abstracta

    public Examen(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
}
