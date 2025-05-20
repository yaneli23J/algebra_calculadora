    import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        // Ingresar datos para la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Ingresar datos para la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Sumar matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar resultado
        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
    