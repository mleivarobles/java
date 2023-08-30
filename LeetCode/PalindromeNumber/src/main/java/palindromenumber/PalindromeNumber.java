/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package palindromenumber;

/**
 *
 * @author mario
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        /**
         * Given an integer x, return true if x is a palindrome , and false otherwise.
         * Could you solve it without converting the integer to a string?
         */
        
        int x = 2147483647;
        
        if (isPalindrome(x)) {
            System.out.println("Es palindrome!!");
        } else { 
            System.out.println("No es palidrome");
        }
    }
    
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int digito = 0;
        int pos = Integer.toString(x).length();
        int numero = x;
        
        if (x<Integer.MIN_VALUE || x > Integer.MAX_VALUE-1){
            return false;
        }
       
        while(x>0){
            digito = x%10;
            x = x/10;
            pos--;
            sum+= digito*(Math.pow(10, pos));
            
        }
        return numero == sum;
    }
}
