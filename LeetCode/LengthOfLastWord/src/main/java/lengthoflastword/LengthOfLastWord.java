/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lengthoflastword;

/**
 *
 * @author mario
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "     fly me   to   the moon  ";
        System.out.println("largo=" +lengthOfLastWord(s) );   
    }
    
    public static int lengthOfLastWord(String s) {
        String[] array = s.trim().split(" ");
        
        return array[array.length-1].length();
    }
}
