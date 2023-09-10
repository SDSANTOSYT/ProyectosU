
package punto_7;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Punto_7 {

    
    public static void main(String[] args) {
        float num_hojas, val_lb;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de hojas que tiene el libro:");
        num_hojas = Leer.nextFloat();
        val_lb = 200*num_hojas + 5000;
        
        System.out.println("El libro tiene un costo de $"+val_lb);        
    }
    
}
