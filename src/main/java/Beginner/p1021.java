package Beginner;

import java.util.Scanner;

public class p1021 {
    public static double calculaNotasEMoedas(double valor, double num) {
        return valor / num;
    }

    public static double calculaResto(double valor, double num) {
        return valor % num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble(), resto = 0;
        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0;
        int um = 0, cinquentaCents = 0, vinteECincoCents = 0, dezCents = 0, cincoCents = 0, umCent = 0;

        cem = (int) calculaNotasEMoedas(valor, 100);
        resto = calculaResto(valor, 100);
        cinquenta = (int) calculaNotasEMoedas(resto, 50);
        resto = calculaResto(resto, 50);
        vinte = (int) calculaNotasEMoedas(resto, 20);
        resto = calculaResto(resto, 20);
        dez = (int) calculaNotasEMoedas(resto, 10);
        resto = calculaResto(resto, 10);
        cinco = (int) calculaNotasEMoedas(resto, 5);
        resto = calculaResto(resto, 5);
        dois = (int) calculaNotasEMoedas(resto, 2);
        resto = calculaResto(resto, 2);

        um = (int) resto;
        resto = calculaResto(resto, 1);

        cinquentaCents = (int) calculaNotasEMoedas(resto, 0.5);
        resto = calculaResto(resto, 0.5);
        vinteECincoCents = (int) calculaNotasEMoedas(resto, 0.25);
        resto = calculaResto(resto, 0.25);
        dezCents = (int) calculaNotasEMoedas(resto, 0.1);
        resto = calculaResto(resto, 0.1);
        cincoCents = (int) calculaNotasEMoedas(resto, 0.05);
        resto = calculaResto(resto, 0.05);
        umCent = (int) Math.round(resto / 0.01);

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cinquentaCents + " moeda(s) de R$ 0.50");
        System.out.println(vinteECincoCents + " moeda(s) de R$ 0.25");
        System.out.println(dezCents + " moeda(s) de R$ 0.10");
        System.out.println(cincoCents + " moeda(s) de R$ 0.05");
        System.out.println(umCent + " moeda(s) de R$ 0.01");
    }
}
