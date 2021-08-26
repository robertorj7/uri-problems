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
                if (listaIda.get(i) == "chuva") {
                    quantCasa++;
                }

                if (listaVolta.get(i) == "chuva") {
                    quantEscritorio++;
                }
            }
        }


    }
}
