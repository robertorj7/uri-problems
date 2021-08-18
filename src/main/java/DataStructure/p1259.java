package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for (int j=0; j<pares.size(); j++) {
            System.out.println(pares.get(j));
        }

        for (int k=0; k<impares.size(); k++) {
            System.out.println(impares.get(k));
        }
    }
}
