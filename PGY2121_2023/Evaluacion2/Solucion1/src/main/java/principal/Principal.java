
package principal;

import mascota.Conejo;
import mascota.Gato;
import mascota.Perro;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        //Creo el hotel de Mascota
        HotelMascota transilvania = new HotelMascota("Transilvania");
        
        //Creo 3 perros
        Perro perro1 = new Perro(4,"perro01","Doncan Taylor",17.5,6,false);
        Perro perro2 = new Perro(2,"perro02","Muñeca",10,2,true);
        Perro perro3 = new Perro(1,"perro01","Copito",9.5,3,false);
        
        //Creo 2 gatos
        Gato gato1 = new Gato("Siames","gato1","Asrael",5.7,11,true);
        Gato gato2 = new Gato("Persa","gato2","Micifuz",9,5,false);
        
        //Creo 3 conejos
        Conejo conejo1 = new Conejo("Zanahoria","Conejo1","BudBunny",7.3,10,false);
        Conejo conejo2 = new Conejo("Pasto y Hierba","Conejo1","Rabbit",3.5,8,true);
        
        
        
        //Agrego a todas las mascotas al hotel
        transilvania.agregarMascota(perro1);        
        transilvania.agregarMascota(perro2);
        transilvania.agregarMascota(perro3);
        
        transilvania.agregarMascota(gato1);
        transilvania.agregarMascota(gato2);
        
        transilvania.agregarMascota(conejo1);
        transilvania.agregarMascota(conejo2);
        
        // listo todas las mascotas
        transilvania.listarTodasMascotas();
        System.out.println("Valor Total: " + transilvania.calcularTotalValor());
        System.out.println("#Mascotas: " + transilvania.cantidadMascotas());
        
    }
}
