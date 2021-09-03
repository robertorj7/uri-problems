package AdHoc;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p1171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        Map<Integer, Integer> numeros = new TreeMap<>();

        for (int i=0; i<total; i++) {
            int valor = sc.nextInt();
            if (numeros.containsKey(valor)) {
                numeros.replace(valor, numeros.get(valor) + 1);
            } else {
                numeros.put(valor, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
        }
    }
}
