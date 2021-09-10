package DataStructure;

import java.util.Scanner;

public class p2150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letras, frase;

        while(sc.hasNext()) {
            int quantidade = 0;
            letras = sc.nextLine();
            frase = sc.nextLine();

            for (int i=0; i<letras.length(); i++) {
                for (int j=0; j<frase.length(); j++) {
                    if (frase.charAt(j) == letras.charAt(i)) {
                        quantidade++;
                    }
                }
            }

            System.out.println(quantidade);
        }
    }
}
