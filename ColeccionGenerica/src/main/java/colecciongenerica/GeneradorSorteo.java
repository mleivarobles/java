/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciongenerica;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Generador es una clase generica que definiendo a los elementos del tipo T
 * que puede ser de cualquier tipo: Clubl de futbol, enteros, lo que sea (generico)
 * @author mario
 * @param <T>
 */
public class GeneradorSorteo<T> {
    
    private ArrayList<T> elementos; //es un arraylist con elementos del tipo T (generico)
    private Random random;

    public GeneradorSorteo() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }
    
    //agrega un elemento 
    public void add(T elemento){
        this.elementos.add(elemento);
    }
    
    ////obtengo un elemento aleatorio de la lista y lo mantengo (reposición)
    public T get(){
        checkEmpty();
        int indice = random.nextInt(elementos.size()); //genera un entero aleatorio entre 0 y size()-1
        return elementos.get(indice);
    }
    
    //obtengo un elemento aleatorio de la lista y lo elimno una vez elegido
    public T remove(){
        checkEmpty();
        int indice = random.nextInt(elementos.size()); //genera un entero aleatorio entre 0 y size()-1
        return elementos.remove(indice);
    }
    
    //lanzo una excepción si la lista está vacia.
    private void checkEmpty(){
        if(isEmpty()){
            throw new NoSuchElementException("No hay más elementos que elegir!!!!");
        }
    }
    
    //validar si está vacia o no
    public boolean isEmpty(){
        return elementos.isEmpty();
    }
    
}
