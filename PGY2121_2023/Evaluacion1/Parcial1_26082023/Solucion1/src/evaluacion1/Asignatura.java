/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion1;

/**
 *
 * @author cetecom
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double presentacion;
    private double examen;
    private String estado; //aprobado (eximido) o reprobado

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getPresentacion() {
        return presentacion;
    }
    
    public void setExamen(double examen) {
        this.examen = examen;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setPresentacion(double presentacion) {
        this.presentacion = presentacion;
    }
    
    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", estudiante=" + estudiante + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", presentacion=" + presentacion + ", examen=" + examen + ", estado=" + estado + '}';
    }
}
