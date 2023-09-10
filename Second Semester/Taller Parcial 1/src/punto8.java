import java.util.Scanner;

public class punto8 {
    /**
     * @author: Sebastian Santos
     * 
     *          Escriba un algoritmo que genere e imprima la matriz de
     *          Vandermonde para un n dado.
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo las matrices, vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int V[][] = new int[101][101];
        int a[] = new int[100];
        int n;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 1) { // se valida que n sea positivo
            System.out.println("n debe ser entero positivos");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee el vector del que se va a hacer la matriz de vandermonde
            System.out.printf("Ingrese el valor de a[%d]",i);
            a[i] = leer.nextInt();
        }
        leer.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // se calcula los elementos de la matriz de vandermonde segun su formula
                V[i][j] = (int) Math.pow(a[i], (j-1));
            }
        }
        for (int i = 1; i <= n; i++) { // se imprime la matriz
            System.out.println("");
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d|",V[i][j]);
            }
        }
    }
}
