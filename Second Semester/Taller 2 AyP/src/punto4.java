import java.util.Scanner;

public class punto4 {
    /*
     * Author: @Sdsantos
     */
    static int vectorPrimos[] = new int[10000];
    static int k;
    static Scanner leer = new Scanner(System.in);

    public static boolean validarPrimo(int num){
        int cont = 0, i = 1;
        boolean swPrimo = false;

        while (i <= num & cont<=2) {
            if (num%i == 0) {
                cont++;
            }
            i++;
        }
        if (cont == 2) {
            swPrimo = true;
        }
        return swPrimo;
    }

    public static void generarVectorPrimos(int[][] Matriz, int n, int m){
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (validarPrimo(Matriz[i][j])) {
                    vectorPrimos[k] = Matriz[i][j];
                    k++;
                }
            }
        }
    }

    public static void leerMatriz(int[][] Matriz, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Ingrese el elemento [%d][%d]", i, j);
                Matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void imprimirVector(int[] vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("|%d",vector[i]);
        }
    }

    public static void main(String[] args) {
        int n, m;
        int Matriz[][] = new int[100][100];
        System.out.println("Ingrese las dimensiones de la matriz");
        System.out.printf("Filas: ");
        n = leer.nextInt();
        System.out.printf("Columnas: ");
        m = leer.nextInt();
        leerMatriz(Matriz, n, m);
        generarVectorPrimos(Matriz, n, m);
        imprimirVector(vectorPrimos, k);
    }
}