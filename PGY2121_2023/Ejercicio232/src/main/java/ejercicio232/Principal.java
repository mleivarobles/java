/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio232;

/**
 *
 * @author mario
 */
public class Principal {

    public static void main(String[] args) {
        
        Musica musica1 = new Musica("Punk","super","admin",100,150); 
        Musica musica2 = new Musica("Rock","pedro","admin",50,50); 
        Musica musica3 = new Musica("Rock","diego","admin",80,75); 
        
        RedSocial red1 = new RedSocial("TikTok","admin","admin",450, 300);
        TVSeries tv1 = new TVSeries("Terror","root","admin",300,200);
        TVSeries tv2 = new TVSeries("Comedia","Sofia","pass",200,100);
        
        
        //Pruebo la interfaz Almacenable
        System.out.println("Total Likes: " + Musica.getTotalLikes());
        System.out.println("Total minutos: " + Musica.getTotalMinutos());
        
        Coleccion col = new Coleccion();
        
        //agrego objetos a  la lista
        col.agregarInteres(musica1);
        col.agregarInteres(musica2);
        col.agregarInteres(musica3);
        col.agregarInteres(red1);
        col.agregarInteres(tv1);
        col.agregarInteres(tv2);
        
        //imprimo la lista
        col.listarIntereses();
        
        col.masLike();
        
        
    }
}
