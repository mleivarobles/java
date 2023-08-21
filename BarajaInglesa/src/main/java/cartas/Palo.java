/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartas;

import barajainglesa.Color;

/**
 *
 * @author mario
 */
public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA (Color.NEGRO),
    TREBOL (Color.NEGRO);
    
    private Color color;

    private Palo(Color color) {
        this.color = color;
    }   
}
