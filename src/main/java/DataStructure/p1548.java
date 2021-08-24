package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class p1548 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int pessoasNaFila, senhaAtual, trocasDeLugar;
        ArrayList<Integer> filaAtual = new ArrayList<>();
        HashMap<Integer, Integer> numParaIndiceOriginal = new HashMap<>();

        scanner.nextLine();

        for(int i = 0; i < quantidade; i++) {
            pessoasNaFila = scanner.nextInt();
            trocasDeLugar = 0;

            for(int j = 0; j < pessoasNaFila; j++) {
                senhaAtual = scanner.nextInt();
                filaAtual.add(senhaAtual);
                numParaIndiceOriginal.put(senhaAtual, filaAtual.size() - 1);
            }

            numSenhaComparator comparator = new numSenhaComparator();
            Collections.sort(filaAtual, comparator);

            for(int j = 0; j < filaAtual.size(); j++) {
                int indiceOriginal = numParaIndiceOriginal.get(filaAtual.get(j));

                if(indiceOriginal != j) {
                    trocasDeLugar++;
                }
            }

            System.out.println(pessoasNaFila - trocasDeLugar);
            filaAtual = new ArrayList<>();
        }

        scanner.close();
    }

    public static class numSenhaComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer n1, Integer n2) {
            int result = n1.compareTo(n2);
            return -result;
        }
    }
}
