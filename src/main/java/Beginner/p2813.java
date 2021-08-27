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
                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("sol")) {
                    comprarCasa++;
                    usadoEscritorio = true;
                }

                if (listaIda.get(i).equals("sol") && listaVolta.get(i).equals("chuva")) {
                    comprarEscritorio++;
                    usadoCasa = true;
                }

                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("chuva")) {
                    comprarCasa++;
                    usadoCasa = true;
                }
            } else {
                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("sol")) {
                    if (usadoCasa == true) {
                        usadoCasa = false;
                    } else {
                        comprarCasa++;
                    }
                    usadoEscritorio = true;

                }

                if (listaIda.get(i).equals("sol") && listaVolta.get(i).equals("chuva")) {
                    if (usadoEscritorio == true) {
                        usadoEscritorio = false;
                    } else {
                        comprarEscritorio++;
                    }
                    usadoCasa = true;
                }

                if (listaIda.get(i).equals("chuva") && listaVolta.get(i).equals("chuva")) {
                    if (usadoCasa == false) {
                        comprarCasa++;
                        usadoCasa = true;
                    }
                }
            }
        }
        System.out.println(comprarCasa + " " + comprarEscritorio);
    }
}
