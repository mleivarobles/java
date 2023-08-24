/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package perfectsquare;

/**
 *
 * @author mario
 */
public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144*144) );
    }
    
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        int square = 1;
        
        while( square < num  ){
            square = i * i;
            if( (int) square == num){
                return true;
            }
            i++;
        }
        return false;
    }
}