import java.util.Scanner;

public class punto5 {
    /*
     * Author: @Sdsantos
     */
    static int f[] = new int[100];
    static int k;

    public static void generarVectorFibonacci(int num) {
        f[0] = 0;
        f[1] = 1;
        k = 0;
        while (f[k] <= num) {
            k++;
            if (k > 1) {
                f[k] = f[k - 1] + f[k - 2];
            }
        }
    }

    public static void imprimirVector(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("|%d", v[i]);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero para la serie de fibonacci: ");
        num = leer.nextInt();
        leer.close();
        generarVectorFibonacci(num);
        imprimirVector(f, k);
    }
}