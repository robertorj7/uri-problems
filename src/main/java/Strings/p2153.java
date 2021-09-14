package Strings;

import java.util.Scanner;

public class p2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String entrada = sc.nextLine();
            Integer limite = (int) Math.floor(entrada.length() / 2);
            Integer fim = entrada.length();
            Integer aux = 0;

            if(entrada.length() == 1) {
                System.out.println(entrada);
            } else if (limite >= 1) {
                for (int i = limite; i >= 1; i--) {
                    if(entrada.substring(fim-i, fim).equals(entrada.substring(fim-(2*i),fim-i))) {
                        aux = i;
                        System.out.println(entrada.substring(0, (fim - aux)));
                    } else if (limite == 1) {
                        System.out.println(entrada);
                    }
                }

                if(limite > 1 && aux == 0) {
                    System.out.println(entrada);
                }
            }
        }
        sc.close();
    }
}
