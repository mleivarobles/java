/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package libro;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Libro libro1 = new Libro(756252323, "Don Quijote","Cervaante", 700);
        Libro libro2 = new Libro(6762323, "50 sombras","Grey", 650);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if (libro1.getNumeroPaginas()> libro2.getNumeroPaginas()){
            System.out.println("El libro " + libro1.getTitulo() + " tiene más paginas");
        } else {
            System.out.println("El libro " + libro2.getTitulo() + " tiene más paginas");
        }
        
    }
}
