/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package plusone;

/**
 *
 * @author mario
 */
public class PlusOne {

    public static void main(String[] args) {
        /**
         * You are given a large integer represented as an integer array digits, 
         * where each digits[i] is the ith digit of the integer. 
         * The digits are ordered from most significant to least significant in left-to-right order. 
         * The large integer does not contain any leading 0's.
         * Increment the large integer by one and return the resulting array of digits.
         */
        
        int[] array = {4,5,8};
        
        array = plusOne(array);
        
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] plusOne(int[] digits) {
        //[4,5,8]
        
        int suma = 0;
        int potencia = digits.length - 1; //
        
        for (int digit : digits) {
            suma += digit * Math.pow( 10,potencia);
            potencia--;
        }
        
        System.out.println(suma);
        suma++; //plus one
        
        
        
        
        return null;
    }
}

