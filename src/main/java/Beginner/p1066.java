package Beginner;

import java.util.Scanner;

public class p1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i=0; i<5; i++) {
            int numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0){
                negativos++;
            }

            if (numero % 2 == 0 || numero == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println(String.format("%d valor(es) par(es)", pares));
        System.out.println(String.format("%d valor(es) impar(es)", impares));
        System.out.println(String.format("%d valor(es) positivo(s)", positivos));
        System.out.println(String.format("%d valor(es) negativo(s)", negativos));
    }
}
