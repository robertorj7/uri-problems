package Beginner;

import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entradaSeg = sc.nextInt();
        int segundos = 0, minutos = 0, horas = 0;

        horas = entradaSeg / 3600;
        entradaSeg %= 3600;
        minutos = entradaSeg / 60;
        entradaSeg %= 60;
        segundos = entradaSeg % 60;

        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }
}
