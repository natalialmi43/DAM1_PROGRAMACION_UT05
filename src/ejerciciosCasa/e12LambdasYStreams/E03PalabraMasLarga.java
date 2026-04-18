package ejerciciosCasa.e12LambdasYStreams;

/*
## Ejercicio 3:
Buscando la palabra más larga (Stream + max)
Dada una lista de palabras: {"Java", "Programación", "Stream", "Código", "DAM"}.
•Encuentra la palabra que tiene más caracteres.
•Pista: Usa el método .max() pasando un Comparator basado en la longitud de la cadena (String::length).
•Imprime la palabra encontrada (ten en cuenta que max devuelve un Optional).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class E03PalabraMasLarga {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>(Arrays.asList("Java", "Programación", "Stream", "Código", "DAM"));

        String palabraMasLarga = String.valueOf(palabras.stream().max(Comparator.comparing(String::length)));
        System.out.println(palabraMasLarga);



    }
}
