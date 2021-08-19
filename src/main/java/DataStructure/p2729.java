package DataStructure;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p2729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();
        sc.nextLine();

        Set<String> lista;

        for (int i=0; i<quantidade; i++) {
            lista = new TreeSet<>();

            for (String item: sc.nextLine().split(" ")) {
                lista.add(item);
            }

            Iterator<String> it = lista.iterator();
            StringBuilder builder = new StringBuilder();
            while (it.hasNext()) {
                builder.append(it.next() + " ");
            }
            System.out.println(builder.toString().trim());
        }
    }
}

