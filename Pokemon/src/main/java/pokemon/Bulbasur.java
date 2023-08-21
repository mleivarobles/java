/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author mario
 */
public class Bulbasur extends Poke implements IPlanta {

    public Bulbasur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasur y placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasur y arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasur y mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola Soy Bulbasur y drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola Soy Bulbasur y paralizar");
    }
    
}
