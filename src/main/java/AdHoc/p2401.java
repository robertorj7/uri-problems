package AdHoc;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class p2401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operacao;
        String[] linha;
        int numero = Integer.parseInt(sc.nextLine());
        BigDecimal resultado = new BigDecimal("1.0");

        for (int i = 0; i < numero; ++i) {
            linha = sc.nextLine().trim().split(" ");

            BigDecimal numAtual = new BigDecimal(linha[0]);
            operacao = linha[1];

            if (operacao.equals("*")) {
                resultado = resultado.multiply(numAtual);
            } else if (operacao.equals("/")) {
                resultado = resultado.divide(numAtual, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultado.setScale(0, RoundingMode.DOWN));
        sc.close();
    }
}