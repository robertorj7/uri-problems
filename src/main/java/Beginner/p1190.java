package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class p1190 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        char entrada = sc.next().toUpperCase().charAt(0);
        double[][] Matriz = new double[12][12];
        for (int i=0; i<12; i++) {
            for (int j=0; j<12; j++) {
                Matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i=7; i<=11; i++) {
            for (int j=1; j<=5; j++) {

            }
        }

        System.out.println(String.format("%.1f", soma));
    }

}

