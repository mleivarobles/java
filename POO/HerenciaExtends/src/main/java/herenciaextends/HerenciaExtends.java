/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herenciaextends;

import vehiculos.Moto;
import vehiculos.Auto;

/**
 *
 * @author mario
 */
public class HerenciaExtends {

    public static void main(String[] args) {
        
        Auto auto = new Auto();
        Moto moto = new Moto(40);
        
        //moto.marca = "Triumph";
        moto.setMarca("Suzuki");
        //moto.acelerar();
        moto.levantarRueda();
        System.out.println(moto.getMarca());
        
    }
}
