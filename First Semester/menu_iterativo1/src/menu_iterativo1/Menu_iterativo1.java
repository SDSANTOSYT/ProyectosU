
package menu_iterativo1;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Menu_iterativo1 {

    
    public static void main(String[] args) {
        int op=0, ndig, n1, n2, prod, c, n, cod, cdmy, cdmn, c1 ;
        long num;
        double nota, nmy, nmn;
        Scanner Leer = new Scanner(System.in);
        // hacemos que el menú sea iterativo
        while (op<4){
            System.out.println("--------------------Bienvenido al menú iterativo--------------------");
            System.out.println("Escoga una de las siguientes opciones digitando el numero que corresponda");
            System.out.println("1. Cantidad de digitos de un numero");
            System.out.println("2. Multiplicación de dos numeros enteros");
            System.out.println("3. Calculo del estudiante con la mayor y menor nota del salon");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------------------------------------");
            op = Leer.nextInt();
            
            while (op<1 || op>4){
                System.out.println("--------------------OPCIÓN INVALIDA--------------------");
                System.out.println("Escoga una opciones digitando el numero que corresponda");
                System.out.println("1. Cantidad de digitos de un numero");
                System.out.println("2. Multiplicación de dos numeros enteros");
                System.out.println("3. Calculo del estudiante con la mayor y menor nota del salon");
                System.out.println("4. Salir");
                System.out.println("--------------------------------------------------------------------");
                op = Leer.nextInt();
            }
            
            switch (op){
                case 1:
                    System.out.println("--------------------Bienvenido a la opción 1: Cantidad de digitos de un numero--------------------");
                    System.out.println("Ingrese cualquier numero entero para saber su cantidad de digitos: ");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    num = Leer.nextLong();
                    ndig = 0;
                    if (num==0) {
                        ndig = 1;
                    }
                    while (num!=0){
                        num = num/10;
                        ndig = ndig+1;
                    }
                    System.out.println("El numero de digitos del numero que ingresaste es: "+ndig+"\n");
                    break;
                case 2:
                    System.out.println("--------------------Bienvenido a la opción 2: Multiplicación de numeros enteros--------------------");
                    System.out.println("Ingrese dos numeros que desee multiplicar (tienen que ser enteros positivos) ");
                    System.out.println("Primer numero: ");
                    n1 = Leer.nextInt();
                    System.out.println("Segundo numero: ");
                    n2 = Leer.nextInt();
                    while (n1<=0 || n2<=0){
                        System.out.println("--------------------NUMERO INVALIDO--------------------");
                        System.out.println("Alguno de los numeros que deseas multiplicar no son enteros positivos");
                        System.out.println("Ingrese dos numeros que desee multiplicar (tienen que ser enteros positivos) ");
                        System.out.println("Primer numero: ");
                        n1 = Leer.nextInt();
                        System.out.println("Segundo numero: ");
                        n2 = Leer.nextInt();
                    }
                    c = 1;
                    prod = 0;
                    while (c<=n1){
                        prod = prod+n2;
                        c = c+1;
                    }
                    System.out.println("El resultado de su multiplicación es: "+prod+ "\n");
                    break;
                case 3:
                    System.out.println("--------------------Bienvenido a la opción 3: Mayor nota y menor nota del salón--------------------");
                    System.out.println("Primero ingrese el numero de alumnos en el salón:");
                    n = Leer.nextInt();
                    while (n<=0) {
                        System.out.println("--------------------CANTIDAD DE ALUMNOS INVALIDA--------------------");
                        System.out.println("Ingrese el numero de alumnos en el salón: ");
                        n = Leer.nextInt();
                    }
                    c1 = 1;
                    nmy = 0;
                    nmn = 0;
                    cdmy = 0;
                    cdmn = 0;
                    while (c1<=n){
                        System.out.println("Escriba el codigo numerico del alumno: ");
                        cod = Leer.nextInt();
                        while (cod<0){
                          System.out.println("--------------------CODIGO DE ALUMNO INVALIDO--------------------");
                            System.out.println("Los codigos de los alumnos no pueden ser numeros negativos");
                            System.out.println("Escriba el codigo numerico del alumno: ");
                            cod = Leer.nextInt();
                        }
                        System.out.println("Ingrese la nota del alumno: ");
                        nota = Leer.nextDouble();
                        while (nota<0 || nota>5){
                            System.out.println("--------------------NOTA INVALIDA--------------------");
                            System.out.println("Las notas de los alumnos van de 0-5");
                            System.out.println("Ingrese la nota del alumno: ");
                            nota = Leer.nextInt();
                        }
                        if (c1==1) {
                            nmy = nota;
                            nmn = nota;
                            cdmy = cod;
                            cdmn = cod;
                        } else{
                            if (nota>nmy) {
                                nmy = nota;
                                cdmy = cod;
                            }
                            if (nota<nmn) {
                                nmn = nota;
                                cdmn = cod;
                            }
                        }
                        c1 = c1+1;
                    }
                    System.out.println("El alumno con la nota mayor fue: #"+cdmy+ " con una nota de: "+nmy);
                    System.out.println("El alumno con la nota menor fue: #"+cdmn+ " con una nota de: "+nmn+ "\n");
                    break;
                case 4:
                    System.out.println("\nMUCHAS GRACIAS POR USAR EL PROGRAMA");
                    System.out.println("HASTA LA PROXIMA :D");
            }
        }
    }   
}
