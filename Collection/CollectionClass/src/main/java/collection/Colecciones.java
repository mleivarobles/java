/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package collection;

/**
 *
 * @author mario
 */
public class Colecciones {

    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("Rapido&Furioso");
        
        c.agregarAutos(new Auto("JKLM80","Chevrolet","5"));
        c.agregarAutos(new Auto("MOIKL","Lambo","MVG"));
        c.mostrarAutos();
        
        String patente = "HNHD2";
        
        c.buscarPatente(patente);
        
        
    }
}
