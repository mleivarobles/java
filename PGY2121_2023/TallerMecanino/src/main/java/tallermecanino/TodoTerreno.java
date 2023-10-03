/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanino;

/**
 *
 * @author mario
 */
public class TodoTerreno extends Vehiculo {
    
    private TipoTraccion tipoTraccion;
    private double alturaSuelo;

    public TodoTerreno(TipoTraccion tipoTraccion, double alturaSuelo, String patente, 
            String modelo, Categoria categoria) {
        
        super(patente, modelo, categoria);
        this.tipoTraccion = tipoTraccion;
        this.alturaSuelo = alturaSuelo;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo Traccion: " + tipoTraccion);
        System.out.println("Altura del Suelo: " + alturaSuelo);
    }
    
}
