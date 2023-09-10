
package punto_6;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Punto_6 {

    
    public static void main(String[] args) {
        double dc, df, ap, con_mm,con_fahr, con_cel;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Digite el numero de grados Celsius:");
        dc = Leer.nextFloat();
        System.out.println("Digite el numero de grados Fahrenheit:");
        df = Leer.nextFloat();
        System.out.println("Digite el numero de pulgadas de agua:");
        ap = Leer.nextFloat();
        
        con_fahr = 9/5.0*dc+32;
        con_cel = (df-32)*5/9.0;
        con_mm = ap*(25.5);
        
        System.out.println(dc+" grados celsius son equivalentes a "+ con_fahr +" grados fahrenheit");
        System.out.println(df+" grados fahrenheit son equivalentes a "+ con_cel +" grados celsius");
        System.out.println(ap+" pulgadas de agua son equivalentes a "+ con_mm +" milimetros de agua");
    }
    
}
