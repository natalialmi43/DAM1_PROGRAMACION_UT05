package ejerciciosCasa.e04Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class E04EliminarDuplicados {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>(Arrays.asList("Rojo", "Azul", "Rojo", "Verde", "Azul"));

        for(String n : colores){
            System.out.println(n);
        }

        System.out.println("\nSe eliminan duplicados: ");

        HashSet <String> coloresSinDuplicados = new HashSet<>(colores);

        for(String n : coloresSinDuplicados){
            System.out.println(n);
        }


    }
}
