package Beginner;

import java.util.Scanner;

public class p1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int hrFinal = sc.nextInt();
        int minFinal = sc.nextInt();
        int totalHoras = 0, totalMinutos = 0;

        if (hrFinal < hrInicial) {
            System.err.println("Hora inválida!");
        }

        if (hrFinal - hrInicial == 1) {
            if (minFinal < minInicial) {
                totalMinutos = 60 - (minInicial - minFinal);
            } else {
                totalHoras = hrFinal - hrInicial;
                totalMinutos = minFinal - minInicial;
            }
        } else {
            totalHoras = hrFinal - hrInicial;
            totalMinutos = minFinal - minInicial;
        }

        if (hrInicial == minInicial && minFinal == minInicial) {
            totalHoras = 24;
        }

        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totalHoras, totalMinutos));
    }
}
