package ejerciciosGemini.map.e03SimilarVuelos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamingApp {

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> catalogo = new HashMap<>();

        Map<String, Integer> accion = new HashMap<>();
        accion.put("Mad Max", 500000);
        accion.put("John Wick", 800000);
        accion.put("Die Hard", 300000);
        catalogo.put("Accion", accion);

        Map<String, Integer> sciFi = new HashMap<>();
        sciFi.put("Matrix", 950000);
        sciFi.put("Dune", 600000);
        sciFi.put("Blade Runner", 250000);
        catalogo.put("SciFi", sciFi);

        // TODO 1: Calcula el total de visualizaciones sumando todas las películas de cada categoría.
        // Devuelve: Categoría -> Total Visualizaciones
        System.out.println(getVisualizacionesPorCategoria(catalogo));

        // TODO 2: Encuentra el TÍTULO exacto de la película más vista de toda la plataforma.
        System.out.println(getTituloMasVistoGlobal(catalogo));

        // TODO 3: Devuelve un Set con los títulos de las películas que no han superado las 400.000 visualizaciones (fracasos).
        System.out.println(getPeliculasFracaso(catalogo, 400000));
    }

    public static Map<String, Integer> getVisualizacionesPorCategoria(Map<String, Map<String, Integer>> catalogo) { return null; }
    public static String getTituloMasVistoGlobal(Map<String, Map<String, Integer>> catalogo) { return null; }
    public static Set<String> getPeliculasFracaso(Map<String, Map<String, Integer>> catalogo, int limite) { return null; }

}
