package ejerciciosCasa.e04Set;

import java.util.HashSet;
import java.util.TreeSet;

public class E03OrdenacionTreeSet {
    public static void main(String[] args) {

        System.out.println("Tree, los ordena solos");

        TreeSet<Integer> numerosPremiados = new TreeSet<>();

        numerosPremiados.add(45);
        numerosPremiados.add(12);
        numerosPremiados.add(89);
        numerosPremiados.add(3);
        numerosPremiados.add(22);

        for (int n : numerosPremiados){
            System.out.println(n);
        }

        System.out.println("Ahora con Hash, NO los ordena");

        HashSet <Integer> prueba = new HashSet<>();
        prueba.add(45);
        prueba.add(12);
        prueba.add(89);
        prueba.add(3);
        prueba.add(22);

        for (int n : prueba){
            System.out.println(n);
        }
     }
}
