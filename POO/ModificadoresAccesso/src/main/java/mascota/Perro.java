/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascota;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Perro {
    
    public String raza;
    private int edad;
    protected String tamanno;
    private ArrayList<Ave> amigos; 

    public Perro(String raza, int edad, String tamanno) {
        this.raza = raza;
        this.edad = edad;
        this.tamanno = tamanno;
        amigos = new ArrayList<>();
    }
    
    public void agregarAmigo(Ave ave){
        this.amigos.add(ave);
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", edad=" + edad + ", tamanno=" + tamanno + ", amigos=" + amigos + '}';
    }
    
    
}
