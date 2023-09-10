
package fecha_carlos.morales_sebastian.santos;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Fecha_carlosMorales_sebastianSantos {

    
    public static void main(String[] args) {
        int ds, d, m, a, dL, aL, sig;
        String mL,dsL; /**fecha;
        String[] partes;**/
        boolean bis;
        Scanner Leer = new Scanner(System.in);
     
        System.out.println("Ingrese la fecha de la que desea saber el dia siguiente.");
        System.out.println("Ingrese la notación numerica del dia de la semana (1-7): ");
        ds = Leer.nextInt();
        System.out.println("Ingrese el dia del mes: ");
        d = Leer.nextInt();
        System.out.println("Ingrese la notación numerica del mes (1-12): ");
        m = Leer.nextInt();
        System.out.println("Ingrese los dos ultimos digitlos del año: ");
        a = Leer.nextInt();
        System.out.println("Ingrese la notación numerica del siglo");
        sig = Leer.nextInt();
        System.out.println("La fecha ingresada es: "+ds+"/"+d+"/"+m+"/"+((sig-1)*100+a));
        if (sig>=1){
            aL = (sig-1)*100 + a;
            
            if (sig==1){
                if (aL%4==0) {
                    bis = true;
                }else{
                    bis = false;
                }
            }else{            
                if (aL%4==0) {
                    if (aL%100==0) {
                        if (aL%400==0) {
                            bis = true;
                        }else{
                            bis = false;
                        }
                    }else{
                        bis = true;
                    }
                }else{
                    bis = false;
                }
            }
            switch (m){
                case 1:
                    mL = "enero";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "febrero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                        
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 2:
                    mL = "febrero";
                    if (bis) {
                        if (d>0 && d<=29) {
                            switch (ds) {
                                case 1:
                                    dsL = "martes";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 2:
                                    dsL = "miercoles";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 3:
                                    dsL = "jueves";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 4:
                                    dsL = "viernes";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 5:
                                    dsL = "sabado";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 6:
                                    dsL = "domingo";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 7:
                                    dsL = "lunes";
                                    if (d==29) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                default:
                                    System.out.println("DIA DE LA SEMANA INVALIDO");
                            }
                        }else{
                            System.out.println("DIA INVALIDO");
                        }
                    }else{
                        if (d>0 && d<=28) {
                            switch (ds) {
                                case 1:
                                    dsL = "martes";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 2:
                                    dsL = "miercoles";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 3:
                                    dsL = "jueves";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 4:
                                    dsL = "viernes";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 5:
                                    dsL = "sabado";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 6:
                                    dsL = "domingo";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                case 7:
                                    dsL = "lunes";
                                    if (d==28) {
                                        dL = 1;
                                        mL = "marzo";
                                    }else{
                                        dL = d+1;
                                    }
                                    System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                    break;
                                default:
                                    System.out.println("DIA DE LA SEMANA INVALIDO");
                            }
                        }else{
                            System.out.println("DIA INVALIDO");
                        }
                    }
                    break;
                case 3:
                    mL = "marzo";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "abril";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 4:
                    mL = "abril";
                    if (d>0 && d<=30) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "mayo";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 5:
                    mL = "mayo";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "junio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }
                    System.out.println("DIA INVALIDO");
                    break;
                case 6:
                    mL = "junio";
                    if (d>0 && d<=30) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "julio";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 7:
                    mL = "julio";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "agosto";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 8:
                    mL = "agosto";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "septiembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 9:
                    mL = "septiembre";
                    if (d>0 && d<=30) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "octubre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 10:
                    mL = "octubre";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "noviembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 11:
                    mL = "noviembre";
                    if (d>0 && d<=30) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==30) {
                                    dL = 1;
                                    mL = "diciembre";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                case 12:
                    mL = "diciembre";
                    if (d>0 && d<=31) {
                        switch (ds) {
                            case 1:
                                dsL = "martes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 2:
                                dsL = "miercoles";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 3:
                                dsL = "jueves";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 4:
                                dsL = "viernes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 5:
                                dsL = "sabado";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 6:
                                dsL = "domingo";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            case 7:
                                dsL = "lunes";
                                if (d==31) {
                                    dL = 1;
                                    mL = "enero";
                                }else{
                                    dL = d+1;
                                }
                                System.out.println("La fecha del dia siguiente es: "+dsL+" "+dL+" de " +mL+" de " +aL);
                                break;
                            default:
                                System.out.println("DIA DE LA SEMANA INVALIDO");
                        }
                    }else{
                        System.out.println("DIA INVALIDO");
                    }
                    break;
                default:
                    System.out.println("MES INVALIDO");
            }
        }else{
            System.out.println("SIGLO INVALIDO (los siglos empiezan en el 1)");
        }    
    }
    
}
