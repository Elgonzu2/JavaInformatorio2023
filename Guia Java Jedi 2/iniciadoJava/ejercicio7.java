import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de Calificaciones");

        System.out.print("Ingrese el número de notas: ");
        int numeroNotas = scanner.nextInt();

        double totalCalificaciones = 0;

        System.out.println("Ingrese las notas (una por una):");

        for (int i = 1; i <= numeroNotas; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            totalCalificaciones += nota;
        }

        double promedio = totalCalificaciones / numeroNotas;

        System.out.print("Notas ingresadas: ");
        for (int i = 1; i <= numeroNotas; i++) {
            System.out.print(i + ": ");
            if (i < numeroNotas) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        System.out.println("Promedio de calificaciones: " + promedio);

        if (promedio >= 7.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
