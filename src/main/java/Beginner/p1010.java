package Beginner;

import java.util.Scanner;

public class p1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();
        double valorAPagar = (preco1 * quantidade1) + (preco2 * quantidade2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorAPagar));
    }
}
