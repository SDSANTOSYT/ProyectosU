import java.util.Scanner;

/**
 * punto2
 */
public class punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Declaramos las variables
        int A[][] = new int[101][101];
        int v[] = new int[1021];
        int n, i, j, i2, j2, cont, aux;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // leemos n
        while (n < 1) { // validamos n
            System.out.println("VALOR INCORRECTO");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        for (i = 1; i <= n * n; i++) { // leemos el vector
            System.out.printf("Ingrese el valor de v[%d]", i);
            v[i] = leer.nextInt();
        }
        leer.close();
        i = 1;
        j = 1;
        cont = 0;
        aux = 1;
        for (int k = 1; k <= n * n; k++) { // recorremos la matriz
            A[i][j] = v[k];
            i2 = i;
            j2 = j;
            i = i + 1;
            j = j - 1;
            if (i > n && j < 1) { // mientras está en la diagonal
                i = j2 + 1;
                j = i2;
            }
            if (j < 1) { // antes de la diagonal
                cont = cont + 1;
                j = cont + 1;
                i = 1;
            }
            if (j > n) { 
                j = j - 1;
                i = i + 1;
            }
            if (i > n) { // despues de la diagonal
                aux = j2 + 1;
                i = aux;
                j = n;
                
            }

        }

        for (i = 1; i <= n; i++) { // imprimimos la matriz
            System.out.println("");
            for (j = 1; j <= n; j++) {
                System.out.printf("%d|", A[i][j]);
            }
        }
    }
}