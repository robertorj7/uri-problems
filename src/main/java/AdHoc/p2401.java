package AdHoc;

import java.util.Scanner;

public class p2401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), resultado = 1;

        for (int i=0; i<num; i++) {
            int valor = Integer.parseInt(sc.next());
            char operacao = sc.next().charAt(0);

            System.out.println(valor + " " + operacao);
        }

    }
}
