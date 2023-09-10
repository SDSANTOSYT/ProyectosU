import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int x[] = new int[100], i = 2, cont, j = 0, h, n;
        boolean primo = true;

        System.out.println("Ingrese el numero");
        n = leer.nextInt();
        leer.close();

        while (n != 1) {
            if (n%i == 0 && primo){
                x[j] = i;
                n = n/i;
                j = j+1;
            } else {
                i = i+1;
            }
            cont = 0;
            h = 1;
            while (cont < 3 && h <= i) {
                if (i % h == 0) {
                    cont = cont+1;
                }
                h = h+1;
            }
            if (cont == 2) {
                primo = true;
            } else{
                primo = false;
            }
        }
        for (int k = 0; k < j; k++) {
            System.out.println(x[k]);
        }
    }
}
