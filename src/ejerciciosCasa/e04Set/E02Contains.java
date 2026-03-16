package ejerciciosCasa.e04Set;

import java.util.HashSet;
import java.util.Scanner;

public class E02Contains {

    public static void main(String[] args) {

        HashSet <Integer> ids = new HashSet<>();

        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        int n = sc.nextInt();

        boolean contiene = ids.contains(n);

        System.out.println(contiene ? "Si" : "No");

    }
}
