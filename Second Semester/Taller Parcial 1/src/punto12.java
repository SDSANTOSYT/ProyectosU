import java.util.Scanner;

public class punto12 {
    /**
     * @author: Sebastian Santos
     * 
     *          Tiene n números en un vector v,
     *          determine cuántos y cuáles son palíndromo
     */
    public static void main(String[] args) {
         // Se declaran toda las variables que vamos a utilizar incluyendo los vectores y sus dimensiones
        Scanner leer = new Scanner(System.in);
        int v[] = new int[101];
        int res[] = new int[101];
        int n, d, r, j, num;
        System.out.println("Ingrese el valor de n: ");
        n = leer.nextInt(); // se lee n
        while (n < 1) { // se valida que n sea positivo
            System.out.println("n debe ser un entero positivo");
            System.out.println("Ingrese el valor de n: ");
            n = leer.nextInt();
        }
        for (int i = 1; i <= n; i++) { // se lee el vector con n elementos
            System.out.printf("Ingrese el valor de v[%d]",i);
            v[i] = leer.nextInt();
        }
        leer.close();
        j = 0;
        for (int i = 1; i <= n; i++) { // se verifica si el numero en el vector es palindromo invirtiendolo y comparandolo consigo mismo
            num = v[i];
            r = 0;
            while (num != 0) {
                d = num%10;
                r = r*10 + d;
                num = num/10;
            }
            if (v[i] == r) { // si es palindromo se almacena en otro vector
                j = j+1;
                res[j] = v[i];
            }
        }
        System.out.printf("HAY %d NUMEROS PALINDROMOS: ",j); // se imprimen la cantidad de palindromos
        for (int i = 1; i <= j; i++) {
            System.out.printf("%d|",res[i]); // se imprime el vector que contiene los palindromos
        }
    }
}
