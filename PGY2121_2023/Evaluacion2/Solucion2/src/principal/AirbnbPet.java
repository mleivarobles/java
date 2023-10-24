/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import airbnbpet.Conejo;
import airbnbpet.Gato;
import airbnbpet.HotelPet;
import airbnbpet.Perro;

/**
 *
 * @author cetecom
 */
public class AirbnbPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear 3 perros, 2 gatos y 2 conejos a la colección
        HotelPet hotel = new HotelPet("Hotel Transilvania");
        
        //3 perros
        Perro doncan = new Perro(5,"Doncan Taylor",10.5,12,4,"perro01",true);
        Perro poison = new Perro(2,"Poison",13,10,5,"perro02",true);
        Perro muneca = new Perro(6,"Muñeca",7.6,8,6,"perro03",true);
        
        //2 gatos
        Gato asrael = new Gato("Angora","Asrael",5.2,3,7,"gato01",false);
        Gato misifuz = new Gato("Siames","Misifuz",6.9,4,10,"gato02",false);
        
        //2 conejos
        Conejo rabbit = new Conejo("Zanahoria","Rabbit",4.5,7,20,"conejo01",false);
        Conejo babbunny = new Conejo("Hierba y Pasto","Babbunny",5.5,4,5,"Conejo02",false);
        
        //1 perro que se repite
        Perro chascas = new Perro(10,"chascas",10.5,12,4,"Perro03",true);
        
        hotel.agregarMascota(doncan);
        hotel.agregarMascota(asrael);
        hotel.agregarMascota(rabbit);
        hotel.agregarMascota(poison);
        hotel.agregarMascota(muneca);
        hotel.agregarMascota(babbunny);
        hotel.agregarMascota(misifuz);
        
        hotel.agregarMascota(chascas);
        
        
        hotel.listarMascotas();
        System.out.println("\nEl hotel tiene " + hotel.totalMascotas() + " mascotas");
        System.out.println("Total a pagar: " + hotel.calcularPagoMascotas());
        
    }
    
}
