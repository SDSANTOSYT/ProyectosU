import java.util.Scanner;

public class punto4 {
    /**
     * @author: Sebastian Santos
     * 
     *          Almacene en un vector v los números de Jacobsthal
     *          generados hasta un n dado, imprima todos los elementos
     *          almacenados. No se permiten variables auxiliares
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int j[] = new int[101];
        int n;
        j[1] = 0; // se les asigna los valores iniciales segun la función
        j[2] = 1;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 0) { // se valida que n sea entero no negativo
            System.out.println("n debe ser entero mayor o igual a 0");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        leer.close();
        if (n>=2) { // se calculan los elementos segun la función hasta el n que ingresó el usuario
            for (int i = 3; i <= n+1; i++) {
                j[i] = j[i-1] + 2*j[i-2];
            }
        }
        for (int i = 1 ; i <= n+1; i++) { // se imprimen los elementos hasta el n que ingresó el usuario
            System.out.printf("%d|",j[i]); 
        }

    }
}
