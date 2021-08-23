package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int linhas = Integer.parseInt(st.nextToken());
        List<Uniforme> listaUniformes = new ArrayList<>();

        for (int i = 0; i <= linhas; i++) {
            String next = br.readLine();
            if(next.equals("0")) {
                break;
            }
            Uniforme uniforme = new Uniforme();
            uniforme.setNomeEstudante(next);

            String[] camiseta = br.readLine().split(" ");
            uniforme.setCorUniforme(camiseta[0]);
            uniforme.setTamUniforme(camiseta[1]);
            listaUniformes.add(uniforme);
        }
        Comparator<Uniforme> comparator = Comparator
                .comparing(Uniforme::getCorUniforme).reversed()
                .thenComparing(Uniforme::getTamUniforme).reversed()
                .thenComparing(Uniforme::getNomeEstudante);

        listaUniformes.stream().sorted(comparator).forEach(System.out::println);
    }

    public static class Uniforme {
        private String nomeEstudante;
        private String corUniforme;
        private String tamUniforme;

        public String getNomeEstudante() {
            return nomeEstudante;
        }

        public void setNomeEstudante(String nomeEstudante) {
            this.nomeEstudante = nomeEstudante;
        }

        public String getCorUniforme() {
            return corUniforme;
        }

        public void setCorUniforme(String corUniforme) {
            this.corUniforme = corUniforme;
        }

        public String getTamUniforme() {
            return tamUniforme;
        }

        public void setTamUniforme(String tamUniforme) {
            this.tamUniforme = tamUniforme;
        }
    }
}


