/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package convertirfechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mario
 */
public class ConvertirFechas {

    public static void main(String[] args) {
        // Define the format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = "2023-11-22";
        
        System.out.println("La fecha como String: " + fecha);

        // Parse the string to a date
        Date date = new Date();
        try {
            date = dateFormat.parse(fecha);
        } catch (ParseException ex) {
            System.out.println("Error al convertir la fecha " + ex.toString());
        }

        System.out.println("La fecha como Date: " + date); // Fri Nov 22 00:00:00 GMT-03:00 2023
    }
}
