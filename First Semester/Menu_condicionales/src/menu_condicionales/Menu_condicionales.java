
package menu_condicionales;
import java.util.Scanner;

public class Menu_condicionales {

    public static void main(String[] args) {
        int op;
        
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("______  _____  _____  _   _  _   _  _____  _   _  _____ ______           _____ \n" +
"| ___ \\|_   _||  ___|| \\ | || | | ||  ___|| \\ | ||_   _||  _  \\   ____  /  ___|\n" +
"| |_/ /  | |  | |__  |  \\| || | | || |__  |  \\| |  | |  | | | |  / __ \\ \\ `--. \n" +
"| ___ \\  | |  |  __| | . ` || | | ||  __| | . ` |  | |  | | | | / / _` | `--. \\\n" +
"| |_/ / _| |_ | |___ | |\\  |\\ \\_/ /| |___ | |\\  | _| |_ | |/ / | | (_| |/\\__/ /\n" +
"\\____/  \\___/ \\____/ \\_| \\_/ \\___/ \\____/ \\_| \\_/ \\___/ |___/   \\ \\__,_|\\____/ \n" +
"                                                                 \\____/        ");
        System.out.println("➤-------------Este es el menú de opciones-------------➤");
        System.out.println("Escribe el numero correspondiente a la opcion que desees usar:  \n 1. Coordenadas \n 2. Notas estudiante \n 3. Fruteria \n 4. pescaderia \n 5. Salir \n -----------------------");
        op = Leer.nextInt();
        //VARIABLES DE OP1
        float num1, num2;
        //VARIABLES DE OP2
        float n1, n2, n3, n4, nm, prom;
        //VARIABLES DE OP3
        double kilos, desc, total;
        //VARIABLES DE OP4
        int tipo_pez;
        double libras, total_com, total_pag;
            
        if (op == 1) {
            System.out.println("   ___    ___     ___    ___   ___    ___   _  _     _     ___      _     ___ \n" +
"  / __|  / _ \\   / _ \\  | _ \\ |   \\  | __| | \\| |   /_\\   |   \\    /_\\   / __|\n" +
" | (__  | (_) | | (_) | |   / | |) | | _|  | .` |  / _ \\  | |) |  / _ \\  \\__ \\\n" +
"  \\___|  \\___/   \\___/  |_|_\\ |___/  |___| |_|\\_| /_/ \\_\\ |___/  /_/ \\_\\ |___/\n" +
"                                                                              ");
            System.out.println("\n");
            System.out.println("➤-------------Bienvenid@ a la opción coordenadas-------------➤\n" +
                                "Aqui podrá averiguar en que cuadrante del plano cartesiano se encuentra un punto en\n" +
                                "ciertas coordenadas, en el siguiente dibujo puede ver cuales son los cuadrantes.");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("\n");
            System.out.println("                        Y                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"          ___   ___     |        ___            \n" +
"         |_ _| |_ _|    |       |_ _|           \n" +
"          | |   | |     |        | |            \n" +
"          | |   | |     |        | |            \n" +
"         |___| |___|    |       |___|           \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"------------------------+----------------------X\n" +
"                        |                       \n" +
"                        |                       \n" +
"     ___   ___   ___    |       ___  __     __  \n" +
"    |_ _| |_ _| |_ _|   |      |_ _| \\ \\   / /  \n" +
"     | |   | |   | |    |       | |   \\ \\ / /   \n" +
"     | |   | |   | |    |       | |    \\ V /    \n" +
"    |___| |___| |___|   |      |___|    \\_/     \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       ");
            System.out.println("\n");
            System.out.println("------------------------------------------------");
            System.out.println("Introduzca el valor en X de sus coordenadas: ");
            num1 = Leer.nextFloat();
            System.out.println("------------------------------------------------");
            System.out.println("Introduzca el valor en Y de sus coordenadas: ");
            num2 = Leer.nextFloat();
            System.out.println("------------------------------------------------");
            System.out.println("\n");
            if ((num1 > 0)&&(num2 > 0)) {
                System.out.println("El punto se encuentra en el Cuadrante I.");
                System.out.println("                        Y                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |        ___            \n" +
"                        |       |_ _|           \n" +
"                        |        | |            \n" +
"                        |        | |            \n" +
"                        |       |___|           \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"------------------------+----------------------X\n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                        ");
            }else if((num1 < 0)&&(num2 > 0)){
                System.out.println("El punto se encuentra en el Cuadrante II.");
                System.out.println("                        Y                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"          ___   ___     |                       \n" +
"         |_ _| |_ _|    |                       \n" +
"          | |   | |     |                       \n" +
"          | |   | |     |                       \n" +
"         |___| |___|    |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"------------------------+----------------------X\n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                        ");
            }else if((num1 < 0)&&(num2 < 0)){
                System.out.println("El punto se encuentra en el Cuadrante III.");
                System.out.println("                        Y                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"------------------------+----------------------X\n" +
"                        |                       \n" +
"                        |                       \n" +
"     ___   ___   ___    |                       \n" +
"    |_ _| |_ _| |_ _|   |                       \n" +
"     | |   | |   | |    |                       \n" +
"     | |   | |   | |    |                       \n" +
"    |___| |___| |___|   |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                        ");
            }else if((num1 > 0)&&(num2 < 0)){
                System.out.println("El punto se encuentra en el Cuadrante IV.");
                System.out.println("                        Y                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                       \n" +
"------------------------+----------------------X\n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |       ___  __     __  \n" +
"                        |      |_ _| \\ \\   / /  \n" +
"                        |       | |   \\ \\ / /   \n" +
"                        |       | |    \\ V /    \n" +
"                        |      |___|    \\_/     \n" +
"                        |                       \n" +
"                        |                       \n" +
"                        |                        ");
            }else if((num1 == 0)&&(num2 == 0)){
                System.out.println("El punto se encuentra en el Origen.");
            }else if ((num1 == 0)&&(num2 != 0)){
                System.out.println("El punto se encuentra sobre el eje Y");
            }else{
                System.out.println("El punto se encuentra sobre el eje X");
            }
        }else if (op ==2){
            System.out.println("  ___   ___    ___    __  __   ___   ___    ___    ___      ___    ___     _  _    ___    _____     _     ___ \n" +
" | _ \\ | _ \\  / _ \\  |  \\/  | | __| |   \\  |_ _|  / _ \\    |   \\  | __|   | \\| |  / _ \\  |_   _|   /_\\   / __|\n" +
" |  _/ |   / | (_) | | |\\/| | | _|  | |) |  | |  | (_) |   | |) | | _|    | .` | | (_) |   | |    / _ \\  \\__ \\\n" +
" |_|   |_|_\\  \\___/  |_|  |_| |___| |___/  |___|  \\___/    |___/  |___|   |_|\\_|  \\___/    |_|   /_/ \\_\\ |___/\n" +
"                                                                                                              ");
            System.out.println("\n");
            System.out.println("☆-------------Bienvenid@ a la opción promedio de notas-------------☆");
            System.out.println("Aquí podrá obtener el promedio de sus 4 notas pero solo teniendo en cuenta las 3 mas altas");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("\n");
            System.out.println("Ingresa la nota 1 (0-5): ");
            n1 = Leer.nextFloat();
            if ((n1 >= 0)&&(n1 <=5)){
                System.out.println("Ingresa la nota 2 (0-5): ");
                n2 = Leer.nextFloat();
                if ((n2 >= 0)&&(n2 <=5)&&(n2 != n1)){
                    System.out.println("Ingresa la nota 3 (0-5): ");
                    n3 = Leer.nextFloat();
                    if ((n3 >= 0)&&(n3 <=5)&&(n3 != n1)&&(n3 != n2)){
                        System.out.println("Ingresa la nota 4 (0-5): ");
                        n4 = Leer.nextFloat();
                        if ((n4 >= 0)&&(n4 <=5)&&(n4 != n1)&&(n4 != n2)&&(n4 != n3)){               
                            if (n1<n2 && n1<n3 && n1<n4 ) {
                                System.out.println("------------------------\n" +
                                                   "|    Calificaciones    |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n4+"          |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n2+"          |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n3+"          |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n1+" ✘        |\n" +
                                                   "------------------------ ");
                                prom = (n4+n2+n3)/3;
                                System.out.println("el promedio es "+ prom);
                            }
                            else if (n2<n1 && n2<n3 && n2<n4 ) {
                                System.out.println("------------------------\n" +
                                                   "|    Calificaciones    |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n1+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n4+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n3+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n2+" ✘      |\n" +
                                                   "------------------------ ");
                                prom = (n1+n4+n3)/3;
                                System.out.println("el promedio es "+ prom);
                            }
                            else if (n3<n2 && n3<n1 && n3<n4 ) {
                                System.out.println("------------------------\n" +
                                                   "|    Calificaciones    |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n1+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n2+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n4+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n3+" ✘      |\n" +
                                                   "------------------------ ");
                                prom = (n1+n2+n4)/3;
                                System.out.println("el promedio es "+ prom);
                            }
                            else if (n4<n2 && n4<n3 && n4<n1 ) {
                                System.out.println("------------------------\n" +
                                                   "|    Calificaciones    |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n1+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n2+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n3+"        |\n" +
                                                   "------------------------\n" +
                                                   "|        "+n4+" ✘      |\n" +
                                                   "------------------------ ");
                                prom = (n1+n2+n3)/3;
                                System.out.println("el promedio es "+ prom);
                            }
                        }else{
                            System.out.println("La nota 4 es invalida \n (No se encuentra en el rango o es igual a una nota anterior)");
                        }  
                    }else{
                        System.out.println("La nota 3 es invalida \n (No se encuentra en el rango o es igual a una nota anterior)");
                    }
                }else{
                    System.out.println("La nota 2 es invalida \n (No se encuentra en el rango o es igual a una nota anterior)");
                }
            }else{
                System.out.println("La nota 1 no se encuentra dentro del rango");
            }
        }else if (op == 3){
            System.out.println("  ___   ___   _   _   _____   ___   ___   ___     _   \n" +
" | __| | _ \\ | | | | |_   _| | __| | _ \\ |_ _|   /_\\  \n" +
" | _|  |   / | |_| |   | |   | _|  |   /  | |   / _ \\ \n" +
" |_|   |_|_\\  \\___/    |_|   |___| |_|_\\ |___| /_/ \\_\\\n" +
"                                                      ");
            System.out.println("\n");
            System.out.println("♋︎-------------Bienvenid@ a la opción fruteria-------------♋︎");
            System.out.println("Aquí podrá saber el precio a pagar segun los kilos de manzanas y cuanto descuento aplica");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("El precio del Kg de manzana es: 10.000 pesos.");
            System.out.println("Cuantos Kg de manzana va a llevar: ");
            kilos = Leer.nextDouble();
            if (kilos >= 0) {
                if(kilos <= 2){
                    desc = 0;
                    total = kilos * 10000 - desc;
                    System.out.println("Subtotal: $" + kilos * 10000 + "\ndescuento: $" + desc+"\nTotal: $" + total);
                } else if(kilos > 2 && kilos <= 5){
                    desc = kilos * 10000 * 0.1;
                    total = kilos * 10000 - desc;
                    System.out.println("Subtotal: $" + kilos * 10000 + "\ndescuento: $" + desc+"\nTotal: $" + total);
                } else if(kilos > 5 && kilos <= 10){
                    desc = kilos * 10000 * 0.15;
                    total = kilos * 10000 - desc;
                    System.out.println("Subtotal: $" + kilos * 10000 + "\ndescuento: $" + desc+"\nTotal: $" + total);
                } else if(kilos > 10){
                    desc = kilos * 10000 * 0.2;
                    total = kilos * 10000 - desc;
                    System.out.println("Subtotal: $" + kilos * 10000 + "\ndescuento: $" + desc + "\nTotal: $" + total);
                }
            }else{
                System.out.println("VALOR INVALIDO");
            }
        }else if (op == 4){
            System.out.println("  ___   ___   ___    ___     _     ___    ___   ___   ___     _   \n" +
" | _ \\ | __| / __|  / __|   /_\\   |   \\  | __| | _ \\ |_ _|   /_\\  \n" +
" |  _/ | _|  \\__ \\ | (__   / _ \\  | |) | | _|  |   /  | |   / _ \\ \n" +
" |_|   |___| |___/  \\___| /_/ \\_\\ |___/  |___| |_|_\\ |___| /_/ \\_\\\n" +
"                                                                  ");
            System.out.println("\n");
            System.out.println("✧︎-------------Bienvenid@ a la opción pescaderia-------------✧︎");
            System.out.println("Aquí podrá escoger un tipo de pez y la cantidad que desea llevar para luego conocer su precio junto con su descuento");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            
            System.out.println("Escriba el numero del tipo de pescado que desee llevar: \n 1. Pargo \n 2. Lebranche \n 3. Sierra");
            
            tipo_pez = Leer.nextInt();

            if (tipo_pez == 1) {
                System.out.println("Cuantas libras va a llevar: ");
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
                    System.out.println("Cuantas libras va a llevar: ");
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
                        System.out.println("Cuantas libras va a llevar: ");
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
                        System.out.println("OPCION INVALIDA, REINICIE EL PROGRAMA");
                    }
                }
            }
        }else if (op == 5){
            System.out.println("-------------------------------------------------");
            System.out.println("Muchas gracias por utilizar nuestros servicios \nEsperamos su regreso");
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("---------------------------------------");
            System.out.println("OPCION INVALIDA, REINICIE EL PROGRAMA");
            System.out.println("---------------------------------------");
        }
    }
    
}
