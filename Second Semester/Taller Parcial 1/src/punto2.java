import java.util.Scanner;

public class punto2 {
    /**
     * @author: Sebastian Santos
     * 
     *          Sea una matriz A ∈ R n×m, calcule e imprima el promedio por las filas
     */
    public static void main(String[] args) {
        
        // Se declaran toda las variables que vamos a utilizar incluyendo las matrices y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int A[][] = new int[101][101];
        double prom[] = new double[101];
        int n, m;
        double ac;
        System.out.println("Ingrese el valor de n: "); 
        n = leer.nextInt(); // se lee n
        System.out.println("Ingrese el valor de m: ");
        m = leer.nextInt(); // se lee m
        while (n < 1 || m < 1) { // Se valida que n y em sean positivos
            System.out.println("n y m deben ser enteros positivos");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
            System.out.println("Ingrese el valor de m: ");
            m = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // Se lee los valores de la matriz
            for (int j = 1; j <= m; j++) {
                System.out.printf("Ingrese el valor de A[%d][%d]: ", i, j);
                A[i][j] = leer.nextInt();
            }
        }
        leer.close();
        for (int i = 1; i <= n; i++) {// se calcula el promedio por fila
            ac = 0;
            for (int j = 1; j <= m; j++) {
                ac = ac + A[i][j];
            }
            prom[i] = ac/m;
        }
        System.out.println("EL PROMEDIO POR FILA ES: "); // se imprime el promedio por fila
        for (int i = 1; i <= n; i++) {
            System.out.printf("%.2f|",prom[i]);
        }

    }
}
