import java.util.Scanner;

public class punto10 {
    /**
     * @author: Sebastian Santos
     * 
     *          Sean A ∈ R n×m y B ∈ R p×q dos matrices. Realice un algoritmo para
     *          calcular el mayor elemento de A y B, si el mayor elemento se
     *          encuentra en A, realizar la operación (A + B)At en caso contrario
     *          calcule la operación (B − A)Bt. Debe imprimir la matriz resultante
     *          para cualquier caso
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         // Se declaran toda las variables que vamos a utilizar incluyendo las matrices y sus dimensiones
        int A[][] = new int[101][101];
        int B[][] = new int[101][101];
        int At[][] = new int[101][101];
        int Bt[][] = new int[101][101];
        int res[][] = new int[101][101];
        int res2[][] = new int[101][101];
        int n, m, p, q, mayorA, mayorB, ac;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        System.out.println("Ingrese el valor de m: ");
        m = leer.nextInt(); // se lee m
        System.out.println("Ingrese el valor de p: ");
        p = leer.nextInt(); // se lee p
        System.out.println("Ingrese el valor de q: ");
        q = leer.nextInt(); // se lee q
        while (n < 1 || m < 1 || (n!=m && n!=p && n!= q)) { // se valida que n, m, p y q sea iguales para poder realizar las operaciones
            System.out.println("n, m, p y q  deben ser iguales y enteros positivos");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
            System.out.println("Ingrese el valor de m: ");
            m = leer.nextInt();
            System.out.println("Ingrese el valor de p: ");
            p = leer.nextInt();
            System.out.println("Ingrese el valor de q: ");
            q = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee la matriz A
            for (int j = 1; j <= m; j++) {
                System.out.printf("Ingrese el valor de A[%d][%d]: ", i, j);
                A[i][j] = leer.nextInt();
            }
        }
        mayorA = A[1][1];
        for (int i = 1; i <= p; i++) { // Se lee la matriz B
            for (int j = 1; j <= q; j++) {
                System.out.printf("Ingrese el valor de B[%d][%d]: ", i, j);
                B[i][j] = leer.nextInt();
            }
        }
        leer.close();
        mayorB = B[1][1];
        for (int i = 1; i <= n; i++) { // Se halla el mayor valor de A
            for (int j = 1; j <= m; j++) {
                if (A[i][j] > mayorA) {
                    mayorA = A[i][j];
                }
            }
        }
        for (int i = 1; i <= p; i++) { // Se halla el mayor valor de B
            for (int j = 1; j <= q; j++) {
                if (B[i][j] > mayorB) {
                    mayorB = B[i][j];
                }
            }
        }
        if (mayorA > mayorB) { // se compara cual matriz tiene el mayor valor
            System.out.println("EL MAYOR SE ENCUENTRA EN A");
            for (int i = 1; i <= m; i++) { // se calcula la traspuesta de A
                for (int j = 1; j <= n; j++) {
                    At[i][j] = A[j][i];
                }
            }
            for (int i = 1; i <= n; i++) { // Se calcula la suma de A y B
                for (int j = 1; j <= m; j++) {
                    res[i][j] = A[i][j] + B[i][j];
                }
            }
            for (int i = 1; i <= m; i++) { // se realiza el producto matricial de la anterior suma por la traspuesta de A
                for (int j = 1; j <= m; j++) {
                    ac = 0;
                    for (int k = 1; k <= n; k++) {
                        ac = ac + res[i][k]*At[k][j];
                    }
                    res2[i][j] = ac; 
                }
            }
        } else {
            System.out.println("EL MAYOR SE ENCUENTRA EN B");
            for (int i = 1; i <= q; i++) { // Se calcula la traspuesta de B
                for (int j = 1; j <= p; j++) {
                    Bt[i][j] = B[j][i];
                }
            }
            for (int i = 1; i <= p; i++) { // Se realiza la resta de B y A
                for (int j = 1; j <= q; j++) {
                    res[i][j] = B[i][j] - A[i][j];
                }
            }
            for (int i = 1; i <= q; i++) { // Se realiza el producto matricial de la anterior resta por la traspuesta de B
                for (int j = 1; j <= q; j++) {
                    ac = 0;
                    for (int k = 1; k <= p; k++) {
                        ac = ac + res[i][k]*Bt[k][j];
                    }
                    res2[i][j] = ac;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d|",res2[i][j]); // Se imprime la matriz resultante de la operacion que corresponga
            }
        }
    }
}
