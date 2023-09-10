import java.util.Scanner;

public class punto13 {
    /**
     * @author: Sebastian Santos
     * 
     *          Dado un vector v con n números enteros,
     *          elimine de v todos los elementos iguales a un x dado.
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int v[] = new int[100];
        int n, x, n2;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 1) { // se valida que n sea positivo
            System.out.println("n debe ser un entero positivo");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        n2 = n;
        for (int i = 1; i <= n; i++) { // se lee el vector
            System.out.printf("Ingrese el valor de v[%d]",i);
            v[i] = leer.nextInt();
        }
        System.out.println("Ingrese el valor que va a eliminar: ");
        x = leer.nextInt(); // se lee el elemento a eliminar
        leer.close();
        for (int i = 1; i <= n; i++) {
            while (x ==v[i]) { // se compara con los elementos del vector y si se encuentra se elimina se mueve el vector un espacio
                for (int j = i; j <= n-1; j++) {
                    v[j] = v[j+1];
                }
                n2 = n2-1;
            }
        }
        for (int i = 1; i <= n2; i++) {
            System.out.printf("%d|",v[i]); // se imprime el vector sin el elemento ingresado por el usuario
        }
    }
}
