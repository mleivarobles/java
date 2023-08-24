/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poweroffour;

/**
 *
 * @author mario
 */
public class PowerOfFour {
    
    /**
     * Given an integer n, return true if it is a power of four.Otherwise, return false. An integer n is a power of four, if there exists an integer x such that n == 4x.
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(2147483647) );
    }
    
    public static boolean isPowerOfFour(int n) {
        int i = 0;
        int potencia = 0;
        
        while(potencia<=n){
            potencia = (int)Math.pow(4, i);
           
            if( n ==  potencia){
               return true; 
            }
            i++;
        }
        return false;
    }
}
