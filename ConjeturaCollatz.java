public class ConjeturaCollatz {
    public static void main(String[] args) {
        int numeroInicial = 47; // Cambia este valor por el número con el que quieras iniciar
        
        System.out.println("Secuencia de Collatz para " + numeroInicial + ":");
        calcularCollatz(numeroInicial);
    }

    public static void calcularCollatz(int numero) {
        while (numero != 1) {
            System.out.print(numero + " -> ");
            
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = 3 * numero + 1;
            }
        }
        
        System.out.println(numero); // Agregar el último número, que es 1
    }
}

