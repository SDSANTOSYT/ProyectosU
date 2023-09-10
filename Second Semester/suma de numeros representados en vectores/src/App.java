import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int x[] = new int[100], y[] = new int[100], sum[] = new int[101], n, res;

        System.out.println("Ingrese el numero de digitos");
        n = leer.nextInt(); // leemos n
        for (int i = 0; i < n; i++) { // leemos el vector x
            System.out.println("Ingrese el digito de x");
            x[i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) { // leemos el vector y
            System.out.println("Ingrese el digito de y");
            y[i] = leer.nextInt();
        }
        res = 0;
        for (int i = n; i >= 0; i--) { // realizamos la suma
            sum[i] = (x[i] + y[i] + res) % 10;
            if ((x[i] + y[i] + res) > 9) {
                res = 1;
            } else {
                res = 0;
            }
        }
        if (res == 1) { // si queda residuo en el primer digito le agregamos una unidad más
            for (int i = n + 1; i >= 1; i--) {
                sum[i] = sum[i - 1];
            }
            sum[0] = 1;
            n = n + 1;
        }
        for (int i = 0; i < n; i++) { // escribimos el vector
            System.out.print(sum[i]);
        }
        leer.close();
    }
}
