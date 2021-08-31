package Beginner;

import java.util.Scanner;

public class p1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        int maior = 0;

        maior = calculaMaior(calculaMaior(num1, num2), num3);
        System.out.println(maior + " eh o maior");
    }

    public static int calculaMaior(int n1, int n2) {
        return ((n1 + n2 + Math.abs(n1 - n2)) / 2);
    }
}
