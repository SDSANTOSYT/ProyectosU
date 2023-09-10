package menu_sucesiones_y_series;

import java.util.Scanner;

/**
 *
 * @author sdsantos
 */
public class Menu_sucesiones_y_series {
    
    public static void main(String[] args) {
        int n, k, m, s, s1, s2, p1, p2, op = 1, op1;
        double p;
        
        Scanner leer = new Scanner(System.in);
        while (op == 1) {
            System.out.println("BIENVENIDO AL MENÚ DE LAS SUCESIONES Y SERIES");
            System.out.println("Ingrese el numero de la opción que desea: ");
            System.out.println("1. potencia");
            System.out.println("2. sucesión");
            System.out.println("3. serie");
            System.out.println("4. sumatoria A");
            System.out.println("5. sumatoria B");
            System.out.println("6. sumatoria E");
            System.out.println("7. salir");
            System.out.println("-------------------------------------------------");
            op1 = leer.nextInt();
            switch (op1) {
                case 1:
                    p = 1;
                    System.out.println("Escribe la base de la potencia: ");
                    m = leer.nextInt();
                    System.out.println("Escribe la potencia: ");
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese la potencia: ");
                        n = leer.nextInt();
                    }
                    for (int i = 1; i <= n; i++) {
                        p = p * m;
                    }
                    System.out.println("La potencia del numero es: " + p);
                    break;
                case 2:
                    System.out.println("escriba el numero de elementos de la sucesión: ");
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese el valor de n: ");
                        n = leer.nextInt();
                    }
                    System.out.println("La sucesión creada es: ");
                    for (int i = 0; i <= n - 1; i++) {
                        System.out.println(2 * i);
                    }
                    break;
                case 3:
                    System.out.println("Escriba el numero de la serie: ");
                    s = 0;
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese el numero de la serie: ");
                        n = leer.nextInt();
                    }
                    for (int i = 0; i <= n - 1; i++) {
                        s = s + 2 * i;
                    }
                    System.out.println("el resultado de la serie es: " + s);
                    break;
                case 4:
                    s = 0;
                    System.out.println("Ingrese el valor n de la serie:");
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese el valor de n: ");
                        n = leer.nextInt();
                    }
                    System.out.println("Ingrese el valor de la incognita K de la serie");
                    k = leer.nextInt();
                    for (int j = 1; j <= n; j++) {
                        s = s + 2 * k;
                    }
                    System.out.println("El valor de la sumatoria A es: " + s);
                    break;
                case 5:
                    s = 0;
                    System.out.println("Ingrese el valor n de la serie:");
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese el valor de n: ");
                        n = leer.nextInt();
                    }
                    for (int j = 1; j <= n; j++) {
                        s = s + (3 * j + 1);
                    }
                    System.out.println("El valor de la sumatoria B es: " + s);
                    break;
                case 6:
                    System.out.println("Ingrese el valor n de la serie: ");
                    n = leer.nextInt();
                    while (n<0){
                        System.out.println("ERROR");
                        System.out.println("Ingrese el valor n de la serie: ");
                        n = leer.nextInt();
                    }
                    s1 = 0;
                    for (int j = 1; j <= n; j++) {
                        p1 = 1;
                        for (int j1 = 1; j1 <= 2; j1++) {
                            p1 = p1 * (2 * j - 1);
                        }
                        s1 = s1 + p1;
                    }
                    s2 = 0;
                    for (int i = 1; i <= n; i++) {
                        p2 = 1;
                        for (int i1 = 1; i1 <= 3; i1++) {
                            p2 = p2 * (2 * i - 1);
                        }
                        s2 = s2 + p2;
                    }
                    s = s1 + s2;
                    System.out.println("El resultado de la sumatoria es: " + s);
                    break;
                case 7:
                    op = 0;
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
            
            if (op != 0) {
                System.out.println("--------------------------------");
                System.out.println("Desea continuar con el menú?");
                System.out.println("1: si");
                System.out.println("otro: no");
                op = leer.nextInt();
                System.out.println("-----------------------------------");
            }
        }
        
    }
}
