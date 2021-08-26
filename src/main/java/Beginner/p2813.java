package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comprarCasa = 0, comprarEscritorio = 0, usadoCasa = 0, usasdoEscritorio = 0;
        List<String> listaIda = new ArrayList<>();
        List<String> listaVolta = new ArrayList<>();

        for (int i=0; i<n; i++) {
            listaIda.add(sc.next());
            listaVolta.add(sc.next());

            if (i == 0) {
                if (listaIda.get(i).equals("chuva")) {
                    comprarCasa++;
                }

                if (listaVolta.get(i).equals("chuva") && listaIda.get(i).equals("sol")) {
                    comprarEscritorio++;
                }
            } else {

            }
        }
        System.out.println(comprarCasa + " " + comprarEscritorio);
    }
}
