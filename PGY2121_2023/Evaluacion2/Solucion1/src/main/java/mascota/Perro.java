
package mascota;

import interfaces.Descuento;

/**
 *
 * @author mario
 */
public class Perro extends Mascota{
    
    private int hacerEjercicio; //veces en el día

    public Perro(int hacerEjercicio, String codigo, String nombre, 
            double peso, int diasAlojamiento, boolean requiereSupervision) {
        super(codigo, nombre, peso, diasAlojamiento, requiereSupervision);
        this.hacerEjercicio = hacerEjercicio;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.print("Perro: ");
        super.mostrarDatos();
        System.out.println(" y hace ejercicio: " + hacerEjercicio + " dias");
    }
    
    
    @Override
    public double calcularValorAlojamiento() {
        double valorAlojamiento = cacularValorAlojamiento();
        if( hacerEjercicio > 3){
            valorAlojamiento = valorAlojamiento * (1 + Descuento.INCREMENTO_PERRO/100);
        }
        return valorAlojamiento;
    }
}
