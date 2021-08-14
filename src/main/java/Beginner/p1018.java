package Beginner;

import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int notasCem = 0, notasCinquenta = 0, notasVinte = 0, notasDez = 0, notasCinco = 0, notasDois = 0, notasUm = 0, resto = 0;

        notasCem = valor / 100;
        resto = valor % 100;
        notasCinquenta = resto / 50;
        resto = resto % 50;
        notasVinte = resto / 20;
        resto = resto % 20;
        notasDez = resto / 10;
        resto = resto % 10;
        notasCinco = resto / 5;
        resto = resto % 5;
        notasDois = resto / 2;
        resto = resto % 2;
        notasUm = resto;

        System.out.println(valor);
        System.out.println(String.format("%d nota(s) de R$ 100,00", notasCem));
        System.out.println(String.format("%d nota(s) de R$ 50,00", notasCinquenta));
        System.out.println(String.format("%d nota(s) de R$ 20,00", notasVinte));
        System.out.println(String.format("%d nota(s) de R$ 10,00", notasDez));
        System.out.println(String.format("%d nota(s) de R$ 5,00", notasCinco));
        System.out.println(String.format("%d nota(s) de R$ 2,00", notasDois));
        System.out.println(String.format("%d nota(s) de R$ 1,00", notasUm));
    }
}
