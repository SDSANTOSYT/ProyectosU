import java.util.Scanner;

public class punto7 {
    /**
     * @author: Sebastian Santos
     * 
     *          En un matriz X ∈ R n×m almacene números naturales mayores que
     *          cero y en un vector v almacene todos los números perfectos que
     *          puedan estar en X. Debe imprimir el vector resultante.
     * 
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo las matrices, vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int X[][] = new int[101][101];
        int v[] = new int[101];
        int n, m, contd, k, l;
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
        for (int i = 1; i <= n; i++) { // se lee la matriz
            for (int j = 1; j <= m; j++) {
                System.out.printf("Ingrese el valor de X[%d][%d]: ", i, j);
                X[i][j] = leer.nextInt();
                while (X[i][j] < 1) { // se valida que los numeros de la matriz sean positivos
                    System.out.println("LOS ELEMENTOS DEL VECTOR DEBEN SER ENTEROS POSITIVOS");
                    System.out.printf("Ingrese el valor de X[%d][%d]: ", i, j);
                    X[i][j] = leer.nextInt();
                }
            }
        }
        leer.close();
        l = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) { // se calcula si un numero es perefecto en la matriz
                k = 2;
                contd = 1;
                while (k < X[i][j]) {
                    if (X[i][j] % k == 0) {
                        contd = contd + k;
                    }
                    k = k + 1;
                }
                if (contd == X[i][j] && X[i][j] != 1) {
                    l = l + 1;
                    v[l] = X[i][j];
                }
            }
        }
        System.out.println("LOS NUMEROS PERFECTOS EN LA MATRIZ SON: ");
        for (int i = 1; i <= l; i++) {
            System.out.printf("%d|", v[i]); // se imprime el vector con los numeros perfectos de la matriz
        }

    }
}
