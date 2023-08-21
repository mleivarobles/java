/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package atributosstatic;

/**
 *
 * @author mario
 */
public class AtributosStatic {

    public static void main(String[] args) {
        
        Atleta atleta1 = new Atleta("Alejandro Perlaza", 9.55);
        Atleta atleta2 = new Atleta("Anthony Zambrano", 9.28);
        Atleta atleta3 = new Atleta("Diego Palomeque", 9.53);
        Atleta atleta4 = new Atleta("Gilmar Herrera", 9.29);
        
        // Atleta[] atletas = {atleta1, atleta2, atleta3, atleta4};
        
        Atleta[] atletas = new Atleta[4];
        atletas[0] = atleta1;
        atletas[1] = atleta2;
        atletas[2] = atleta3;
        atletas[3] = atleta4;
               
        atleta1.correr400();
        atleta2.correr400();
        atleta3.correr400();
        
        Atleta.nombreSeleccion();
        Atleta.tiempoTotalEquipo();
//        
//        System.out.println("Atleta1 " + atleta1);
//        System.out.println("Atleta2 " + atleta2);
//        System.out.println("Atleta3 " + atleta3);
//        System.out.println("Atleta4 " + atleta4);
        
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < atletas.length; i++) {
            System.out.println(atletas[i]);
        }
        
                
    }
}
