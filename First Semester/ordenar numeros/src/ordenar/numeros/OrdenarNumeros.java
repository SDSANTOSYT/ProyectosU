
package ordenar.numeros;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class OrdenarNumeros {

    
    public static void main(String[] args) {
        double n1, n2, n3, n4, pv, a, b, c, d;
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Escriba 4 numeros");
        n1 = Leer.nextDouble();
        n2 = Leer.nextDouble();
        n3 = Leer.nextDouble();
        n4 = Leer.nextDouble();
        
        if (n1<n2) {
            pv = n1;
            n1 = n2;
            n2 = pv;
            if (n1<n3) {
                pv = n1;
                n1 = n3;
                n3 = pv;
                if (n1<n4) {
                    pv = n1;
                    n1 = n4;
                    n4 = pv;
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }    
                }else{
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }
            }else {
                if (n1<n4) {
                    pv = n1;
                    n1 = n4;
                    n4 = pv;
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }    
                }else{
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }
            }
        }else{
            if (n1<n3) {
                pv = n1;
                n1 = n3;
                n3 = pv;
                if (n1<n4) {
                    pv = n1;
                    n1 = n4;
                    n4 = pv;
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }else{
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }
            }else{
                if (n1<n4) {
                    pv = n1;
                    n1 = n4;
                    n4 = pv;
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                            else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }else{
                    if (n2<n3) {
                        pv = n2;
                        n2 = n3;
                        n3 = pv;
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }else{
                        if (n2<n4) {
                            pv = n2;
                            n2 = n4;
                            n4 = pv;
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }else{
                            if (n3<n4) {
                                pv = n3;
                                n3 = n4;
                                n4 = pv;
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }else{
                                System.out.println(n1+"-"+n2+"-"+n3+"-"+n4);
                            }
                        }
                    }
                }
            }    
        }
    }
}
