
package mascota;

import interfaces.Descuento;

/**
 *
 * @author mario
 */
public class Gato extends Mascota {
    
    private String pedigri;

    public Gato(String pedigri, String codigo, String nombre, double peso, 
            int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, diasAlojamiento, requiereSupervision);
        this.pedigri = pedigri;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("Gato:");
        super.mostrarDatos();
        System.out.println(" y pedigri: " + pedigri);
    }
        
    @Override
    public double calcularValorAlojamiento() {
        double valorAlojamiento = cacularValorAlojamiento();
        return valorAlojamiento * (1+Descuento.INCREMENTO_GATO/100);
    }
    
}
