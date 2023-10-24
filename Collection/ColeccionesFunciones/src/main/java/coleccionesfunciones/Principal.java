/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coleccionesfunciones;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Concesionaria conce1 = new Concesionaria("Dumay");
        Auto auto1 = new Auto("CBFH80","gris",1002);
        Auto auto2 = new Auto("DHTY56","rojo",2000);
        Auto auto3 = new Auto("OPRL22","azul",3000);

        conce1.agregarAuto(auto1);
        conce1.agregarAuto(auto2);
        conce1.agregarAuto(auto3);
        System.out.println("El total de km son " + conce1.calcularTotalKilometros());
        System.out.println("El promedio de kms son " + conce1.calcularPromedioKilometros());
    }
}
