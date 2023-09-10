
package menu_opciones_dd;

import java.util.Scanner;

/**
 *
 * @author SDSANTOS
 */
public class Menu_opciones_DD {

    
    public static void main(String[] args) {
        // Declaramos variables y el Scanner
        int op, num1, vocal, num3;
        String ope;
        double dec_parte, res, I, V, R;
        Scanner Leer = new Scanner(System.in);
        
        // le presentamos el menú al usuario
        System.out.println("Bienvenido al menú de opciones");
        System.out.println("Ingrese el numero de la opción que desea seleccionar:");
        System.out.println("""
                           1. Numeros romanos
                           2. Vocales
                           3. Propiedades de numeros
                           4. Ley de Ohm""");
        System.out.println("-----------------------------------------");
        // Leemos la opción del usuario
        op = Leer.nextInt();
        
        switch (op){
            case 1:
                System.out.println("-----------------------------------------");
                System.out.println("Bienvenido a la opción 1: Numeros romanos");
                System.out.println("Ingrese un numero del 1 al 10 para ver su equivalente en romano:");
                System.out.println("-----------------------------------------");
                num1 = Leer.nextInt();
                switch(num1){
                    case 1:
                        System.out.println("1 en romano es I");
                        break;
                    case 2:
                        System.out.println("2 en romano es II");
                        break;
                    case 3:
                        System.out.println("3 en romano es III");
                        break;
                    case 4:
                        System.out.println("4 en romano es IV");
                        break;
                    case 5:
                        System.out.println("5 en romano es V");
                        break;
                    case 6:
                        System.out.println("6 en romano es VI");
                        break;
                    case 7:
                        System.out.println("7 en romano es VII");
                        break;
                    case 8:
                        System.out.println("8 en romano es VIII");
                        break;
                    case 9:
                        System.out.println("9 en romano es IX");
                        break;
                    case 10:
                        System.out.println("10 en romano es X");
                        break;
                    default:
                        System.out.println("Numero invalido");
                }
                break;
            case 2:
                System.out.println("-----------------------------------------");
                System.out.println("Bienvenido a la opción 2: Vocales");
                System.out.println("Ingrese un numero del 1 al 5 para saber la vocal que le corresponde:");
                System.out.println("-----------------------------------------");
                vocal = Leer.nextInt();
                switch (vocal){
                    case 1:
                        System.out.println("La vocal correspondiente es A");
                        break;
                    case 2:
                        System.out.println("La vocal correspondiente es E");
                        break;
                    case 3:
                        System.out.println("La vocal correspondiente es I");
                        break;
                    case 4:
                        System.out.println("La vocal correspondiente es O");
                        break;
                    case 5:
                        System.out.println("La vocal correspondiente es U");
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
                break;
            case 3:
                System.out.println("-------------------------------------------");
                System.out.println("Bienvenido a la opción 3: Propiedades de numeros");
                System.out.println("Ingrese un numero mayor que 100 para conocer que se puede hacer con el:");
                System.out.println("-------------------------------------------");
                num3 = Leer.nextInt();
                
                if (num3>100) {
                    switch (num3%10){
                        case 1:
                        case 5:
                            dec_parte = num3/10.0;
                            System.out.println("La decima parte del numero es: "+ dec_parte);
                            break;
                        case 4:
                        case 7: 
                        case 9:
                            if (num3%3==0) {
                                System.out.println("El numero es divisible entre 3");
                            }else{
                                System.out.println("El numero no es divisible entre 3");
                            }
                            break;
                        default:
                            dec_parte = num3/17;
                            res = num3%17;
                            System.out.println("La parte entera del numero al dividirlo por 17 es: "+ dec_parte);
                            System.out.println("El residuo de la división entre el numero y 17 es: "+ res);  
                    }
                }else{
                    System.out.println("Numero invalido, el numero debe ser mayor que 100");
                }
                break;
            case 4:
                System.out.println("-------------------------------------------");
                System.out.println("Bienvenido a la opción 4: Ley de Ohm");
                System.out.println("""
                                   Ingrese la letra de la variable que desea calcular:
                                   I/i: Intensidad de corriente
                                   V/v: Diferencia de potencial
                                   R/r: Resistencia""");
                System.out.println("-------------------------------------------");
                ope = Leer.next();
                switch (ope){
                    case "I":
                    case "i":
                        System.out.println("Ingrese el valor de la variable V:");
                        V = Leer.nextDouble();
                        System.out.println("Ingrese el valor de la variable R:");
                        R = Leer.nextDouble();
                        if (V>0 && R>0) {
                            I = V/R;
                            System.out.println("El valor de la intensidad de corriente es de: "+I+"A (Amperios)");
                        }else{
                            System.out.println("Valores invalidos, deben ser mayores que 0");
                        }
                        break;
                    case "V":
                    case "v":
                        System.out.println("Ingrese el valor de la variable I:");
                        I = Leer.nextDouble();
                        System.out.println("Ingrese el valor de la variable R:");
                        R = Leer.nextDouble();
                        if (I>0 && R>0) {
                            V = I*R;
                            System.out.println("El valor de la diferencia de potencial o voltaje es de: "+V+"V (Voltios)");
                        }else{
                            System.out.println("Valores invalidos, deben ser mayores que 0");
                        }
                        break;
                    case "R":
                    case "r":
                        System.out.println("Ingrese el valor de la variable V:");
                        V = Leer.nextDouble();
                        System.out.println("Ingrese el valor de la variable I:");
                        I = Leer.nextDouble();
                        if (V>0 && I>0) {
                            R = V/I;
                            System.out.println("El valor de la resistencia es de: "+R+"Ω (Ohmios)");
                        }else{
                            System.out.println("Valores invalidos, deben ser mayores que 0");
                        }
                        break;
                    default:
                        System.out.println("Opción Invalida");
                }
                break;
            default:
                System.out.println("Opción invaida");
        }
    }
}