package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quantCasa = 0, quantEscritorio = 0;
        List<String> listaIda = new ArrayList<>();
        List<String> listaVolta = new ArrayList<>();

        for (int i=0; i<n; i++) {
            listaIda.add(sc.next());
            listaVolta.add(sc.next());

            if (i == 0) {
                if (listaIda.get(i).equals("chuva")) {
                    quantCasa++;
                }

                if (listaVolta.get(i).equals("chuva") && listaIda.get(i).equals("sol")) {
                    quantEscritorio++;
                }
            } else {
                if (listaVolta.get(i-1).equals("sol")) {
                    if (listaIda.get(i).equals("sol") && listaVolta.get(i).equals("chuva")) {
                        quantEscritorio++;
                    }

                    if (listaIda.get(i).equals("chuva")) {
                        quantCasa++;
                    }
                }
            }
        }
        System.out.println(quantCasa + " " + quantEscritorio);
    }
}
