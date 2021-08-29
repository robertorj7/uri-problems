package Beginner;

import java.util.Scanner;

public class p2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] relogio = sc.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case(7): System.out.println("Atraso maximo: " + min); break;
                case(8): System.out.println("Atraso maximo: " + (60 + min)); break;
                case(9): System.out.println("Atraso maximo: " + (120 + min)); break;
                default: System.out.println("Atraso maximo: 0");
            }
        }
    }
}
