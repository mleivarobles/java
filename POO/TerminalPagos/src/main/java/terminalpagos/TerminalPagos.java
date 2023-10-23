/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package terminalpagos;

/**
 *
 * @author mario
 */
public class TerminalPagos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pos pos = new Pos();
        Persona p1 = new Persona("1442768252","Pedro","Farias");
        TarjetaCredito t1 = new TarjetaCredito("Chile","45678",15000,p1,
                EntidadFinanciera.MASTERCARD);
        
        System.out.println(t1);
        System.out.println("Se genera el pago");
        
        Ticket resultado = pos.efecturaPago(t1, 10000, 2);
        System.out.println(resultado);
        
        System.out.println("Tajeta despues del pago");
        System.out.println(t1);
        
    }
}
