package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class p1178 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double[] arrayNum = new double[100];
        arrayNum[0] = num;
        for (int i=1; i<arrayNum.length; i++) {
            arrayNum[i] = arrayNum[i-1] / 2;
        }

        for (int j=0; j<arrayNum.length; j++) {
            System.out.println(String.format("N[" + j + "] = %.4f", arrayNum[j]));
        }
    }
}
