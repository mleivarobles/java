/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author mario
 */
public class Tarjeta {
    
    private String codigo;
    private int clave;
    private double monto;
    private LocalDate vigencia;
    private Trabajador trabajador;

    public Tarjeta() {
        this.codigo = generarCorrelativoTarjeta();
        this.vigencia = LocalDate.now();
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setVigencia(LocalDate vigencia) {
        this.vigencia = vigencia;
    }    

    public String getCodigo() {
        return codigo;
    }

    public double getMonto() {
        return monto;
    }
    
    private boolean validarMontoCompra(double monto){
        return this.monto >= monto ;
    }
    
    public boolean validarVigenciaTarjeta(){
        LocalDate fechaHoy = LocalDate.now();
        return vigencia.compareTo(fechaHoy) >= 0 ;
    }
    
    public boolean realizarCompra(double monto){
        
        if (validarMontoCompra(monto)) {
            this.monto -= monto;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarClave(){
        String rut = trabajador.getRut();
        rut = rut.substring(0,3);
        
        return rut.equalsIgnoreCase(String.valueOf(clave));
    }
    
    private String generarCorrelativoTarjeta(){
        Random random = new Random();
        String numero = new String();
        
        for (int i = 0; i < 16; i++) {
            int digito = random.nextInt(10); //digito entre 0 y 9;
            numero+=digito;
        }
        
        return numero;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy", 
                new Locale("es", "ES"));
        return "Tarjeta{" + "codigo=" + codigo + ", clave=" + clave 
                + ", monto=" + monto 
                + ", vigencia=" + vigencia.format(formato) + ", trabajador=" + trabajador + '}';
    }

}
