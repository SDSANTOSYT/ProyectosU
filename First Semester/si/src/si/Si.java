
package si;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Si {

    
    public static void main(String[] args) {
        double n1, n2, n3, n4, prom;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Escribe 4 numeros: ");
        
        n1 = Leer.nextDouble();
        n2 = Leer.nextDouble();
        n3 = Leer.nextDouble();
        n4 = Leer.nextDouble();
        
        if (n1<n2 && n1<n3 && n1<n4 ) {
            prom = (n4+n2+n3)/3;
            System.out.println("el promedio es "+ prom);
        }
        else if (n2<n1 && n2<n3 && n2<n4 ) {
            prom = (n1+n4+n3)/3;
            System.out.println("el promedio es "+ prom);
        }
        else if (n3<n2 && n3<n1 && n3<n4 ) {
            prom = (n1+n2+n4)/3;
            System.out.println("el promedio es "+ prom);
        }
        else if (n4<n2 && n4<n3 && n4<n1 ) {
            prom = (n1+n2+n3)/3;
            System.out.println("el promedio es "+ prom);
        }
    }
}