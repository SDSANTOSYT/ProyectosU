import java.util.Scanner;

public class punto5 {
    /**
     * @author: Sebastian Santos
     * 
     *          Lea una matriz A ∈ R n×n, si el promedio de la triangular
     *          inferior es mayor que el promedio del de la triangular
     *          superior, calcule A⊺, en caso contrario calcular 2A⊺*A
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo las matrices y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int A[][] = new int[101][101];
        int At[][] = new int[101][101];
        int res[][] = new int[101][101];
        int n, cantsup, cantinf, ac;
        double promsup, prominf;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 2) { // se valida que n sea mayor que 1
            System.out.println("n debe ser entero positivo y mayor que 1");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se leen los valores de la matriz
            for (int j = 1; j <= n; j++) {
                System.out.printf("Ingrese el valor de A[%d][%d]: ", i, j);
                A[i][j] = leer.nextInt();
            }
        }
        leer.close();
        promsup = 0;
        cantsup = 0;
        for (int i = 1; i <= n - 1; i++) { // se calcula la suma de los elementos de la triangular superior
            for (int j = i + 1; j <= n; j++) {
                promsup = promsup + A[i][j];
                cantsup = cantsup + 1;
            }
        }
        promsup = promsup / cantsup; // se calcula el promedio de los elementos de la triangular superior
        prominf = 0;
        cantinf = 0;
        for (int i = 2; i <= n; i++) { // se calcula la sumna de los elementos de la triangular inferior
            for (int j = 1; j <= i - 1; j++) {
                prominf = prominf + A[i][j];
                cantinf = cantinf + 1;
            }
        }
        prominf = prominf / cantinf; // se calcula el promedio de los elementos de la triangular inferior
        if (prominf > promsup) { // se comparan los promedios
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) { // se calcula la traspuesta
                    At[i][j] = A[j][i];
                }
            }
            System.out.println("EL PROMEDIO DE LA TRIANGULAR INFERIOR ES MAYOR QUE EL DE LA SUPERIOR"); 
            System.out.print("MATRIZ A TRANSPUESTA"); // se imprime la traspuesta
            for (int i = 1; i <= n; i++) {
                System.out.println("");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d|", At[i][j]);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) { // se calcula la traspuesta multiplicada por 2
                for (int j = 1; j <= n; j++) {
                    At[i][j] = 2 * A[j][i];
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    ac = 0;
                    for (int k = 1; k <= n; k++) {
                        ac = ac + At[i][k] * A[k][j]; // se calcula el producto matricial del doble de la traspuesta con la matriz normal
                    }
                    res[i][j] = ac;
                }
            }
            System.out.println("EL PROMEDIO DE LA TRIANGULAR SUPERIOR ES MAYOR QUE EL DE LA INFERIOR");
            System.out.print("2At*A"); // se imprime la operación antes calculada
            for (int i = 1; i <= n; i++) {
                System.out.println("");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d|", res[i][j]);
                }
            }
        }

    }
}
