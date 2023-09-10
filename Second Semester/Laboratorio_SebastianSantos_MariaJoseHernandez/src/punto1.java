import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A[][] = new int[101][101];
        int At[][] = new int[101][101];
        int Ats[][] = new int[101][101];
        int B[][] = new int[101][101];
        int Z[][] = new int[202][202];
        int n, ac;
        int sw = 0;

        do { //Utilizamos la estructura Hacer Mientras para asegurarnos de que el usuario pueda volver a ejecutar el proceso cuantas veces desee
            System.out.println("Ingrese el valor de n: "); //Validamos N
            n = leer.nextInt();
            while (n < 1) {
                System.out.println("VALOR INCORRECTO");
                System.out.println("Ingrese el valor de n: ");
                n = leer.nextInt();
            }
            for (int i = 1; i <= n; i++) { // leemos la matriz
                for (int j = 1; j <= n; j++) {
                    System.out.printf("Ingrese el valor de A[%d][%d]", i, j);
                    A[i][j] = leer.nextInt();
                }
            }
            for (int i = 1; i <= n; i++) { //Con la estructura Para realizamos la matriz transpuesta con ayuda de otraq matriz
                for (int j = 1; j <= n; j++) {
                    At[i][j] = A[j][i];
                }
            }
            for (int i = 1; i <= n; i++) { //Multiplicamos la matriz transpuesta por la matriz original y alamacenamos el resultado en la matriz resultante (B)
                for (int j = 1; j <= n; j++) {
                    ac = 0;
                    for (int k = 1; k <= n; k++) {
                        ac = ac + (At[i][k] * A[k][j]);
                    }
                    B[i][j] = ac;
                }
            }
            for (int i = 1; i <= n; i++) { //Sacamaos la triangular secundaria de la matriz transpuesta por diagonal secundaria
                for (int j = 1; j <= n; j++) {
                    Ats[i][j] = A[n - j + 1][n - i + 1];
                }
            }
            for (int i = 1; i <= 2 * n; i++) {
                for (int j = 1; j <= 2 * n; j++) {
                    if (i <= n && j <= n) {
                        Z[i][j] = A[i][j];
                    }
                    if (i <= n && j > n) {
                        Z[i][j] = At[i][j - n];
                    }
                    if (i > n && j <= n) {
                        Z[i][j] = B[i - n][j];
                    }
                    if (i > n && j > n) {
                        Z[i][j] = Ats[i - n][j - n];
                    }
                }
            }
            for (int i = 1; i <= 2 * n; i++) { // Escribimos la matriz 2n x 2n resultante
                for (int j = 1; j <= 2 * n; j++) {
                    System.out.printf("%d|", Z[i][j]);
                }
                System.out.println("\n");
            }
            System.out.println("¿Desea volver a realizar calcular esta matriz?\n" // Se le pregunta a el usuario si desea volver a iterar el codigo mediante un switch
                    + "1. si\n"
                    + "2. no");
            sw = leer.nextInt();
            while (sw != 1 && sw != 2) {
                System.out.println("OPCION INVALIDA");
                System.out.println("¿Desea volver a realizar calcular esta matriz?\n"
                        + "1. si\n"
                        + "2. no");
                sw = leer.nextInt();
            }
            leer.close();
        } while (sw == 1); // Condiciendo del Hacer Mientras con la que se itera el codigo

    }
}
