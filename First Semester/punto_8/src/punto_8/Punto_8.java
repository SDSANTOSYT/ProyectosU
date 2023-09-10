
package punto_8;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Punto_8 {

    
    public static void main(String[] args) {
        double total_com, val_pag;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("ingrese el valor total de su compra");
        total_com = Leer.nextFloat();
        
        val_pag = total_com - (total_com*0.15);
        
        System.out.println("El valor final a pagar por su compra es de: $" + val_pag);
    }
    
}
