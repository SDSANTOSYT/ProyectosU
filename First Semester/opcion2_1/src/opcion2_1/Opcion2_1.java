package opcion2_1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Opcion2_1 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n, cuad;
        String mensaje;
        System.out.println("Ingrese el valor N");
        n = Leer.nextInt();
        while (n < 3 && n > -3) {
            System.out.println("Numero invalido");
            System.out.println("no hay numeros enteros entre 1 y " + n);
            System.out.println("Ingrese el valor N");
            n = Leer.nextInt();
        }
        System.out.println("Los enteros entre 1 y " + n + " son:");
        if (n < 0) {
            for (int j = 0; j >= n + 1; j--) {
                cuad = 0;
                for (int i = -1; i >= j; i--) {
                    cuad -= (2 * i) + 1;
                }
                mensaje = j + " cuyo cuadrado es: " + (cuad);
                System.out.println(mensaje);
            }
        } else {
            for (int j = 2; j <= n - 1; j++) {
                cuad = 0;
                for (int i = 1; i <= j; i++) {
                    cuad += (2 * i) - 1;
                }
                mensaje = j + " cuyo cuadrado es: " + cuad;
                System.out.println(mensaje);
            }
        }
    }

}
