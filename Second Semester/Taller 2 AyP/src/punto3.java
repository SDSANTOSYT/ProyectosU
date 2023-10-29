import java.math.BigDecimal;
import java.util.Scanner;

public class punto3 {
    /*
     * Author: @Sdsantos
     */

    public static int contarPuntos(String num) { // Funcion para contar los puntos en el numero
        String caracter;
        int contadorPuntos = 0;
        int dimensionCadena = num.length();
        int i = 0;
        while (i < dimensionCadena && contadorPuntos <= 1) {
            caracter = num.substring(i, i + 1);
            if (caracter.equals(".")) {
                contadorPuntos++;
            }
            i++;
        }
        return contadorPuntos;
    }

    public static void dividirDecimal(String num, String[] partes) {
        String caracter;
        int dimensionCadena = num.length();
        boolean sw = false;
        int i = 0;
        while (i < dimensionCadena & !sw) {
            caracter = num.substring(i, i + 1);
            if (caracter.equals(".")) {
                partes[0] = num.substring(0, i);
                partes[1] = num.substring(i + 1, dimensionCadena);
                sw = true;
            }
            i++;
        }
    }

    public static boolean validarSigno(String num) {
        String caracter = num.substring(0, 1);
        boolean swPositivo = true;
        if (caracter.equals("-")) {
            swPositivo = false;
        }
        return swPositivo;
    }

    public static boolean validarEntero(String num) {
        boolean swEntero;
        String caracter;
        int dimensionCadena = num.length(), i = 0;
        swEntero = true;
        while (i < dimensionCadena & swEntero) {
            caracter = num.substring(i, i + 1);
            if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3")
                    || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7")
                    || caracter.equals("8") || caracter.equals("9") || caracter.equals("A") || caracter.equals("B")
                    || caracter.equals("C") || caracter.equals("D") || caracter.equals("E") || caracter.equals("F")) {
                i++;
            } else {
                swEntero = false;
            }
        }
        return swEntero;
    }

    public static boolean validarBase(String num, int base) {
        char[] digitosBase = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char caracter;
        boolean swBase = true;
        int dimensionCadena = num.length(), i = 0;
        while (i < dimensionCadena & swBase) {
            caracter = num.charAt(i);
            if (caracter == '.' | caracter == '-') {
                i++;
            } else {
                if (Character.compare(caracter, digitosBase[base - 1]) > 0) {
                    swBase = false;
                }
                i++;
            }
        }
        return swBase;
    }

    public static boolean validarDecimal(String num) {
        boolean swDecimal;
        String[] partes = { "", "" };
        if (contarPuntos(num) == 1) {
            dividirDecimal(num, partes);
            if (validarEntero(partes[0]) & validarEntero(partes[1])) {
                swDecimal = true;
            } else {
                swDecimal = false;
            }
        } else {
            swDecimal = false;
        }
        return swDecimal;
    }

    public static boolean validarNumero(String num, int base) {
        boolean swNum = false;
        int dimensionCadena = num.length();
        if (!validarSigno(num)) {
            num = num.substring(1, dimensionCadena);
        }
        if (validarEntero(num)) {
            if (validarBase(num, base)) {
                swNum = true;
            }
        } else {
            if (validarDecimal(num)) {
                if (validarBase(num, base)) {
                    swNum = true;
                }
            }
        }
        return swNum;
    }

    public static void validarNumero2(String num, int baseIn, Scanner leer, int baseFin, int digitos) {
        while (!validarNumero(num, baseIn)) {
            System.out.println("!ERROR!");
            System.out.println("EL NUMERO INGRESADO ESTÁ MAL ESCRITO O NO PERTENECE A LA BASE INGRESADA");
            System.out.println("Ingrese el numero a convertir: ");
            num = leer.nextLine();
            System.out.println("Ingrese la base en la que se encuentra el numero: ");
            baseIn = leer.nextInt();
            System.out.println("Ingrese la base a convertir el numero: ");
            baseFin = leer.nextInt();
            System.out.println("Ingrese la cantidad de digitos decimales que quiere mostrar");
            digitos = leer.nextInt();
        }
    }

    public static int convertirBase10Entero(String num, int base) {
        int numBase10, tam = num.length();
        String v[] = new String[100];
        String caracter;
        for (int i = 0; i < tam; i++) {
            v[i] = num.substring(i, i + 1);
        }
        numBase10 = 0;
        for (int i = tam - 1; i >= 0; i--) {
            caracter = v[tam - i - 1];
            switch (caracter) {
                case "A":
                    numBase10 = (int) (10 * Math.pow(base, i)) + numBase10;
                    break;
                case "B":
                    numBase10 = (int) (11 * Math.pow(base, i)) + numBase10;
                    break;
                case "C":
                    numBase10 = (int) (12 * Math.pow(base, i)) + numBase10;
                    break;
                case "D":
                    numBase10 = (int) (13 * Math.pow(base, i)) + numBase10;
                    break;
                case "E":
                    numBase10 = (int) (14 * Math.pow(base, i)) + numBase10;
                    break;
                case "F":
                    numBase10 = (int) (15 * Math.pow(base, i)) + numBase10;
                    break;
                default:
                    numBase10 = (int) (Integer.parseInt(v[tam - i - 1]) * Math.pow(base, i) + numBase10);
                    break;
            }
        }
        return numBase10;
    }

    public static BigDecimal convertirBase10Decimal(String parteDecimal, int base) {

        int tam = parteDecimal.length();
        BigDecimal decimalBase10;
        String v[] = new String[100];
        String caracter;
        for (int i = 0; i < tam; i++) {
            v[i] = parteDecimal.substring(i, i + 1);
        }
        decimalBase10 = BigDecimal.valueOf(0);
        for (int i = 0; i < tam; i++) {
            caracter = v[i];
            switch (caracter) {
                case "A":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(10 * Math.pow(base, -1 * (i + 1))));
                    break;
                case "B":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(11 * Math.pow(base, -1 * (i + 1))));
                    break;
                case "C":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(12 * Math.pow(base, -1 * (i + 1))));
                    break;
                case "D":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(13 * Math.pow(base, -1 * (i + 1))));
                    break;
                case "E":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(14 * Math.pow(base, -1 * (i + 1))));
                    break;
                case "F":
                    decimalBase10 = decimalBase10.add(BigDecimal.valueOf(15 * Math.pow(base, -1 * (i + 1))));
                    break;
                default:
                    decimalBase10 = decimalBase10
                            .add(BigDecimal.valueOf(Double.valueOf(v[i]) * Math.pow(base, -1 * (i + 1))));
                    break;
            }
        }
        return decimalBase10;
    }

    public static String convertirBaseXDecimal(BigDecimal numBase10Decimal, int baseX, char[] vectorDigitos, int dig) {
        int v[] = new int[100];
        int i = 0;
        String numBaseXDecimal;
        while (i < dig & numBase10Decimal.compareTo(BigDecimal.valueOf(0)) != 0) {
            v[i] = numBase10Decimal.multiply(BigDecimal.valueOf(baseX)).intValue();
            numBase10Decimal = numBase10Decimal.multiply(BigDecimal.valueOf(baseX)).subtract(BigDecimal.valueOf(v[i]));
            i++;
        }
        numBaseXDecimal = "";
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                numBaseXDecimal = numBaseXDecimal + vectorDigitos[v[j]];
            }
        } else {
            numBaseXDecimal = "0";
        }
        return numBaseXDecimal;
    }

    public static String convertirBaseXEntero(int numBase10, int baseX, char[] vectorDigitos) {
        String numBaseX;
        int v[] = new int[100];
        int k = 0;
        while (numBase10 != 0) {
            v[k] = numBase10 % baseX;
            numBase10 = numBase10 / baseX;
            k++;
        }
        numBaseX = "";
        for (int i = k - 1; i >= 0; i--) {
            numBaseX = numBaseX + vectorDigitos[v[i]];
        }
        return numBaseX;
    }

    public static String convertirBase(String num, int baseInicial, int baseFinal, int dig) {
        String cad, numBaseFinal;
        String[] partes = { "", "" };
        int numBase10ParteEntera, numBase10;
        BigDecimal numBase10ParteDecimal;

        char[] digitosBase = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', };
        if (validarDecimal(num)) {
            dividirDecimal(num, partes);
            numBase10ParteEntera = convertirBase10Entero(partes[0], baseInicial);
            numBase10ParteDecimal = convertirBase10Decimal(partes[1], baseInicial);
            numBaseFinal = convertirBaseXEntero(numBase10ParteEntera, baseFinal, digitosBase) + "."
                    + convertirBaseXDecimal(numBase10ParteDecimal, baseFinal, digitosBase, dig);
            cad = numBaseFinal;
        } else {
            numBase10 = convertirBase10Entero(num, baseInicial);
            numBaseFinal = convertirBaseXEntero(numBase10, baseFinal, digitosBase);
            cad = numBaseFinal;
        }
        return cad;
    }

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String num, numFinal;
        int baseIn, baseFin, digitos, tam;
        System.out.println("Ingrese el numero a convertir: ");
        num = leer.nextLine();
        System.out.println("Ingrese la base en la que se encuentra el numero: ");
        baseIn = leer.nextInt();
        System.out.println("Ingrese la base a convertir el numero: ");
        baseFin = leer.nextInt();
        System.out.println("Ingrese la cantidad de digitos decimales que quiere mostrar");
        digitos = leer.nextInt();

        validarNumero2(num, baseIn, leer, baseFin, digitos);
        if (!validarSigno(num)) {
            tam = num.length();
            num = num.substring(1, tam);
            numFinal = "-" + convertirBase(num, baseIn, baseFin, digitos);
        } else {
            numFinal = convertirBase(num, baseIn, baseFin, digitos);
        }
        leer.close();
        System.out.printf("""
                    CONVERSION
                %s en base %d a
                %s en base %d
                """, num, baseIn, numFinal, baseFin);
    }
}