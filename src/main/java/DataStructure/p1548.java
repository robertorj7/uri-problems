package DataStructure;

import java.util.Comparator;
import java.util.Scanner;

public class p1548 {
    public class Banco {
        private Integer numSenha;

        public Banco(Integer numSenha) {
            this.numSenha = numSenha;
        }

        public Integer getNumSenha() {
            return numSenha;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i=0; i<casos; i++) {
            int numClientes = sc.nextInt();

        }
    }

    public static class numSenhaComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer n1, Integer n2) {
            int result = n1.compareTo(n2);
            return -result;
        }
    }
}
