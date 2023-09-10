/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package giftcardmultitienda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import negocio.Trabajador;
import negocio.Tarjeta;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class GiftCardMultiTienda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        Trabajador trabajador = new Trabajador();
        Tarjeta tarjeta = new Tarjeta();
    
        do{
            System.out.println("\n-----GiftCard Multitienda-----");
            System.out.println("1.- Ingresar Trabajador");
            System.out.println("2.- Ingresar Tarjeta");
            System.out.println("3.- Ver monto disponible");
            System.out.println("4.- Realizar compra (monto)");
            System.out.println("5.- Validar vigencia de tarjeta");
            System.out.println("6.- Salir");
            System.out.print("Ingresar opcion:");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    ingresarTrabajador(trabajador);
                    break;
                case 2: 
                    ingresarTarjeta(tarjeta, trabajador);
                    break;
                case 3:
                    System.out.println("El cupo disponible en la tarjeta " + tarjeta.getCodigo() 
                            + " es " + tarjeta.getMonto());
                    break;
                case 4: 
                    System.out.print("Ingresar monto de compra: ");
                    double monto = entrada.nextDouble();
                    
                    if ( tarjeta.realizarCompra(monto) ){
                        System.out.println("La compra fue realizada con exito!!!");
                    } else {
                        System.out.println("No alcanzó el monto de la tarjeta!!!");
                    }
                    break;
                case 5:
                    if ( tarjeta.validarVigenciaTarjeta()) {
                        System.out.println("La tarjeta está vigente!!!!");
                    } else {
                        System.out.println("La tarjeta no es vigente!!!");
                    }
                    
                    break;
            }
            
        }while( opcion != 6);
    }

    public static void ingresarTarjeta(Tarjeta tarjeta, Trabajador trabajador){
        Scanner entrada = new Scanner(System.in);
        
        //codigo tarjeta
        System.out.println("Codigo Tarjeta: " + tarjeta.getCodigo());
        
        //clave tarjeta
        System.out.print("Clave tarjeta: ");
        int clave = entrada.nextInt();
        
        //monto tarjeta
        double monto = 0;
        do{
            System.out.print("Monto tarjeta: ");
            monto = entrada.nextDouble();
        }while( monto <=0);
        
        entrada.nextLine();
        
        //fecha vigencia tarjeta
        String fecha;
        LocalDate fechaVigencia = LocalDate.now();
        boolean flag = false;
        
        do{
            System.out.print("Fecha vigencia tarjeta (dd/mm/yyyy): ");
            fecha = entrada.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            try {
                fechaVigencia = LocalDate.parse(fecha, formatter);
                flag = true;
            } catch (Exception e) {
                System.out.println("Formato fecha invalida dd/mm/yyyy!!!!");
            }
            
        }while( flag == false);
        
        tarjeta.setTrabajador(trabajador);
        tarjeta.setClave(clave);
        tarjeta.setMonto(monto);
        tarjeta.setVigencia(fechaVigencia);
        tarjeta.setTrabajador(trabajador);
        
        System.out.println(tarjeta);
    }
    
    public static void ingresarTrabajador(Trabajador trabajador){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Rut trabajador: ");
        String rut = entrada.nextLine();
        String dvValida = "01234567890kK";
        
        String dv = new String();
        
        do{
            System.out.print("DV trabajador: ");
            dv = entrada.nextLine();
        }while( !dvValida.contains(dv) );
        
        String nombre = new String();
        
        do{
            System.out.print("Nombre trabajador: ");
            nombre = entrada.nextLine();
        }while ( nombre.length() == 0 );
        
        trabajador.setRut(rut);
        trabajador.setDv(dv);
        trabajador.setNombre(nombre);
        
        System.out.println(trabajador);
    }
}
