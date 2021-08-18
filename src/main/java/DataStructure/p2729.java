package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p2729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            String item = sc.next();

            if (!lista.contains(item)) {
                lista.add(item);
            }
        }

        Collections.sort(lista);

        for (String item : lista) {
            System.out.println(item);
        }
    }
}

