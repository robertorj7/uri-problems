package Beginner;

import java.util.Scanner;

public class p1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = 0.0, x2 = 0.0;

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else if (delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = (b * -1 + Math.sqrt(delta)) / (2 * a);
            x2 = (b * -1 - Math.sqrt(delta)) / (2 * a);
            System.out.println(String.format("R1 = %.5f", x1));
            System.out.println(String.format("R2 = %.5f", x2));
        }
    }
}
