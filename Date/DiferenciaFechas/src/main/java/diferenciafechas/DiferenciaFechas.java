/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package diferenciafechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class DiferenciaFechas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));
        LocalDate fechaNacimiento = LocalDate.now();
        
        System.out.print("Ingresa la fecha de nacimiento (dd/mmm/yyyy): ");
        String fechaNac = entrada.nextLine();
        
        try {
            fechaNacimiento = LocalDate.parse(fechaNac,formatter);
            System.out.println("Tu edad es " + calcularEdad(fechaNacimiento));
        } catch (Exception e) {
            System.out.println("Formato fecha invalida dd/mm/yyyy!!!!!");
        }
        
    }
    
    public static int calcularEdad(LocalDate fechaNacimiento){
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
         
        return periodo.getYears();
    }
}
