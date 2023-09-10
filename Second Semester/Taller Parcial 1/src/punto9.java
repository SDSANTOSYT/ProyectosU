import java.util.Scanner;

public class punto9 {
    /**
     * @author: Sebastian Santos
     * 
     *          Haga un algoritmo para generar e imprimir un cuadrado
     *          mágico de orden impar con dimensiones n × n
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo las matrices y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int M[][] = new int[101][101];
        int n, contnum, i, j, i2, j2, total, c, s;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 1 || n % 2 == 0) { // se valida que n sea positiva e impar
            System.out.println("n debe ser entero positivo impar");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        total = n * n;
        c = ((n * n) + 1) / 2;
        s = n * c; // se calcula la suma invariante del cuadrado
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                M[i][j] = 0; // se asignan zeros a toda la matriz
            }
        }
        i = 1;
        j = (n + 1) / 2;
        for (contnum = 1; contnum <= total; contnum++) { // se genera el cuadrado magico con el metodo de Simon de la Loubère
            M[i][j] = contnum;
            i2 = i;
            j2 = j;
            i = i-1;
            j = j+1;
            if (i == 0) {
                i = n;
            }
            if (j > n) {
                j = 1;
            }
            if (M[i][j] != 0) {
                i = i2+1;
                j = j2;
            }
        }
        System.out.printf("LA SUMA INVARIANTE DEL CUADRADO ES: %d %n",s); // se imprime la suma invariante y el cuadrado magico
        for (int k = 1; k <= n; k++) {
            System.out.println("");
            for (int k2 = 1; k2 <= n; k2++) {
                System.out.printf("%d|",M[k][k2]);
            }
        }
    }
}
