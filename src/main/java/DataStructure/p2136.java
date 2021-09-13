package DataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class p2136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> listaSim = new ArrayList<>();
        List<String> listaNao = new ArrayList<>();
        String nome, decisao, ganhador = "", linha = sc.nextLine();

        while (!linha.equals("FIM")) {
            nome = linha.split(" ")[0];
            decisao = linha.split(" ")[1];

            if (decisao.equals("SIM")) {
                if (!listaSim.contains(nome)) {
                    listaSim.add(nome);
                }
            } else if (decisao.equals("NAO")) {
                listaNao.add(nome);
            }

            linha = sc.nextLine();
        }

        System.out.println(listaSim);
        System.out.println(listaNao);

    }

}
