/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasalumnos;

/**
 *
 * @author mario
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaPresentacion;
    private double notaExamen;

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNotaPresentacion() {
        return notaPresentacion;
    }

    public double getNotaExamen() {
        return notaExamen;
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

    public void setNotaPresentacion(double notaPresentacion) {
        this.notaPresentacion = notaPresentacion;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", estudiante=" + estudiante + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", notaPresentacion=" + notaPresentacion + ", notaExamen=" + notaExamen + '}';
    }   
}
