/*
Crea un programa que maneje 3 estudiantes con sus datos y 3 notas cada uno. El programa debe mostrar:
    El nombre de cada estudiante con sus 3 notas y su promedio
    El estudiante con mejor promedio
    El estudiante con peor promedio
    El promedio general del curso
    Cuántos estudiantes aprobaron (promedio >= 4.0)
*/
public class NotasEstudiantes {    
    public static void main(String[] args) {
        String[] nombres = {"María", "Pedro", "Lucía"};
        double[][] notas = {
            {5.5, 6.0, 4.5, 0}, //ultima columna promedio
            {3.0, 2.5, 4.0, 0},
            {6.5, 7.0, 6.0, 0}
        };

        double suma = 0.0;
        double promedio = 0.0;
        int aprobados = 0;
        int reprobados = 0;
        double promedioCurso = 0.0;

        for (int i = 0; i < 3; i++) {
            suma = 0.0;
            promedio = 0.0;
            for (int j = 0; j < 3; j++) {
                suma = suma + notas[i][j];
            }
            promedio = suma / 3;
            notas[i][3] = promedio;
            promedioCurso += promedio;
            if (promedio >= 4.0) {
                aprobados++;
            }else{
                reprobados++;
            }
        }
        double promedioMayor = 0.0;
        double promedioMenor = Double.MAX_VALUE;
        String nombreMejorPromedio = "";
        String nombreMenorPromedio = "";
            
        for (int i = 0; i < 3; i++) {
            if (notas[i][3] > promedioMayor) {
                promedioMayor = notas[i][3];
                nombreMejorPromedio = nombres[i];
            }
            if (notas[i][3] < promedioMenor) {
                promedioMenor = notas[i][3];
                nombreMenorPromedio = nombres[i];
            }
        }
        System.out.println("Reporte de Notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(nombres[i] +": ");
            for (int j = 0; j < notas[i].length-1; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.print("| Promedio: " + notas[i][3] +"\n");
        }
        System.out.printf("Mejor promedio: %s (%.2f)%n", nombreMejorPromedio, promedioMayor);
        System.out.printf("Peor promedio: %s (%.2f)%n", nombreMenorPromedio, promedioMenor);
        System.out.println("Promedio del curso: " + promedioCurso / 3.0);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}
