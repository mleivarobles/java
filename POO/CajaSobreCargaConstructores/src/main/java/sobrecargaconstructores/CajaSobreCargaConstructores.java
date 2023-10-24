/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sobrecargaconstructores;

/**
 *
 * @author mario
 */
public class CajaSobreCargaConstructores {

    public static void main(String[] args) {
        
        final double IVA = 19.00;
        
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(5,4,3);
        Caja caja3 = new Caja(2,1,2,"Grande");
        Caja caja4 = new Caja(10,4,6,"Mediana", "Azul");
        
        System.out.println(caja1);
        System.out.println(caja2);
        System.out.println(caja3);
        System.out.println(caja4);
        
        System.out.println("El iva es de " + IVA * 4);
               
        System.out.println("El volumen de la caja1 es " + caja2.volumen());
        System.out.println("El volumen de la caja1 es " + caja4.volumen());
        
    }
}
