package DataStructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class p1258 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        sc.nextLine();
        ArrayList<Uniforme> listaUniformes= new ArrayList<>(quantidade);
        String name, uniformDetails, uniformColor, uniformSize;

        for(int i = 0; i < quantidade; i++)
        {
            name = sc.nextLine();
            uniformDetails = sc.nextLine();
            uniformColor = uniformDetails.split(" ")[0];
            uniformSize= uniformDetails.split(" ")[1];
            listaUniformes.add(new Uniforme(name, uniformColor, uniformSize));
        }

        sc.close();
        Collections.sort(listaUniformes, new UniformComparator());

        for(Uniforme item : listaUniformes)
        {
            System.out.println(item.corUniforme + " " + item.tamUniforme + " " + item.nomeEstudante);
        }
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

    public static class UniformComparator implements Comparator<Uniforme>
    {
        @Override
        public int compare(Uniforme estudante0, Uniforme estudante1)
        {
            int res = estudante0.corUniforme.compareTo(estudante1.corUniforme);

            if(res == 0)
            {
                res = estudante0.tamUniforme.compareTo(estudante1.tamUniforme);

                if(res == 0)
                {
                    res = estudante0.nomeEstudante.compareTo(estudante1.nomeEstudante);
                } else {
                    res = -res;
                }
            }
            return res;
        }
    }
}


