package ejerciciosGemini.map.e03SimilarVuelos;

import java.util.HashMap;
import java.util.Map;


public class Meteorologia {

    public static void main(String[] args) {
        Map<String, Map<String, Double>> registroClima = new HashMap<>();

        Map<String, Double> madrid = new HashMap<>();
        madrid.put("Enero", 5.5);
        madrid.put("Agosto", 33.2);
        madrid.put("Octubre", 15.0);
        registroClima.put("Madrid", madrid);

        Map<String, Double> londres = new HashMap<>();
        londres.put("Enero", 2.1);
        londres.put("Agosto", 22.5);
        londres.put("Octubre", 11.3);
        registroClima.put("Londres", londres);

        Map<String, Double> sevilla = new HashMap<>();
        sevilla.put("Enero", 10.5);
        sevilla.put("Agosto", 38.9);
        sevilla.put("Octubre", 20.1);
        registroClima.put("Sevilla", sevilla);

        // TODO 1: Calcula la temperatura media anual de cada ciudad.
        // Devuelve: Ciudad -> Temperatura Media
        System.out.println(getMediaAnualPorCiudad(registroClima));

        // TODO 2: OJO AQUÍ. Para cada ciudad, quiero saber en qué MES hizo más calor.
        // Devuelve: Ciudad -> Nombre del Mes más caluroso. Tienes que cruzar la clave externa con la clave interna.
        System.out.println(getMesMasCalurosoPorCiudad(registroClima));

        // TODO 3: Encuentra la temperatura más baja registrada en cualquier ciudad en todo el año (solo el número).
        System.out.println(getTemperaturaMinimaAbsoluta(registroClima));
    }

    public static Map<String, Double> getMediaAnualPorCiudad(Map<String, Map<String, Double>> registro) { return null; }
    public static Map<String, String> getMesMasCalurosoPorCiudad(Map<String, Map<String, Double>> registro) { return null; }
    public static Double getTemperaturaMinimaAbsoluta(Map<String, Map<String, Double>> registro) { return 0.0; }
}

