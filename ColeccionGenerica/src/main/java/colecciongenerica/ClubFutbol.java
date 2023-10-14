/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciongenerica;

/**
 *
 * @author mario
 */
public class ClubFutbol {
    
    private String nombre;
    private Pais pais; //Pais es una clase Enum

    public ClubFutbol(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ClubFutbol{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
}
