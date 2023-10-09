/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herenciapolimorfismo;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        Carga carga1 = new Carga(1500,15000,10,"CBFH80");
        Carga carga2 = new Carga(750,10000,15,"KIKI23");
        Pasajero pasajero1 = new Pasajero(7,2000, 6,"HYSD00");
        Pasajero pasajero2 = new Pasajero(7,2000, 6,"HYSD00");
        
        RentCar hertz = new RentCar("hertz");
        
        hertz.agregarVehiculo(carga1);
        hertz.agregarVehiculo(carga2);
        hertz.agregarVehiculo(pasajero1);
        hertz.agregarVehiculo(pasajero2);
        
        hertz.listarVehiculos();
        hertz.mostrarBoletas();
        
        System.out.println("\n#Vehiculos con arriendo >=7: " + hertz.arriendoSiete());
        
    }
}
