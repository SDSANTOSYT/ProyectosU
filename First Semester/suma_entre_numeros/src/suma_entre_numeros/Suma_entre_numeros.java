
package suma_entre_numeros;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Suma_entre_numeros {

    
    public static void main(String[] args) {
        int n1, n2, c, sum=0, p;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Este programa calcula la suma de los numeros entre 2 numeros");
        System.out.println("Ingrese el primer numero: ");
        n1 = Leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = Leer.nextInt();
        
        if (n1>n2) {
            p = n2;
            n2 = n1;
            n1 = p;
        }
        c = n1+1;
        while (c<n2){
            sum = sum+c;
            c = c+1;
        }
        System.out.println("La suma de los numeros es: " + sum);
    }
    
}
