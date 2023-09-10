
package punto_9;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Punto_9 {

    
    public static void main(String[] args) {
        float c1, val_c1, c2, val_c2, c3, val_c3, costo_total;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de tiquetes de clase 1");
        c1 = Leer.nextFloat();
        System.out.println("Ingresa la cantidad de tiquetes de clase 2");
        c2 = Leer.nextFloat();
        System.out.println("Ingresa la cantidad de tiquetes de clase 3");
        c3 = Leer.nextFloat();
        
        val_c1 = c1*480000;
        val_c2 = c2*300000;
        val_c3 = c3*190000;
        costo_total = val_c1 + val_c2 + val_c3;
        
        System.out.println("El costo total de la compra de los tiquetes es: $" + costo_total);
        
    }
    
}
