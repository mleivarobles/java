/**
 * Persona
 */
public class Persona {

    String nombre;
    String apellido;
    int edad;

    Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return nombre + " "+ apellido + " tiene " + edad + " años de edad" ;
    }

    public static void main(String[] args) {
        Persona juan = new Persona("Juan", "Soto", 25);
        Persona sofia = new Persona();
        System.out.println(juan.toString());
        System.out.println(sofia.toString());

        sofia.nombre = "Sofia";
        sofia.apellido = "Alvarez";
        sofia.edad = 45;

        System.out.println(sofia.toString());
    }
}