package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        sc.nextLine();

        List<String> listaPalavras = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {
            String palavras = sc.nextLine();
            listaPalavras.addAll(Arrays.stream(palavras.split(" ")).collect(Collectors.toList()));
            String listaOrdenada = listaPalavras.stream()
                .sorted(Comparator.comparingInt(String::length).reversed()
                .thenComparing(String::compareTo)).collect(Collectors.joining(" "));

            System.out.println(listaOrdenada);
            listaPalavras.clear();
        }
        sc.close();
    }
}
