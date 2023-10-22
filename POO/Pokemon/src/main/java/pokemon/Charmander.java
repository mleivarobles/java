/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author mario
 */
public class Charmander extends Poke implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y mordisco");
    }

    @Override
    public void atacarConPunioFuego() {
        System.out.println("Soy Charmander y con puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y ascua");
    }
    
}
