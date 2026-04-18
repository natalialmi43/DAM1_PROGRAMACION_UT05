package ejerciciosCasa.e12LambdasYStreams;

/*
## Ejercicio 1:
El filtro de aprobados (Lambda + filter)
Partimos de una lista de notas: List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);
Utiliza un Stream para filtrar las notas que sean mayores o iguales a 5.
Imprime cada nota aprobada utilizando el método .forEach() con una referencia a método o una lambda.
Resultado esperado: 8, 5, 10, 7.
 */

import java.util.Arrays;
import java.util.List;

public class E01FiltrarAprobados {
    public static void main(String[] args) {

        List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);


        notas.stream().filter(nota -> nota >= 5).forEach(System.out::println);

    }
}
