
package calculdora;

import java.util.Scanner;

/**
 *
 * @author sdsantos
 */
public class Calculdora {

    
    public static void main(String[] args) {
        // Definimos las variables y el scanner
        double num1, num2, res;
        int op;
        Scanner Leer = new Scanner(System.in);
        
        // Mensaje de bienvenida
        System.out.println("BIENVENIDO A LA CALCULADORA");
        
        // instrucciones que se le dan al usuario
        System.out.println("Ingrese el primer valor:");
        num1 = Leer.nextDouble();
        System.out.println("Ingrese el segundo valor");
        num2 = Leer.nextDouble();
        
        // Menú de selección para el usuario
        System.out.println("Escriba el numero de la operación que desea realizar:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        
        op = Leer.nextInt();
        
        /* se evaluan las condiciones primero que todo asegurandose que el 
         * usuario haya ingresado una opción de la lista y luego se realiza 
         * la operación que el usuario ingresó y se le devuelve el resultado */
        
        if (op<1) {
            System.out.println("el numero que escribió no corresponde una operación de la lista");
        }else {
            if (op==1) {
                res = num1+num2;
                System.out.println("El resultado de la operación es: " + res);
            }else{
                if (op==2) {
                    res = num1-num2;
                    System.out.println("El resultado de la operación es: " + res);
                }else{
                    if (op==3) {
                        res = num1*num2;
                        System.out.println("El resultado de la operación es: " + res);
                    }else{
                        if (op==4) {
                            if  (num2==0){
                                System.out.println("El resultado para la división de esos valores no está definido por lo tanto no esa operación no tiene solución");
                            }else{
                              res = num1/num2;
                                System.out.println("El resultado de la operación es: " + res);  
                            }
                        }else{
                            if (op>4) {
                                System.out.println("el numero que escribió no corresponde una operación de la lista");
                            }
                        }
                    }
                }
            }
        }
    }    
}
