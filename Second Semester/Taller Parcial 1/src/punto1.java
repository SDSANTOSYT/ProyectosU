import java.util.Scanner;

public class punto1 {
    /**
     * @author: Sebastian Santos
     * 
     *          Sea una matriz A ∈ Rn×m, genere 2 vectores v y c donde v tiene todos
     *          los elementos que
     *          son mayores al promedio de los elementos de A y c tiene todos los
     *          elementos que son menores
     *          al promedio de los elementos A. Imprima v y c.
     */

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in); // se crea el escanner
        int A[][] = new int[101][101]; // Se crea la matriz A
        int v[] = new int[101]; // se crea el vector v
        int u[] = new int[101]; // se crea ael vector u
        int n, m, ac, k, l; // se declaran las variables a utilizar
        double prom, dim; // se declaran las variables del promedio y dimensión
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        System.out.println("Ingrese el valor de m: ");
        m = leer.nextInt(); // se lee m
        while (n < 1 || m < 1) { // se valida que n y m sean positivos
            System.out.println("n y m deben ser enteros positivos");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
            System.out.println("Ingrese el valor de m: ");
            m = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee la matriz A
            for (int j = 1; j <= m; j++) {
                System.out.printf("Ingrese el valor de A[%d][%d]: ", i, j);
                A[i][j] = leer.nextInt();
            }
        }
        leer.close();
        ac = 0;
        // se calcula la suma de los elementos de la matriz
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                ac = ac + A[i][j];
            }
        }
        dim = n * m;
        // se calcula el promedio de los elementos de la matriz
        prom = ac / dim;
        k = 0;
        l = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A[i][j] > prom) { // los elementos mayores al promedio se guardan en el vector v
                    k = k+1;
                    v[k] = A[i][j];
                } else {
                    if (A[i][j]<prom) { // los elementos menores al promedio se guardan en el vector u
                        l = l+1;
                        u[l] = A[i][j];
                    }
                }
            }
        }
        System.out.println("ELEMENTOS POR ENCIMA DEL PROMEDIO"); // se imprimen el vector v
        for (int i = 1; i <= k; i++) {
            System.out.printf("%d|",v[i]);
        }
        System.out.println("");
        System.out.println("ELEMENTOS POR DEBAJO DEL PROMEDIO"); // se imprime el vector u
        for (int i = 1; i <= l; i++) {
            System.out.printf("%d|",u[i]);
        }

    }
}
