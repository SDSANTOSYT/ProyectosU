
package capital_invertido;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Capital_invertido {

    
    public static void main(String[] args) {
        double cap_inv, gan;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de capital a invertir:");
        cap_inv = Leer.nextFloat();
        gan = cap_inv*0.02;
        System.out.println("su ganancia despues de un mes es: "+gan);
    }
    
}
