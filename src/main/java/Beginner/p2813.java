package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comprarCasa = 0, comprarEscritorio = 0;
        boolean usadoCasa = false, usadoEscritorio = false;
        List<String> listaIda = new ArrayList<>();
        List<String> listaVolta = new ArrayList<>();

        for (int i=0; i<n; i++) {
            listaIda.add(sc.next());
            listaVolta.add(sc.next());

            if (i == 0) {
                if (listaIda.get(i).equals("chuva")) {
                    comprarCasa++;
                } else if (listaVolta.get(i).equals("chuva") && listaIda.get(i).equals("sol")) {
                    comprarEscritorio++;
                }
            } else {
                if (listaIda.get(i).equals("chuva") && listaVolta.get(i-1).equals("sol")) {
                    if (usadoEscritorio == false) {
                        comprarCasa++;
                        usadoEscritorio = true;
                    } else {
                        usadoEscritorio = false;
                    }
                }

                if (listaVolta.get(i-1).equals("chuva") && listaIda.get(i).equals("sol")) {
                    if (usadoCasa == false) {
                        comprarEscritorio++;
                        usadoCasa = true;
                    } else {
                        usadoCasa = false;
                    }
                }
            }
        }
        System.out.println(comprarCasa + " " + comprarEscritorio);
    }
}
