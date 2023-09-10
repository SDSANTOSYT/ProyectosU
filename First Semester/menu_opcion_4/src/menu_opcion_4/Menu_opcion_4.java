
package menu_opcion_4;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Menu_opcion_4 {

    
    public static void main(String[] args) {
        //variables de la opción 4
        int tipo_pez;
        double libras, total_com, total_pag, desc;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Pescaderia");
        System.out.println("Seleccione el tipo de pescado que va a comprar escribiendo el numero correspondiente:");
        System.out.println("1. Pargo");
        System.out.println("2. Lebranche");
        System.out.println("3. Sierra");
        
        tipo_pez = Leer.nextInt();
        
        if (tipo_pez == 1) {
            System.out.println("Escriba la cantidad de libras requeridas de pargo: ");
            libras = Leer.nextDouble();
            if (libras >= 0) {
                total_com = libras*9900;
                desc = 0;
                if (libras > 10) {
                    desc = total_com*0.15;
                }
                total_pag = total_com - desc;
                System.out.println("El total de la compra es: $" + total_com);
                System.out.println("El valor del descuento es: $" + desc);
                System.out.println("El valor total a pagar es: $" + total_pag);
            }else{
                System.out.println("El numero de libras no es valido");
            }
        }else{
            if (tipo_pez == 2) {
                System.out.println("Escriba la cantidad de libras requeridas de lebranche: ");
                libras = Leer.nextDouble();
                if (libras >= 0) {
                    total_com = libras*7500;
                    desc = 0;
                    if (libras > 10) {
                        desc = total_com*0.25;
                    }
                    total_pag = total_com - desc;
                    System.out.println("El total de la compra es: $" + total_com);
                    System.out.println("El valor del descuento es: $" + desc);
                    System.out.println("El valor total a pagar es: $" + total_pag);
                }else{
                    System.out.println("El numero de libras no es valido");
                }
            }else{
                if (tipo_pez == 3) {
                    System.out.println("Escriba la cantidad de libras requeridas de sierra: ");
                libras = Leer.nextDouble();
                if (libras >= 0) {
                    total_com = libras*12500;
                    desc = 0;
                    if (libras > 10) {
                        desc = total_com*0.1;
                    }
                    total_pag = total_com - desc;
                    System.out.println("El total de la compra es: $" + total_com);
                    System.out.println("El valor del descuento es: $" + desc);
                    System.out.println("El valor total a pagar es: $" + total_pag);
                    }else{
                        System.out.println("El numero de libras no es valido");
                    }
                }else{
                    System.out.println("Opción invalida, reinicie el programa y escoga un tipo de pez del menú");
                }
            }
        }
    }   
}
