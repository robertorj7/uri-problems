package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        while (entrada != 0) {
            List<String> lista = new ArrayList<>();
            for (int i=0; i<entrada; i++) {
                lista.add(sc.next());
            }

            lista = lista.stream().sorted().collect(Collectors.toList());
            String saida = "Conjunto Bom";

            for (int i = 0; i < entrada - 1; i++) {
                if (lista.get(i + 1).startsWith(lista.get(i))) {
                    saida = "Conjunto Ruim";
                }
            }

            System.out.println(saida);

            entrada = sc.nextInt();
        }
    }
}
