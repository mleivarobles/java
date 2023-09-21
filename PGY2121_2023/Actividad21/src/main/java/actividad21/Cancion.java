/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad21;

/**
 *
 * @author mario
 */
public class Cancion {
    
    private String titulo;
    private String artista;
    private int duracion;
    private boolean esFavorita;
    private boolean estaDescargada;

    //Constructor que 
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.esFavorita = false;
        this.estaDescargada = false;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", esFavorita=" + esFavorita + ", estaDescargada=" + estaDescargada + '}';
    }
    
}
