
package fiesta_edades_sexo;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Fiesta_edades_sexo {

    
    public static void main(String[] args) {
        int edad, sexo, contpers=0, conth=0, contm=0, edadh=0, edadm=0, edmn=0, numhr=0, nummr=0, op=1;
        double promedh, promedm;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Este programa es para dar información de las personas que asistieron a una fiesta");
        while (op==1){
            contpers = contpers+1;
            System.out.println("Ingrese la edad de la persona: ");
            edad = Leer.nextInt();
            while (edad<1){
                System.out.println("Edad invalida");
                System.out.println("Ingrese la edad de la persona");
                edad = Leer.nextInt();
            }
            System.out.println("Ingrese el sexo de la persona:");
            System.out.println("1. hombre");
            System.out.println("2. mujer");
            sexo = Leer.nextInt();
            while (sexo<1 || sexo>2){
                System.out.println("opción invalida");
                System.out.println("Ingrese el sexo de la persona:");
                System.out.println("1. hombre");
                System.out.println("2. mujer");
            }
            if (contpers==1) {
                edmn = edad;
            }
            if (edad<edmn) {
                edmn = edad;
            }
            switch (sexo){
                case 1:
                    conth = conth+1;
                    edadh = edadh+edad;
                    if (edad<18) {
                        numhr = numhr+1;
                    }
                    break;
                case 2:
                    contm = contm+1;
                    edadm = edadm+edad;
                    if (edad<18) {
                        nummr = nummr+1;
                    }
                    break;
                default:
                    System.out.println("Opción invalida");
            }
            System.out.println("Ingrese 1. si llegó otra persona a la fiesta, en caso contrario ingrese cualquier otro numero");
            op = Leer.nextInt();
        }
        promedh = edadh/conth;
        promedm = edadm/contm;
        System.out.println("Personas que asistiero: "+contpers);
        System.out.println("Hombres: "+conth);
        System.out.println("Mujeres: "+contm);
        System.out.println("Promedio de edades de hombres: "+promedh);
        System.out.println("Promedio de edades de mujeres: "+promedm);
        System.out.println("Edad de la persona mas joven que asistió: "+edmn);
        System.out.println("Hombres rechazados: "+numhr);
        System.out.println("Mujeres rechazadas: "+nummr);
    }    
}