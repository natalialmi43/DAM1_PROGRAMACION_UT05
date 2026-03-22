package Tema5.ordenacion;

import java.util.*;

public class RepasoUtilidades {
    public static void main(String[] args) {
        // --- PARTE A: Utilidades de java.util.Arrays ---
        // 1. Creamos un array estático de productos.
        Producto[] stockArray = {
                new Producto("TV-02", "TV Samsung", 800.0),
                new Producto("LAV-01", "Lavadora LG", 450.0),
                new Producto("PC-03", "PC Gaming", 1200.0)
        };

        // TODO: TAREA 3 - Usar Arrays.toString() para imprimir el array original.

        // TODO: TAREA 4 - Ordenar el array usando Arrays.sort().

        // TODO: TAREA 5 - Realizar una búsqueda binaria con Arrays.binarySearch().
        // Buscad el producto con ID "LAV-01" (recordad que el array debe estar ordenado).


        // --- PARTE B: Utilidades de java.util.Collections ---
        // Convertimos el array a una lista para tener más flexibilidad.
        List<Producto> listaProductos = new ArrayList<>(Arrays.asList(stockArray));

        // TODO: TAREA 6 - Añadir estos nuevos productos a la lista de golpe usando Collections.addAll().
        // Productos: "MICRO-04" (150€) y "TAB-05" (300€).

        // TODO: TAREA 7 - Invertir el orden de la lista con Collections.reverse().

        // TODO: TAREA 8 - Desordenar la lista aleatoriamente con Collections.shuffle().

        // TODO: TAREA 9 - Obtener el producto más caro y el más barato usando
        // Collections.max() y Collections.min() con un Comparator por precio.

        System.out.println("\n--- ESTADO FINAL DE LA LISTA ---");
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }
}
