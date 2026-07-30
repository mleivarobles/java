import java.util.Random;
/**
 Crea un programa que tenga un array con las temperaturas de los 7 días de la semana (puedes inventar los valores o generarlos random). El programa debe mostrar:
Todas las temperaturas con su día correspondiente (Lunes, Martes, etc.)
La temperatura más alta y en qué día ocurrió
La temperatura más baja y en qué día ocurrió
El promedio de la semana
Cuántos días estuvieron sobre el promedio
 */
public class ArrayTemperaturas {
    public static void main(String[] args) {
        int[] temp = new int[7]; //creo un array de 7 elementos
        String[] dias = new String[] {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        Random random = new Random();

        //lleno el array de temperaturas
        for (int i = 0; i < 7; i++) {
            temp[i] = random.nextInt(55); //0 a 55 grados celcius            
        }

        int minTemp = temp[0];
        int maxTemp = temp[0];
        int suma = 0;
        double promedio = 0;
        String diaMinimo = dias[0];
        String diaMaximo = dias[0];
        int diasSobrePromedio = 0;

        //recorro las temperaturas
        for (int i = 0; i < 7; i++) {
            if (temp[i] < minTemp) {
                minTemp = temp[i];
                diaMinimo = dias[i];
            }
            if (temp[i] > maxTemp) {
                maxTemp = temp[i];
                diaMaximo = dias[i];                
            }
            suma = suma + temp[i];  
        }
        promedio = suma / 7.0;
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]+": "+temp[i]+"°C");
            if (temp[i] > promedio) {
                diasSobrePromedio++;
            }
        }

        System.out.println("\nMáxima: " + maxTemp + "°C" + " ("+ diaMaximo+")");
        System.out.println("Minima: " + minTemp + "°C" + " ("+ diaMinimo+")");
        System.out.println("Promedio: " + promedio);
        System.out.println("Días sobre el promedio: " + diasSobrePromedio);
    }
}