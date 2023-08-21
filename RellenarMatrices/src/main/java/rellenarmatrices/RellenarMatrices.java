/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rellenarmatrices;

/**
 *
 * @author mario
 */
public class RellenarMatrices {

    public static void main(String[] args) {
        int[][] matrizLlena = { 
            {1,2,3},
            {4,5,6}
        }; //Matriz de 2x3
        
        int[][] matriz = new int[4][5];
        //0 1 2 3 4 
        //0 1 2 3 4
        //0 1 2 3 4
        //0 1 2 3 4
        
        int[][] matrizRellena = rellenarMatriz(matriz);
        imprimirMatriz(matrizRellena);        
    }
    
    public static int[][] rellenarMatriz(int[][] matriz){
        int cont = 1;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = cont;
                cont++;
            }
        }
        return matriz;
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
