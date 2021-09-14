package Strings;

import java.util.Scanner;

public class p2153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        while (sc.hasNext()) {
            for (int i=0; i<entrada.length(); i++) {
                System.out.println(entrada.charAt(i));
            }
            entrada = sc.next();
        }
    }
}
