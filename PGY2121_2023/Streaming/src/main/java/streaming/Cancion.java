/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;

/**
 *
 * @author mario
 */
public class Cancion {
    
    private String titulo;
    private String artista;
    private int tiempoDeDuracion;
    private boolean esFavorita;
    private boolean estaDescargada;
    private int posicion;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int tiempoDeDuracion, boolean esFavorita, boolean estaDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDeDuracion = tiempoDeDuracion;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
        this.posicion = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getTiempoDeDuracion() {
        return tiempoDeDuracion;
    }

    public void setTiempoDeDuracion(int tiempoDeDuracion) {
        this.tiempoDeDuracion = tiempoDeDuracion;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public boolean isEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }

    public int getPosicion() {
        return posicion;
    }
    
    
    public void adelantarCancion(int segundos){
       //this.posicion = this.posicion + segundos;
       this.posicion+= segundos;
    }
    
    public void imprimirCancion(){
        int minutos = tiempoDeDuracion / 60; // 225 / 60 = 3
        int segundos = tiempoDeDuracion - minutos*60; // 225-60*3 = 45
        
        System.out.println("Titulo=" + titulo + ", artista="+ artista +
                ", duracion=" + minutos +":" + segundos);
    }    
    
    public String tipoCancion(){
        if(tiempoDeDuracion >= 300){
            return "larga";
        } else{
            return "corta";
        }
    }
}
