package AdHoc;

import java.util.Scanner;

public class p2401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double resultado = 1.0;

        for (int i=0; i<num; i++) {
            int valor = Integer.parseInt(sc.next());
            char operacao = sc.next().charAt(0);

            if (operacao == '/') {
                resultado /= valor;
            } else if (operacao == '*') {
                resultado *= valor;
            }
        }

        System.out.println(Math.round(resultado));
    }
}
