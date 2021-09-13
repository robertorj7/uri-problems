package DataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p2136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> listaSim = new HashSet<>();
        Set<String> listaNao = new HashSet<>();
        String nome, decisao, linha = sc.nextLine();

        while (!linha.equals("FIM")) {
            nome = linha.split(" ")[0];
            decisao = linha.split(" ")[1];

            if (decisao.equals("SIM")) {
                listaSim.add(nome);
            } else if (decisao.equals("NAO")) {
                listaNao.add(nome);
            }

            linha = sc.nextLine();
        }

        System.out.println(listaSim);
        System.out.println(listaNao);

    }

}
