package Beginner;

import java.util.Scanner;

public class p1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble(), vendas = sc.nextDouble(), total;

        total = salario + vendas * 0.15;

        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
