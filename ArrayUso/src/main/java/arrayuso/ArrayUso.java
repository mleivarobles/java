/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayuso;

/**
 *
 * @author mario
 */
public class ArrayUso {

    public static void main(String[] args) {
        Computador c1 = new Computador("Apple", 16, "16MGHZ", TipoSO.MACOS, 1650000);
        Computador c2 = new Computador("HP", 32, "32MGHZ", TipoSO.WINDOWS, 750000);
        Computador c3 = new Computador("IBM", 12, "1.98MGHZ", TipoSO.WINDOWS, 350000);
        
        Tienda tienda = new Tienda("MacOnline","Juan Perez", "1442768252",3);
        
        System.out.println("#cantidad " + tienda.numeroComputadores());
        tienda.agregarComputador(c1);
        tienda.agregarComputador(c2);
        tienda.agregarComputador(c3);
        System.out.println("#cantidad " + tienda.numeroComputadores());
        
        boolean eliminado = tienda.eliminarComputador("Apple");
        System.out.println("#cantidad " + tienda.numeroComputadores());
        tienda.listarTienda();
        tienda.agregarComputador(c2);
        System.out.println("");
        tienda.listarTienda();
    }
}
