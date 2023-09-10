/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayuso;



/**
 *
 * @author mario
 */
public class Tienda {
    
    private String nombre;
    private String propietario;
    private String rut;
    private Computador[] computadores; //apunta a null    
    //private ArrayList<Computador> computadores; //apunta a null    
    private static int cantidadComputadores = 0;

    public Tienda(String nombre, String propietario, String rut, int tamanno) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.rut = rut;
        this.computadores = new Computador[tamanno]; //tamaño maximo de compuatdpres
    }
    
    private boolean tiendaLlena(){
        return Tienda.cantidadComputadores == computadores.length;
    }
    
    public void agregarComputador(Computador c){
        if ( !tiendaLlena() ) {
            computadores[cantidadComputadores] = c;
            Tienda.cantidadComputadores++;
        } else {
            System.out.println("La tienda está full!!!!");
        }
    }
    
    public void listarTienda(){
        for (Computador c : computadores) {
            System.out.println(c);
        }
    }
    
    public int numeroComputadores(){
        return Tienda.cantidadComputadores;
    }
    
    public boolean eliminarComputador(String marca){
        boolean eliminado = false;
        int pos = buscarComputadorMarca(marca);
        if ( pos < 0){
            System.out.println("El computador no existe!!");
        } else {
            for (int i = pos; i < Tienda.cantidadComputadores-1; i++) {
               computadores[i] = computadores[i+1]; //elimino la celda y muevo los demas
            }
            eliminado = true;
            Tienda.cantidadComputadores--;
            computadores[Tienda.cantidadComputadores] = new Computador();
        }
        return eliminado;
    }
    
    private int buscarComputadorMarca(String marca){
        int pos = -1;
        for (int i = 0; i < computadores.length; i++) {
            if( computadores[i].getMarca().equalsIgnoreCase(marca)){
                pos = i;
            }
        }
        return pos;
    }
}
