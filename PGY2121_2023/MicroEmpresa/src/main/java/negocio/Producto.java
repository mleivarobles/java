/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import microempresa.TipoMedida;
import microempresa.TipoSubcategoria;

/**
 *
 * @author mario
 */
public class Producto {
    
    private int codigo;
    private TipoSubcategoria subCategoria;
    private String descripcion;
    private double precio;
    private TipoMedida medida;

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto() {
    }
    
    public Producto(int codigo, TipoSubcategoria subCategoria, String descripcion, double precio, TipoMedida medida) {
        this.codigo = codigo;
        this.subCategoria = subCategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.medida = medida;
    }

    public void setSubCategoria(TipoSubcategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMedida(TipoMedida medida) {
        this.medida = medida;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public TipoMedida getMedida() {
        return medida;
    }

    public TipoSubcategoria getSubCategoria() {
        return subCategoria;
    }
}
