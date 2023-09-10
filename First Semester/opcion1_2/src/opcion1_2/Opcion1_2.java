package opcion1_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Opcion1_2 {

    public static void main(String[] args) {

        int rand, d, d2, d3, d4, vsw, nd, nd2, nd3, nd4, famas, puntos, intentos;
        double num;
        //generación del random
        do {
            rand = (int) (Math.random() * (10000 - 1000)) + 1000;
            //digitos
            d = rand % 10;
            d2 = (rand / 10) % 10;
            d3 = (rand / 100) % 10;
            d4 = (rand / 1000) % 10;
            // validaciones
            if (d == d2 || d == d3 || d == d4) {
                vsw = 1;
            } else if (d2 == d3 || d2 == d4) {
                vsw = 1;
            } else if (d3 == d4) {
                vsw = 1;
            } else {
                vsw = 0;
            }
        } while (vsw == 1);
        //numero que ingresa el usuario
        num = 0;
        intentos = 0;
        while (num != rand) {

            num = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingrese un numero de 4 cifras: ", "numero", 3)));
            while (num < 1000 || num > 9999 || num % 1 != 0) {
                if (num % 1 != 0) {
                    JOptionPane.showMessageDialog(null, """
                                                                            NUMERO INVALIDO
                                                                            EL NUMERO NO PUEDE SER DECIMAL""", "ERROR", 0);
                    num = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingrese un numero de 4 cifras: ", "numero", 3)));
                } else {
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                NUMERO INVALIDO
                                                Ingrese un numero de 4 cifras: """, "ERROR", 0));
                }
            }
            //creación de digitos
            nd = (int) num % 10;
            nd2 = (int) (num / 10) % 10;
            nd3 = (int) (num / 100) % 10;
            nd4 = (int) (num / 1000) % 10;
            //validaciones
            if (nd == nd2 || nd == nd3 || nd == nd4) {
                vsw = 1;
            } else if (nd2 == nd3 || nd2 == nd4) {
                vsw = 1;
            } else if (nd3 == nd4) {
                vsw = 1;
            } else {
                vsw = 0;
            }
            while (vsw == 1) {
                JOptionPane.showMessageDialog(null, """
                                                                            NUMERO INVALIDO
                                                                            el numero no puede tener digitos repetidos""", "ERROR", 0);
                num = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingrese un numero de 4 cifras: ", "numero", 3)));
                while (num < 1000 || num > 9999 || num % 1 != 0) {
                    if (num % 1 != 0) {
                        JOptionPane.showMessageDialog(null, """
                                                                            NUMERO INVALIDO
                                                                            EL NUMERO NO PUEDE SER DECIMAL""", "ERROR", 0);
                        num = Double.parseDouble((JOptionPane.showInputDialog(null, "Ingrese un numero de 4 cifras: ", "numero", 3)));
                    } else {
                        num = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                NUMERO INVALIDO
                                                Ingrese un numero de 4 cifras: """, "ERROR", 0));
                    }
                }
                //creación de digitos
                nd = (int) num % 10;
                nd2 = (int) (num / 10) % 10;
                nd3 = (int) (num / 100) % 10;
                nd4 = (int) (num / 1000) % 10;
                //validaciones
                if (nd == nd2 || nd == nd3 || nd == nd4) {
                    vsw = 1;
                } else if (nd2 == nd3 || nd2 == nd4) {
                    vsw = 1;
                } else if (nd3 == nd4) {
                    vsw = 1;
                } else {
                    vsw = 0;
                }
            }
            // comprobacion de famas y puntos
            famas = 0;
            puntos = 0;
            if (d == nd) {
                famas++;
            }
            if (d2 == nd2) {
                famas++;
            }
            if (d3 == nd3) {
                famas++;
            }
            if (d4 == nd4) {
                famas++;
            }

            if (d == nd2 || d == nd3 || d == nd4) {
                puntos++;
            }
            if (d2 == nd || d2 == nd3 || d2 == nd4) {
                puntos++;
            }
            if (d3 == nd2 || d3 == nd || d3 == nd4) {
                puntos++;
            }
            if (d4 == nd2 || d4 == nd3 || d4 == nd) {
                puntos++;
            }
            intentos++;
            if (famas == 4) {
                JOptionPane.showMessageDialog(null,
                        "ACERTASTE"
                        + "\nEl numero era: " + (int) num
                        + "\nintentos: " + intentos, "GANASTE", -1);
            } else {
                JOptionPane.showMessageDialog(null, (int) num + "\nHay " + famas + " famas y " + puntos + " puntos");
            }
        }
    }

}
