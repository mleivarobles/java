/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraclase;

/**
 *
 * @author mario
 */
public class Alumno {
    static int id_alumnos = 0;
    private int id_alumno;
    private String nombre;
    private String apellido;
    private int edad;

    public Alumno() {
        Alumno.id_alumnos += 1;
        this.id_alumno = Alumno.id_alumnos;
        this.edad = 1;
    }

    public Alumno(String nombre, String apellido, int edad) {
        Alumno.id_alumnos += 1;
        this.id_alumno = Alumno.id_alumnos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    private String listarNombreCompleto(){
        return (nombre + " " + apellido);
    }
    
    public void confirmarAprobado(double nota){
        if(nota >= 4.0 && nota <=7.0){
            System.out.println("El alumno " + listarNombreCompleto() + " está aprobado");
        } else if(nota<4.0){
            System.out.println("El alumno " +  listarNombreCompleto() + " está reprobado");
        } else {
            System.out.println("Nota invalida!!!!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{id=" + id_alumno + " " + 
                "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }  
}
  