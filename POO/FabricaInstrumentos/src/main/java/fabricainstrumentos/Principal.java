/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricainstrumentos;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        f.listarInstrumentos();
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.CUERDA);
        
//        System.out.println("\nLista de instrumentos encontrados");
//        for (Instrumento i : lista) {
//            System.out.println(i.toString());
//        }
//        
//        f.borrarInstrumento("Plat0909");
//        f.listarInstrumentos();
        
        double[] array = f.porcInstrumentosPorTipo("Sucursal A");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
                
    }
    
    public static void cargarFabrica(Fabrica f){
        //creo sucursales
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
        
        //Creao instrumentos
        Instrumento instrumento1 = new Instrumento("Silo0901",19500,TipoInstrumento.PERCUSION);
        Instrumento instrumento2 = new Instrumento("Bate6731",6500,TipoInstrumento.PERCUSION);
        Instrumento instrumento3 = new Instrumento("Viol1818",10800,TipoInstrumento.CUERDA);
        
        Instrumento instrumento4 = new Instrumento("Flau6767",7500,TipoInstrumento.VIENTO);
        Instrumento instrumento5 = new Instrumento("Plat0909",5500,TipoInstrumento.PERCUSION);

        s1.agregarInstrumento(instrumento1);
        s1.agregarInstrumento(instrumento2);
        s1.agregarInstrumento(instrumento3);
        s2.agregarInstrumento(instrumento4);
        s2.agregarInstrumento(instrumento5);
        
        //listo contenido de las sucursales
        //s1.listarInstrumentos();
        //s2.listarInstrumentos();
        
        //listo los encontrados por tipo
        //ArrayList<Instrumento> lista = s1.instrumentosPorTipo(TipoInstrumento.CUERDA);
        //System.out.println("Lista de encontrados " + lista.toString());
       
    }
    
}
