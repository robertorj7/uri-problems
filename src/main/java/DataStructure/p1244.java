package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for (int i=0; i<num; i++) {
            List<String> lista = new ArrayList<>();
            String palavras = sc.nextLine();
            String[] arrayPalavras = palavras.split(" ");

            for (int j=0; j<arrayPalavras.length; j++) {
                String palavra = palavras.split(" ")[j];

            }
        }
    }

}
