import java.util.Scanner;

public class punto10 {
    /*
     * Author: @Sdsantos
     */

    static int inicioFila, inicioColumna, x, lim;

    public static void moverDerecha(int[][] Matriz, int n, int i) {
        int fin = n - i;
        for (i = inicioFila; i < fin; i++) {
            if (x < lim) {
                Matriz[inicioFila][i] = x;
                x++;
            }
        }
        inicioFila = inicioFila + 1;
        inicioColumna = i - 1;
    }

    public static void moverAbajo(int[][] Matriz, int n, int i) {
        int fin = n - i;
        for (i = inicioFila; i < fin; i++) {
            if (x < lim) {
                Matriz[i][inicioColumna] = x;
                x++;
            }
        }
        inicioFila = i - 1;
        inicioColumna = inicioColumna - 1;
    }

    public static void moverIzquierda(int[][] Matriz, int n, int i) {
        int fin = i;
        for (i = inicioColumna; i >= fin; i--) {
            if (x < lim) {
                Matriz[inicioFila][i] = x;
                x++;
            }
        }
        inicioFila = inicioFila - 1;
        inicioColumna = i + 1;
    }

    public static void moverArriba(int[][] Matriz, int n, int i) {
        int fin = i + 1;
        for (i = inicioFila; i >= fin; i--) {
            if (x < lim) {
                Matriz[i][inicioColumna] = x;
                x++;
            }
        }
    }

    public static void caracol(int[][] Matriz, int n) {
        int lim2;
        if (n % 2 == 0) {
            lim2 = n / 2;
        } else {
            lim2 = n / 2 + 1;
        }
        for (int i = 0; i < lim2; i++) {
            inicioFila = i;
            moverDerecha(Matriz, n, i);
            moverAbajo(Matriz, n, i);
            moverIzquierda(Matriz, n, i);
            moverArriba(Matriz, n, i);
        }
    }

    public static void imprimirMatriz(int[][] Matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d|", Matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Matriz[][] = new int[100][100];
        int n;
        System.out.println("Ingrese n: ");
        n = leer.nextInt();
        System.out.println("Ingrese x: ");
        x = leer.nextInt();
        lim = n * n + x;
        leer.close();
        caracol(Matriz, n);
        imprimirMatriz(Matriz, n);
    }
}