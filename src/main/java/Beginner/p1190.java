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

        for (int j=1; j<=5; j++) {
            for (int i=11; i>=12-j; i--) {
                soma += Matriz[i][j];
            }
        }

        for (int j=10; j>=6; j--) {
            for (int i=11; i>=j+1; i--) {
                soma += Matriz[i][j];
            }
        }

        if (entrada == 'S') {
            System.out.println(String.format("%.1f", soma));
        } else if (entrada == 'M') {
            System.out.println(String.format("%.1f", soma / 30));
        }
    }

}

