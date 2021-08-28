package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class p1188 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        char entrada = sc.next().toUpperCase().charAt(0);
        double[][] Matriz = new double[12][12];

        for (int i=0; i<Matriz.length; i++) {
            for (int j=0; j<Matriz.length; j++) {
                Matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i=0; i<Matriz.length; i++) {
            for (int j=0; j<Matriz[i].length; j++) {
                if ((j < i) && (j > Matriz.length-i-1)) {
                    soma += Matriz[i][j];
                }
            }
        }

        if (entrada == 'S') {
            System.out.println(String.format("%.1f", soma));
        } else if (entrada == 'M') {
            System.out.println(String.format("%.1f", soma / 30));
        }
    }
}
