
package mascota;

import interfaces.Descuento;

/**
 *
 * @author mario
 */
public class Conejo extends Mascota {
    
    private String dieta;

    public Conejo(String dieta, String codigo, String nombre, double peso, 
            int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, diasAlojamiento, requiereSupervision);
        this.dieta = dieta;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("Conejo:");
        super.mostrarDatos();
        System.out.println(" y come: " + dieta);
    }
    
    @Override
    public double calcularValorAlojamiento() {
        double valorAlojamiento = cacularValorAlojamiento();
        return valorAlojamiento * (1-Descuento.DESCUENTO_CONEJO/100);
    }
    
}
