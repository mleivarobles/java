/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terminalpagos;

/**
 *
 * @author mario
 */
public class Pos {
    
    public static final double RECARGO_POR_CUOTA = 0.03; //3%
    public static final double MIN_CANT_CUOTA = 1;
    public static final double MAX_CANT_CUOTA = 6;
    
    public Ticket efecturaPago(TarjetaCredito tarjeta, double montoAbonar, int numeroCuotas){
        Ticket resultado = null;
        
        if(validarDatos(tarjeta, montoAbonar, numeroCuotas)){
            double montoFinal = montoAbonar + montoAbonar*recargoPorCuotas(numeroCuotas);
            
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontarSaldo(montoFinal);
                String nombre = tarjeta.getNombreCompleto();
                double montoPorCuota = montoFinal / numeroCuotas;
                resultado = new Ticket(nombre, montoFinal, montoPorCuota);
            }
            
        }
                
        return resultado;
    }
    
    private boolean validarDatos(TarjetaCredito tarjeta, double montoAbonar, int numeroCuotas){
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = montoAbonar > 0;
        boolean esCantCuotasValidas = numeroCuotas >= MIN_CANT_CUOTA && numeroCuotas <= MAX_CANT_CUOTA;
        
        return (esTarjetaValida && esMontoValido && esCantCuotasValidas);
    } 
    
    private double recargoPorCuotas(int numeroCuotas){
        return (numeroCuotas-1)*RECARGO_POR_CUOTA;
    }
}
