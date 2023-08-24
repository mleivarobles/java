/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package microempresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import negocio.Cliente;
import negocio.Producto;
import negocio.Solicitud;

/**
 *
 * @author mario
 */
public class MicroEmpresa {

    public static void main(String[] args) {
        
        int opcion;
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Solicitud solicitud = new Solicitud();
        
        while(!salir){
            System.out.println("------------Menu------------");
            System.out.println("1.- Ingresar Cliente");
            System.out.println("2.- Ingresar Solicitud y Productos");
            System.out.println("5.- Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: ingresarCliente(cliente);
                    break;
                case 5: salir = true;
                    break;
                case 2: ingresarSolicitud(solicitud, cliente);
                    break;
                default:
                    System.out.println("Opcion no valida!!!");
            }
        }
        entrada.close();
    }
    
    public static void ingresarSolicitud(Solicitud solicitud, Cliente cliente){
        Scanner entrada = new Scanner(System.in);        
        boolean fechaValida = false;
        do{
            System.out.print("Fecha solicitud dd/mm/yyyy: ");
            String fecha = entrada.nextLine();
            Date fechaSolicitud = validarFecha(fecha);
            
            if( fechaSolicitud != null ){
                solicitud.setFecha(fechaSolicitud);
                fechaValida = true;
            } else {
                 System.out.println("Formato de fecha incorrecto dd/MM/yyyy.");
            }        
        }while(!fechaValida);
        
        solicitud.setCliente(cliente);
        
        //Ingresar productos
        boolean otroProducto = false;
        boolean validaCodigo = false;
        boolean validaPrecio = false;
        
        do{
            Producto producto = new Producto();
            do{
                System.out.print("Codigo producto: ");
                int codigo = entrada.nextInt();            
                if ( validarCodigoProducto(codigo) ){
                    producto.setCodigo(codigo);
                    validaCodigo = true;
                } else{
                    System.out.println("Codigo invalido de producto!!!!");
                }
            }while(!validaCodigo);
            
            producto.setSubCategoria(TipoSubcategoria.FRUTAS);
            System.out.print("Descripcion producto: ");
            String descripcion = entrada.nextLine();
            producto.setDescripcion(descripcion);
            
            do{
                System.out.print("Precio producto: ");
                double precio = entrada.nextDouble();
                
                if( validarPrecio(precio) ){
                    producto.setPrecio(precio);
                    validaPrecio = true;
                }               
            }while(!validaPrecio);
            
            producto.setMedida(TipoMedida.UNIDAD);
            
            System.out.print("Otro producto?: SI/NO: ");
            String masProductos = entrada.nextLine();
            
            if ( masProductos.equalsIgnoreCase("no")){
                otroProducto = true;
            }
            
        }while(!otroProducto);
        
        System.out.println(solicitud);
    }
    
    public static boolean validarPrecio(double precio){
        return precio > 0;
    }
    
    public static boolean validarCodigoProducto(int codigo){
        return codigo>=1001 && codigo <=9999;
    }
    
    public static Date validarFecha(String fecha){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date fechaFormateada = formatoFecha.parse(fecha);
            return fechaFormateada;
        } catch (ParseException e) {
            return null;
        }
    }
    
    public static void ingresarCliente(Cliente cliente){
        //Cliente cliente = new Cliente();
        boolean rutCorrecto = false;
        boolean emailValido = false;
        boolean telefonoValido = false;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("Rut Cliente (rut-dv): ");
            String rut = entrada.nextLine();
            rut = rut.replace("-", "");
            if ( validarRut(rut) ){
                cliente.setDv(rut.charAt(rut.length()-1));
                cliente.setRut(rut.substring(0, rut.length()-1));
                
                System.out.print("Nombre Cliente: ");
                cliente.setNombre(entrada.nextLine());
                rutCorrecto = true;
                                
                do{
                    System.out.print("Email Cliente: ");
                    String email = entrada.nextLine();
                    
                    if( validarEmail(email) ){
                        emailValido = true;
                        cliente.setEmail(email);
                    } else {
                        System.out.println("El email deber tener minimo 6 caracteres!!!!");
                    }
                }while (!emailValido);
                
                System.out.print("Direccion Cliente: ");
                cliente.setDirección(entrada.nextLine());
                
                do{
                    System.out.print("Telefono Cliente: ");
                    String telefono = entrada.nextLine();
                    
                    if( validarTelefono(telefono) ){
                        telefonoValido = true;
                        cliente.setTelefono(telefono);
                    } else{
                        System.out.println("El telefono debe tener largo 8!!!!");
                    }
                }while(!telefonoValido);
                
            System.out.println(cliente);    
            }
        } while(!rutCorrecto);
    }
    
    public static boolean validarTelefono(String telefono){
        return telefono.length() == 8;
    }
    
    public static boolean validarEmail(String email){
        return email.length() >= 6;
    }
    
    public static boolean validarRut(String rut){
        int largo = rut.length();

        if (largo < 2) {
            return false;
        }

        char dv = Character.toUpperCase(rut.charAt(largo - 1));
        int rutNum = Integer.parseInt(rut.substring(0, largo - 1));

        int m = 0, s = 1;
        for (; rutNum != 0; rutNum /= 10) {
            s = (s + rutNum % 10 * (9 - m++ % 6)) % 11;
        }
        return dv == (char) (s != 0 ? s + 47 : 75);
    }
}
