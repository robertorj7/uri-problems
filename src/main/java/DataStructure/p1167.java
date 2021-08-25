package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaAlunos = new ArrayList<>();

        int numAlunos, valorAtualFicha, indiceAtual, indiceAlunoEliminado;
        String aluno, valorFicha;

        numAlunos = Integer.parseInt(sc.next());

        while (numAlunos > 0) {
            for (int i = 0; i < numAlunos; i++) {
                aluno = sc.next();
                valorFicha = sc.next();
                listaAlunos.add(aluno.trim() + " " + valorFicha.trim());
            }

            indiceAtual = 0;
            indiceAlunoEliminado = 0;
            valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAtual).split(" ")[1]);

            for (int i = 0; i < numAlunos - 1; i++) {
                if (valorAtualFicha % 2 == 0) {
                    indiceAlunoEliminado = (listaAlunos.size() - (valorAtualFicha % listaAlunos.size()) + indiceAtual) % listaAlunos.size();
                } else if (valorAtualFicha % 2 != 0) {
                    indiceAlunoEliminado = (valorAtualFicha % listaAlunos.size() + indiceAtual) % listaAlunos.size();
                }

                valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).split(" ")[1]);
                listaAlunos.remove(indiceAlunoEliminado);

                indiceAtual = (valorAtualFicha % 2 == 0) ?
                        ((indiceAlunoEliminado <= listaAlunos.size() - 1) ?
                                indiceAlunoEliminado : 0):
                        ((indiceAlunoEliminado == 0) ?
                                (listaAlunos.size() - 1):(indiceAlunoEliminado - 1));
            }

            System.out.println("Vencedor(a): " + listaAlunos.get(0).split(" ")[0]);

            listaAlunos.clear();
            numAlunos = Integer.parseInt(sc.next());
        }

        sc.close();
    }
}