package fechas_carlos.morales_sebastian.santos;

import java.util.Scanner;

public class Fechas_CarlosMorales_SebastianSantos {

    public static void main(String[] args) {
        int ds, d, a, m, dL, aL, sig;
        String mL, dsL, acdc;
        boolean bisi;

        Scanner Leer = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("BIENVENID@ A LA CALCULADORA DEL DIA SIGUIENTE \n"
                + "ESCRIBE UNA FECHA EN FORMATO DD/MM/AA Y RECIBIRAS LA FECHA DEL DIA SIGUIENTE EN FORMATO DS, DD de MES del AAAA \n\n\n"
                + "Escribe en que siglo quieres hacer el calculo (numeros enteros): ");
        System.out.println("----------------------------------------------------");

        //lee el siglo
        sig = Leer.nextInt();
        if (sig <= 0) {
            System.out.println("---------------------------------");
            System.out.println("DATO INVALIDO, SIGLO INEXISTENTE");
            System.out.println("---------------------------------");
        } else {
            //Lee el año
            System.out.println("------------------------------------------------");
            System.out.println("Ingresa el año (formato AA, solo dos numeros): ");
            System.out.println("------------------------------------------------");
            a = Leer.nextInt();
            if ((a < 0) || (a > 99)) {
                System.out.println("---------------------------------");
                System.out.println("DATO INVALIDO, SOLO DOS NUMEROS");
                System.out.println("---------------------------------");
            } else {
                //año largo
                aL = (sig * 100 - 100) + a;

                if (aL % 4 == 0) {
                    if (aL % 100 == 0){
                        if (aL % 400 == 0) {
                            bisi = true;
                        }else{
                            bisi = false;
                        }
                    }else{
                        bisi = true;
                    }
                }else{
                    bisi = false;
                }
                
                //ingresa el mes
                System.out.println("------------------------------------------------");
                System.out.println("Ingresa el mes (formato MM, solo dos numeros): ");
                System.out.println("------------------------------------------------");
                m = Leer.nextInt();
                switch (m) {
                    //si es enero
                    case 1:
                        mL = "enero";

                        //ingresa el dia de la semana
                        System.out.println("------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "febrero";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 2:
                        mL = "febrero";

                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if (bisi) {
                                if ((d < 1) || (d > 29)) {
                                    System.out.println("-------------------------------------------");
                                    System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                    System.out.println("-------------------------------------------");
                                } else {
                                    if (ds == 7) {
                                        ds = 1;
                                    } else {
                                        ds = ds + 1;
                                    }
                                    switch (ds) {
                                        case 1:
                                            dsL = "Lunes";
                                            break;
                                        case 2:
                                            dsL = "Martes";
                                            break;
                                        case 3:
                                            dsL = "Miercoles";
                                            break;
                                        case 4:
                                            dsL = "Jueves";
                                            break;
                                        case 5:
                                            dsL = "Viernes";
                                            break;
                                        case 6:
                                            dsL = "Sabado";
                                            break;
                                        case 7:
                                            dsL = "Domingo";
                                            break;
                                        default:
                                            dsL = "ERROR";
                                    }
                                    if (d == 29) {
                                        dL = 1;
                                        mL = "febrero";
                                    } else {
                                        dL = d + 1;
                                    }
                                    System.out.println("-------------------------------------------");
                                    System.out.println("La fecha del dia siguiente es: \n"
                                            + dsL + "," + dL + " de " + mL + " de " + aL);
                                    System.out.println("-------------------------------------------");
                                }
                            } else {
                                if ((d < 1) || (d > 28)) {
                                    System.out.println("-------------------------------------------");
                                    System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                    System.out.println("-------------------------------------------");
                                } else {
                                    if (ds == 7) {
                                        ds = 1;
                                    } else {
                                        ds = ds + 1;
                                    }
                                    switch (ds) {
                                        case 1:
                                            dsL = "Lunes";
                                            break;
                                        case 2:
                                            dsL = "Martes";
                                            break;
                                        case 3:
                                            dsL = "Miercoles";
                                            break;
                                        case 4:
                                            dsL = "Jueves";
                                            break;
                                        case 5:
                                            dsL = "Viernes";
                                            break;
                                        case 6:
                                            dsL = "Sabado";
                                            break;
                                        case 7:
                                            dsL = "Domingo";
                                            break;
                                        default:
                                            dsL = "ERROR";
                                    }
                                    if (d == 28) {
                                        dL = 1;
                                        mL = "febrero";
                                    } else {
                                        dL = d + 1;
                                    }
                                    System.out.println("-------------------------------------------");
                                    System.out.println("La fecha del dia siguiente es: \n"
                                            + dsL + "," + dL + " de " + mL + " de " + aL);
                                    System.out.println("-------------------------------------------");
                                }
                            }
                        }
                        break;
                    case 3:
                        mL = "marzo";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "abril";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 4:
                        mL = "abril";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 30)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 30) {
                                    dL = 1;
                                    mL = "mayo";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 5:
                        mL = "mayo";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "junio";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 6:
                        mL = "junio";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 30)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 30) {
                                    dL = 1;
                                    mL = "julio";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 7:
                        mL = "julio";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "agosto";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 8:
                        mL = "agosto";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "septiembre";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 9:
                        mL = "septiembre";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 30)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 30) {
                                    dL = 1;
                                    mL = "octubre";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 10:
                        mL = "octubre";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "noviembre";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 11:
                        mL = "noviembre";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 30)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 30) {
                                    dL = 1;
                                    mL = "diciembre";
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    case 12:
                        mL = "diciembre";

                        //ingresa el dia de la semana
                        System.out.println("-------------------------------------------");
                        System.out.println("Ingresa el día de la semana\n"
                                + "1.Lun\n2.Mar\n3.Mie\n4.Jue\n5.Vie\n6.Sab\n7.Dom");
                        System.out.println("-------------------------------------------");
                        ds = Leer.nextInt();
                        if ((ds < 1) || (ds > 7)) {
                            System.out.println("-------------------------------------------");
                            System.out.println("DATO INVALIDO, DIA DE LA SEMANA NO EXISTE");
                            System.out.println("-------------------------------------------");
                        } else {
                            //ingresa el dia
                            System.out.println("-------------------------------------------");
                            System.out.println("Ingresa el Dia (formato DD, solo dos numeros): ");
                            System.out.println("-------------------------------------------");
                            d = Leer.nextInt();
                            if ((d < 1) || (d > 31)) {
                                System.out.println("-------------------------------------------");
                                System.out.println("DATO INVALIDO, DIA DEL MES NO EXISTE");
                                System.out.println("-------------------------------------------");
                            } else {
                                
                                if (ds == 7) {
                                    ds = 1;
                                } else {
                                    ds = ds + 1;
                                }
                                switch (ds) {
                                    case 1:
                                        dsL = "Lunes";
                                        break;
                                    case 2:
                                        dsL = "Martes";
                                        break;
                                    case 3:
                                        dsL = "Miercoles";
                                        break;
                                    case 4:
                                        dsL = "Jueves";
                                        break;
                                    case 5:
                                        dsL = "Viernes";
                                        break;
                                    case 6:
                                        dsL = "Sabado";
                                        break;
                                    case 7:
                                        dsL = "Domingo";
                                        break;
                                    default:
                                        dsL = "ERROR";
                                }
                                if (d == 31) {
                                    dL = 1;
                                    mL = "enero";
                                    aL = aL + 1;
                                } else {
                                    dL = d + 1;
                                }
                                System.out.println("-------------------------------------------");
                                System.out.println("La fecha del dia siguiente es: \n"
                                        + dsL + "," + dL + " de " + mL + " de " + aL);
                                System.out.println("-------------------------------------------");
                            }
                        }
                        break;
                    default:
                        System.out.println("-------------------------------------------");
                        System.out.println("DATO INVALIDO, MES NO EXISTE");
                        System.out.println("-------------------------------------------");
                }
            }
        }
    }
}
