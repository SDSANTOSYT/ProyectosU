import java.util.Scanner;

public class punto6 {
    /**
     * @author: Sebastian Santos
     * 
     *          Lea dos vectores x y z de dimensión n y m respectivamente, y diga
     *          cuáles elementos de x son amigos de z. Recuerde que los elementos
     *          de cada vector deben ser diferentes.
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int x[] = new int[101];
        int z[] = new int[101];
        int res1[] = new int[101];
        int res2[] = new int[101];
        int n, m, k, contd, contd2, l;
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
        for (int i = 1; i <= n; i++) { // se lee el vector x
            System.out.printf("Ingrese el valor de x[%d]", i);
            x[i] = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee el vector z
            System.out.printf("Ingrese el valor de z[%d]", i);
            z[i] = leer.nextInt();
        }
        leer.close();
        l = 0;
        for (int i = 1; i <= n; i++) {
            k = 2;
            contd = 1;
            while (k < x[i]) { // se calcula la suma de los divisores del numero en el vector x
                if (x[i] % k == 0) {
                    contd = contd + k;
                }
                k = k + 1;
            }
            for (int j = 1; j <= m; j++) {
                if (contd == z[j]) { // se compara la suma anterior con un numero en el vector z 
                    k = 2;
                    contd2 = 1;
                    while (k < z[j]) { // se calcula la suma de los divisores del numero en el vector z
                        if (z[j] % k == 0) {
                            contd2 = contd2 + k;
                        }
                        k = k + 1;
                    }
                    if (contd2 == x[i]) { // se compara si los dos numeros son amigos
                        l = l + 1;
                        res1[l] = x[i];
                        res2[l] = z[j];
                    }
                }
            }
        }
        System.out.println("ESTOS ELEMENTOS SON AMIGOS EN x Y z");
        for (int i = 1; i <= l; i++) {
            System.out.printf("%d|", res1[i]); // se imprimen los numeros amigos en x con z
        }
        System.out.println("");
        for (int i = 1; i <= l; i++) {
            System.out.printf("%d|", res2[i]); // se imprimen los numeros amigos en z con x
        }

    }
}
