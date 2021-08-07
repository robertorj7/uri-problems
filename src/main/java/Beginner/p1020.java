package Beginner;

import java.util.Scanner;

public class p1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int dias = 0, meses = 0, anos = 0, resto = 0;

        anos = idade / 365;
        resto = idade % 365;
        meses = resto / 30;
        resto = resto % 30;
        dias = resto;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)\n");
    }
}
