package ejerciciosCasa.e07RepasoConjunto;

import java.util.HashSet;
import java.util.Set;

public class E05HashSet {
    public static void main(String[] args) {

        Set<String> palabras = new HashSet<>();
        palabras.add("Hola");
        palabras.add("Hola");
        palabras.add("Adios");

        System.out.println(palabras);
        System.out.println(palabras.size());

    }
}
