
package trabajo_ind_condicionales;

import java.util.Scanner;

/**
 *
 * @author sebas y carlos
 */
public class Trabajo_ind_condicionales {

    
    public static void main(String[] args) {
        // primero declaramos las variables para cada opción y el escanner
        // variable del menú
        int op;
        // variables de la opción 1
        int edad;
        // variables de la opción 2
        int num_2;
        // variables de la opción 3
        int num_3, c1, c3;
        // variables de la opción 4
        double ingresos;
        // scanner
        Scanner Leer = new Scanner(System.in);
        
        // escribimos el menú
        System.out.println("Menu");
        System.out.println("1. Mayor de edad");
        System.out.println("2. Par positivo");
        System.out.println("3. Capicua");
        System.out.println("4. Tributo");
        System.out.println("5. Salir");
        
        // Leemos la variable del menú
        System.out.println("Elige la opcion que desees escribiendo el numero que le corresponde:");
        op = Leer.nextInt();
        
        // Revisamos cual opción escogió y realizamos el procedimiento correspondiente
        if (op==1) {
            System.out.println("Ingrese el numero de su edad");
            edad = Leer.nextInt();
            if (edad<18) {
                System.out.println("Eres menor de edad");
            }else{
                System.out.println("Eres mayor de edad");
            }
        }
        else{
            if (op==2){
                System.out.println("Ingrese un numero entero");
                num_2 = Leer.nextInt();
                if (num_2>0 && (num_2%2)==0) {
                    System.out.println("El numero es par positivo");
                }else{
                    System.out.println("El numero no es par positivo");
                }
            }else{
                if (op==3) {
                    System.out.println("Escribe un numero entero de 3 cifras");
                    num_3 = Leer.nextInt();
                    c1 = num_3/100;
                    c3 = num_3%10;
                    if (c1==c3) {
                        System.out.println(num_3+" Es capicua");
                    }else{
                        System.out.println(num_3+" No es capicua");
                    }
                }else{
                    if (op==4) {
                        System.out.println("Ingrese el numero de su edad");
                        // acá reutilizamos la variable edad 
                        edad = Leer.nextInt();
                        System.out.println("Escriba cuanto son sus ingresos");
                        ingresos = Leer.nextDouble();
                        if (edad>16 && ingresos>=1000) {
                            System.out.println("El usuario tiene que tributar");
                        }else{
                            System.out.println("El usuario no tiene que tributar");
                        }
                    }else{
                        if (op==5) {
                            System.out.println("Muchas gracias por usar nuestro programa. Adios");
                        }else{
                        System.out.println("Esa opción no se encuentra en la lista");
                        }
                    }
                }
            }
        }
    System.out.println("Hecho por Carlos Morales y Sebastian Santos");
    }    
}
