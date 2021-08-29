package Beginner;

import java.util.Scanner;

public class p1858 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int t = 0, menor = 0, posMenor = 0;

        for (int i=1; i<=n; i++) {
            t = leitor.nextInt();
            if (i == 1) {
                posMenor = 1;
                menor = t;
            } else if (t < menor) {
                posMenor = i;
                menor = t;
            }
        }
        System.out.println(posMenor);
    }
}
