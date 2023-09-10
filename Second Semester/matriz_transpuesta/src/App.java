import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int[][] A = new int[100][100];
        int n, temp;
        System.out.println("Ingrese la dimensión de la matriz");
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Ingrese el valor de A[%d][%d]", i, j);
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nMatriz original");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "|");
            }
        }
        System.out.println("\nmatriz transpuesta");
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                temp = A[i][n - i - j - 2];

                A[i][n - i - j - 2] = A[i + j + 1][n - i - 1];

                A[i + j + 1][n - i - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "|");
            }
        }

        leer.close();

    }
}
