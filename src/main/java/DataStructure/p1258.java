package DataStructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1258 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        String nome, linhaUniforme, corUniforme, tamUniforme;
        List<Uniforme> listaUniformes = new ArrayList<>();

        for (int i=0; i<quantidade; i++) {
            nome = sc.next();
            linhaUniforme = sc.next();
//            corUniforme = linhaUniforme.split(" ")[0];
//            tamUniforme = linhaUniforme.split(" ")[1];

//            listaUniformes.add(new Uniforme(nome, corUniforme, tamUniforme));
            System.out.println(nome);
            System.out.println(linhaUniforme);
        }

//        System.out.println(listaUniformes);
    }

    public static class Uniforme {
        private String nomeEstudante;
        private String corUniforme;
        private String tamUniforme;

        public Uniforme(String nomeEstudante, String corUniforme, String tamUniforme) {
            this.nomeEstudante = nomeEstudante;
            this.corUniforme = corUniforme;
            this.tamUniforme = tamUniforme;
        }

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


