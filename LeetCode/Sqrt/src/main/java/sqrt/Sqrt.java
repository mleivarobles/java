/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sqrt;

/**
 *
 * @author mario
 */
public class Sqrt {

    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println("La raiz apro. de " + x +" es " + mySqrt(x));
    }
    
    public static int mySqrt(int x) {
        int cont = 0;
        
        // 8 -> 2
        //2147395600 -> 46340
        //2147483647
        double  potencia = 0;
        
        if ( x >=0 || x <= (Integer.MAX_VALUE-1) ){
            
            do{
                potencia = cont*cont;
                System.out.println(potencia);
                if( potencia < x ){
                    cont++;
                } else if ( potencia > x){
                    return cont-1;
                } else {
                    return cont;
                }
            }while( potencia<=x );
           
        }
        return 0;
    }
}
