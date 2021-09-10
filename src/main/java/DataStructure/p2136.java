package DataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p2136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> listaSim = new HashSet<>();
        Set<String> listaNao = new HashSet<>();
        String nome, decisao;

        while (!sc.nextLine().equals("FIM")) {
            nome = sc.next();
            decisao = sc.next();

            if (decisao == "SIM") {
                listaSim.add(nome);
            } else {
                listaNao.add(nome);
            }
        }

        System.out.println(listaSim);
        System.out.println(listaNao);
    }

}
