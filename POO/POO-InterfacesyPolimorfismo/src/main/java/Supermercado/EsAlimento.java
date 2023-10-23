/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Supermercado;

import java.time.LocalDate;

/**
 *
 * @author "mleiva.robles@gmail.com - Mario Leiva Robles"
 */
public interface EsAlimento {
    
    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();
    
}
