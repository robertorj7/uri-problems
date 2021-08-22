package Beginner;

import java.util.Scanner;

public class p1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicio = sc.nextInt(), horaFim = sc.nextInt();
        int duracao = 0;

        if (horaInicio == horaFim) {
            duracao = 24;
        } else if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println(String.format("O JOGO DUROU %d HORA(S)", duracao));
    }
}
