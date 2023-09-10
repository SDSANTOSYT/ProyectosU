import java.util.Scanner;

public class punto3 {
    /**
     * @author: Sebastian Santos
     * 
     *          Genere e imprima en un vector x todos los números primos
     *          que se encuentran entre 2 y un n dado.
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int x[] = new int[101];
        int n, cont, div, i, j;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n <= 3) { // se valida que n sea mayor que 3
            System.out.println("n debe ser entero positivo y mayor que 3");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        leer.close();
        i = 0;
        j = 3;
        while (j<n) {
            div = 1;
            cont = 0;
            while (cont<3 && div <= j) { // se cuentan los divisores de los numeros
                if (j%div == 0) {
                    cont = cont+1;
                }
                div = div+1;
            }
            if (cont == 2) { // se verifican si son primos para guardarlos en el vector
                i = i+1;
                x[i] = j;
            }
            j = j+1;
        }
        System.out.printf("LOS NUMEROS PRIMOS ENTRE 2 Y %d son: %n",n); // se imprime el vector con los primos
        for (int l = 1; l <= i; l++) {
            System.out.printf("%d|",x[l]);
        }
    }
}
