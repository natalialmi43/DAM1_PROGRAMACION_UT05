package ejerciciosCasa.e05SetStockElectroAvila;

import java.util.*;

public class GestionInventario {
    public static void main(String[] args) {
        // PARTE HECHA: Datos de prueba con duplicados (mismo ID, distintos datos)
        List<Producto> entradaAlmacen = new ArrayList<>();
        entradaAlmacen.add(new Producto("LAV01", "Lavadora Bosch", 450.0, 10));
        entradaAlmacen.add(new Producto("TV02",  "TV Samsung 60", 800.0, 5));
        entradaAlmacen.add(new Producto("LAV01", "Lavadora Bosch XL", 480.0, 2)); // Duplicado ID
        entradaAlmacen.add(new Producto("PC03",  "PC Gaming Nitro", 1200.0, 3));
        entradaAlmacen.add(new Producto("TV02",  "TV Samsung OLED", 850.0, 1));  // Duplicado ID
        entradaAlmacen.add(new Producto("MICRO04", "Microondas LG", 150.0, 20));

        System.out.println("--- 1. Detectados en bruto: " + entradaAlmacen.size() + " registros.");

        // TODO: TAREA 1 - Eliminar duplicados usando un Set
        // Pista: El Set usará vuestro método equals/hashCode[cite: 2696].
        Set<Producto> productosUnicos = new HashSet<>(entradaAlmacen);


        // TODO: TAREA 2 - Volver a pasar a una List para poder ordenar
        List<Producto> listaLimpia = new ArrayList<>(productosUnicos);


        // TODO: TAREA 3 - Filtrar y Transformar
        // Quedarse solo con los de precioBase > 300 y subirles el precio un 21% (IVA).
        List <Producto> listaFiltrada = new ArrayList<>();

        for (Producto producto : listaLimpia){
            if (producto.getPrecioBase() > 300){
                double precioConIVA = producto.getPrecioBase() * 1.21;
                producto.setPrecioBase(precioConIVA);
                listaFiltrada.add(producto);
            }
        }
        listaLimpia = listaFiltrada;


        // TODO: TAREA 4 - Ordenar por Stock de mayor a menor
        // Podéis usar lista.sort() con un Comparator[cite: 206].
        listaLimpia.sort((p1, p2) -> p2.getStock() - p1.getStock());

        System.out.println("\n--- INVENTARIO FINAL (Precio > 300€, con IVA, ordenado por Stock) ---");
        // Imprimir el resultado final
        for (Producto p : listaLimpia) {
            System.out.println(p);
        }
    }
}