/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package colecciones;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Colecciones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
            ArrayList<Auto> listaAutos = new ArrayList<>();
            
            listaAutos.add(new Auto("CBFH80","azul"));
            listaAutos.add(new Auto("JR5480","rojo"));
            listaAutos.add(new Auto("LOKI30","verde"));
            listaAutos.add(new Auto("POLO56","rojo"));
            
            for(Auto a: listaAutos){
                System.out.println(a);
            }
            
            //elimina un elemento en el posición "0"
            
            listaAutos.remove(0);
            
            System.out.println("");
            
            for(int i=0; i < listaAutos.size(); i++){
                System.out.println(listaAutos.get(i));
            }
        
    }
}
