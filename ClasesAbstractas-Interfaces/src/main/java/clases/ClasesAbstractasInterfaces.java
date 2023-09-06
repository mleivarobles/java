package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public class ClasesAbstractasInterfaces {

    public static void main(String[] args) {
        /**
         * Clase Vehiculo es abstracta
         * Clase Auto y Moto heredan (extends) de Vehiculo atributos y metodos.
         * Clase Auto implementa (implements) las interfaces Manejas y Mantenaciones con sus metodos
         * Clase Moto implementa (implements) las interfaces Manejar con sus metodos
         * 
         * Clase persona para agregar dueño
         *
         */
        
        // creacio de objetos
        Auto auto1 = new Auto(5, "Chevrolet", "Monza", 4, 2020);
        Moto moto1 = new Moto(true, "Yamaha","ST900",2,2023);
       
        
        System.out.println(auto1);
        System.out.println(moto1);
        
        //acceso a metodos de los objetos
        moto1.acelerar();
        auto1.agregarAgua();
        auto1.limpiar();
        
        // asignar dueño
        Persona juan = new Persona("144276825","Juan Perez",45);
        moto1.setDuenno(juan);
        System.out.println(moto1);
    }
}
