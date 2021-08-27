package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), comprarCasa = 0, comprarEscritorio = 0, usadosCasa = 0, usadosEscritorio = 0;
        List<String> listaIda = new ArrayList<>();
        List<String> listaVolta = new ArrayList<>();

        for (int i=0; i<n; i++) {
            listaIda.add(sc.next());
            listaVolta.add(sc.next());

            if (i == 0) {
                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("sol")) {
                    comprarCasa++;
                    usadosEscritorio++;
                }

                if (listaIda.get(i).equals("sol") && listaVolta.get(i).equals("chuva")) {
                    comprarEscritorio++;
                    usadosCasa++;
                }

                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("chuva")) {
                    comprarCasa++;
                    usadosCasa++;
                }
            } else {
                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("sol")) {
                    if (usadosCasa > 0) {
                        usadosCasa--;
                    } else {
                        comprarCasa++;
                    }
                    usadosEscritorio++;

                }

                if (listaIda.get(i).equals("sol") && listaVolta.get(i).equals("chuva")) {
                    if (usadosEscritorio > 0) {
                        usadosEscritorio--;
                    } else {
                        comprarEscritorio++;
                    }
                    usadosCasa++;
                }

                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("chuva")) {
                    if (usadosCasa == 0) {
                        comprarCasa++;
                        usadosCasa++;
                    }
                }
            }
        }
        System.out.println(comprarCasa + " " + comprarEscritorio);
    }
}

