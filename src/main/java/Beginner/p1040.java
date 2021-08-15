package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0, notaExame = 0;
        List<Double> notas = new ArrayList<>();

        for (int i=0; i<4; i++) {
            notas.add(sc.nextDouble());
        }

        media = ((notas.get(0) * 2) + (notas.get(1) * 3) + (notas.get(2) * 4) + notas.get(3)) / 10;

        System.out.println(String.format("Media: %.1f", media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = sc.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", notaExame));
            media = (media + notaExame) / 2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno repovado.");
            }

            System.out.println(String.format("Media Final: %.1f", media));
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
