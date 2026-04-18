package ejerciciosCasa.e12LambdasYStreams;

/*
## Ejercicio 5:
El "Top 3" de ventas (Ordenación y Límite)
Imagina una lista de precios de productos: {19.99, 5.50, 45.0, 120.95, 89.0, 2.30}.
Queremos saber cuáles son los 3 productos más caros.
Ordena la lista de forma descendente (sorted con un comparador inverso).
Limita el resultado a 3 elementos (limit(3)).
Imprime el resultado.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class E05OrdenacionYLimites {
    public static void main(String[] args) {

        List<Double> precios = new ArrayList<>(Arrays.asList(19.99, 5.50, 45.0, 120.95, 89.0, 2.30));

        precios.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
