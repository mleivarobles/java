/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terminalpagos;

/**
 *
 * @author mario
 */
public class TarjetaCredito {
    
    private String banco;
    private String nroTarjeta;
    private double saldo;
    private Persona titular;
    private EntidadFinanciera entidadFinanciera;

    public TarjetaCredito(String banco, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.banco = banco;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    
    public boolean tieneSaldoDisponible(double monto){
        return saldo >= monto;
    }
    
    public void descontarSaldo(double monto){
        this.saldo -= monto;
    }

    String getNombreCompleto() {
        return titular.getNombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "banco=" + banco + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", titular=" + titular + ", entidadFinanciera=" + entidadFinanciera + '}';
    }
}
