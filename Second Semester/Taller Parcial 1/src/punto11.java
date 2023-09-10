import java.util.Scanner;

public class punto11 {
    /**
     * @author: Sebastian Santos
     * 
     *          Dado un conjunto de n valores, leer un valor cualquiera y mostrar
     *          la cantidad de veces que se repite en el vector v.
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int v[] = new int[100];
        int n, cont, x;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 1) { // se valida que n sea positivo
            System.out.println("n debe ser un entero positivo");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee el vector
            System.out.printf("Ingrese el valor de v[%d]: ", i);
            v[i] = leer.nextInt();
        }
        System.out.println("Ingrese el valor de X: "); // se lee el numero que se va a contar
        x = leer.nextInt();
        leer.close();
        cont = 0;
        for (int i = 1; i <= n; i++) { // se cuenta el numero que ingrese el usuario
            if (x == v[i]) {
                cont = cont + 1;
            }
        }
        System.out.printf("EL ELEMENTO %d SE REPITE %d VECES EN EL VECTOR", x, cont); // se imprime cuantas veces aparece el elemento en el vector
    }
}
