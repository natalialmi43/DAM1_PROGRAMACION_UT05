package ejerciciosCasa.e07RepasoConjunto;

import java.util.*;

public class E02HashSet {
    public static void main(String[] args) {

        Set <String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Negro");
        colores.add("Azul");
        colores.add("Verde");

        System.out.println(colores);

        Set <String> coloresOrdenNatural = new TreeSet<>(colores);
        System.out.println(coloresOrdenNatural);


    }
}
