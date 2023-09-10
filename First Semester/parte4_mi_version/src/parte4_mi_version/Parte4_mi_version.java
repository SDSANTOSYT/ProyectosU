
package parte4_mi_version;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Parte4_mi_version {

    
    public static void main(String[] args) {
        String n1, n2, n3, n4, n5, n6, n7; int e1, e2, e3, e4, e5, e6, e7; float prom;
        Scanner Leer = new Scanner(System.in);
        Scanner Leer2 = new Scanner(System.in);
        
        System.out.println("Escribe el nombre y edad del miembro 1 en ese orden separados por espacio: ");
        n1 = Leer.next();
        e1 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 2 en ese orden separados por espacio: ");
        n2 = Leer.next();
        e2 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 3 en ese orden separados por espacio: ");
        n3 = Leer.next(); 
        e3 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 4 en ese orden separados por espacio: ");
        n4 = Leer.next();
        e4 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 5 en ese orden separados por espacio: ");
        n5 = Leer.next();
        e5 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 6 en ese orden separados por espacio: ");
        n6 = Leer.next();
        e6 = Leer2.nextInt();
        System.out.println("Escribe el nombre y edad del miembro 7 en ese orden separados por espacio: ");
        n7 = Leer.next();
        e7 = Leer2.nextInt();
        prom = (e1 + e2 + e3+ e4 + e5 + e6 + e7) / 7;
        
        System.out.println("El promedio de edades es: " + prom);
        System.out.println("Los integrantes de la familia son: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6 + ", " + n7 + ".");
    }
    
}
