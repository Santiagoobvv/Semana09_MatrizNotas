import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        System.out.print("Ingrese el número de materias: ");
        int materias = sc.nextInt();

        double[][] notas = new double[estudiantes][materias];


        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < materias; j++) {
                System.out.print("  Nota materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < estudiantes; i++) {
            double suma = 0, max = notas[i][0], min = notas[i][0];
            for (int j = 0; j < materias; j++) {
                suma += notas[i][j];
                if (notas[i][j] > max) max = notas[i][j];
                if (notas[i][j] < min) min = notas[i][j];
            }
            double promedio = suma / materias;
            System.out.println("Estudiante " + (i + 1) + ": Promedio = " + promedio + ", Máximo = " + max + ", Mínimo = " + min);
        }
    }
}