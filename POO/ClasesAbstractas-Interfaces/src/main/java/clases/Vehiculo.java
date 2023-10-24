/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int nroRueda;
    private int anno;
    private Persona duenno;

    public void setDuenno(Persona duenno) {
        this.duenno = duenno;
    }

    public Vehiculo(String marca, String modelo, int nroRueda, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.nroRueda = nroRueda;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", nroRueda=" + nroRueda + ", anno=" + anno + ", duenno=" + duenno + '}';
    }
}
