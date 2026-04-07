package ejerciciosCasa.e11RepasoHotel;

import java.util.HashMap;
import java.util.Map;

public class RepasoHotel {

    public static void main(String[] args) {
        // 1. Catálogo de Precios (Habitación -> Precio por noche)
        Map<Integer, Double> catalogoPrecios = new HashMap<>();
        catalogoPrecios.put(101, 50.0);
        catalogoPrecios.put(202, 75.0);
        catalogoPrecios.put(305, 120.0);
        catalogoPrecios.put(404, 250.0);

        // 2. Registro Anidado (DNI -> {Habitación: Noches})
        Map<String, Map<Integer, Integer>> registros = new HashMap<>();

        // Cliente A: estuvo 2 noches en la 101 y 1 noche en la 305
        registros.put("12345678A", Map.of(101, 2, 305, 1));

        // Cliente B: estuvo 3 noches en la 202 y 2 noches en la 404
        registros.put("87654321B", Map.of(202, 3, 404, 2));

        // Cliente C: estuvo 5 noches en la 101
        registros.put("44556677C", Map.of(101, 5));

        System.out.println("--- Procesando Facturación Compleja ---");

        // TAREA 1: Calcular factura total por cliente
        Map<String, Double> facturas = calcularFacturas(registros, catalogoPrecios);
        System.out.println("Facturas finales: " + facturas);

        // TAREA 2: Ranking de habitaciones (Cuántas noches totales ha sido ocupada cada una)
        Map<Integer, Integer> ocupacion = calcularOcupacionPorHabitacion(registros);
        System.out.println("Noches totales por habitación: " + ocupacion);
    }

    /**
     * TO-DO 1: Navega por el mapa anidado.
     * Para cada cliente, recorre su mapa interno de habitaciones,
     * busca el precio en el catálogo y acumula el total.
     */
    public static Map<String, Double> calcularFacturas(Map<String, Map<Integer, Integer>> registros, Map<Integer, Double> precios) {
        Map<String, Double> resultado = new HashMap<>();

        // Pista: Necesitarás un bucle para los DNIs y otro para las habitaciones de ese DNI.
        // --- TU CÓDIGO AQUÍ ---

        for (Map.Entry<String, Map<Integer, Integer>> datos : registros.entrySet()){
            String dni = datos.getKey();
            Map<Integer, Integer> mapaHabitacionNoches = datos.getValue();

            for (Map.Entry<Integer, Integer> habitacionesNoche : mapaHabitacionNoches.entrySet()){
                Integer numeroHabitacion = habitacionesNoche.getKey();
                Integer numeroNoches = habitacionesNoche.getValue();

                Double precioHabitacion = precios.get(numeroHabitacion);

                if(precioHabitacion != null){
                    double precio = numeroNoches * precioHabitacion;
                    Double acumulado = resultado.getOrDefault(dni, 0.0);

                    resultado.put(dni, precio+acumulado);
                }
            }

        }

        return resultado;
    }

    /**
     * TO-DO 2: Queremos saber qué habitaciones son más rentables.
     * Crea un mapa donde la clave sea la habitación y el valor sea la SUMA TOTAL
     * de noches que todos los clientes han pasado en ella.
     */
    public static Map<Integer, Integer> calcularOcupacionPorHabitacion(Map<String, Map<Integer, Integer>> registros) {
        Map<Integer, Integer> ranking = new HashMap<>();

        for ( Map<Integer, Integer> mapaHabitacionNochesOcuapadas : registros.values()){

            for (Map.Entry<Integer, Integer> desglosado :  mapaHabitacionNochesOcuapadas.entrySet()){
                Integer habitacion = desglosado.getKey();
                Integer noches  = desglosado.getValue();

                ranking.put(habitacion, ranking.getOrDefault(habitacion, 0) + noches);
            }
        }

        return ranking;
    }

}