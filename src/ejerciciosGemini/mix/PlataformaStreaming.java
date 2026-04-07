package ejerciciosGemini.mix;

import java.util.*;

public class PlataformaStreaming {

    public static void main(String[] args) {

        // Catálogo: Clave = Género, Valor = Lista de títulos de series
        Map<String, List<String>> catalogoSeries = new HashMap<>();

        catalogoSeries.put("Ciencia Ficción", new ArrayList<>(Arrays.asList("Stranger Things", "Dark", "Black Mirror")));
        catalogoSeries.put("Comedia", new ArrayList<>(Arrays.asList("The Office", "Friends", "Brooklyn Nine-Nine")));
        catalogoSeries.put("Drama", new ArrayList<>(Arrays.asList("Breaking Bad", "Peaky Blinders", "The Crown")));
        catalogoSeries.put("Fantasía", new ArrayList<>(Arrays.asList("The Witcher", "Game of Thrones")));

        // Historial de un usuario: Lista de series que ha visto
        List<String> historialUsuario1 = new ArrayList<>(Arrays.asList(
                "Dark", "The Office", "Black Mirror", "Peaky Blinders", "Stranger Things"
        ));

        // PRUEBAS DE LOS MÉTODOS

        // Ejercicio 1
        System.out.println("Series de Comedia: " +
                obtenerCantidadSeriesPorGenero(catalogoSeries, "Comedia"));
        System.out.println("Series de Terror (no existe): " +
                obtenerCantidadSeriesPorGenero(catalogoSeries, "Terror"));

        // Ejercicio 2
        System.out.println("El género de 'Breaking Bad' es: " +
                buscarGeneroDeSerie(catalogoSeries, "Breaking Bad"));

        // Ejercicio 3
        System.out.println("Perfil de géneros del usuario: " +
                generarPerfilGeneros(catalogoSeries, historialUsuario1));
    }

    /**
     * EJERCICIO 1
     * Devuelve el número de series que hay en el género especificado.
     * DEBES usar el método .get() del Map.
     * Si el género no existe en el catálogo, debe devolver 0 (sin lanzar NullPointerException).
     */
    public static int obtenerCantidadSeriesPorGenero(Map<String, List<String>> catalogo, String generoBuscado) {
        // TODO: Implementar
         int numeroSeries = 0;
         if (catalogo.containsKey(generoBuscado)){
             for (List<String> series : catalogo.values()){
                 numeroSeries = series.size();
             }
         }

        return numeroSeries;
    }

    /**
     * EJERCICIO 2
     * Busca en todo el catálogo a qué género pertenece la serie indicada.
     * Iterarás sobre el Map y sobre las Listas internas.
     * Devuelve el nombre del género, o "Desconocido" si la serie no está en el catálogo.
     */
    public static String buscarGeneroDeSerie(Map<String, List<String>> catalogo, String tituloSerie) {
        // TODO: Implementar

        String genero = "Desconocido";

        for (Map.Entry<String, List<String>> mapa : catalogo.entrySet()){
            String nombreGenero = mapa.getKey();
            List<String> listadoSerie = mapa.getValue();

            if (listadoSerie.contains(tituloSerie)){
                genero = nombreGenero;
            }
        }

        return genero;
    }

    /**
     * EJERCICIO 3 (El más complejo)
     * Recibe el catálogo y el historial de series vistas por un usuario.
     * Debe devolver un nuevo Map donde la clave sea el Género y el valor la cantidad de series
     * de ese género que el usuario ha visto.
     * * Ejemplo esperado con los datos de arriba: {"Ciencia Ficción"=3, "Comedia"=1, "Drama"=1}
     * Pista: Necesitarás combinar tu solución del Ejercicio 2 y el uso de .getOrDefault()
     */
    public static Map<String, Integer> generarPerfilGeneros(Map<String, List<String>> catalogo, List<String> historial) {
        // TODO: Implementar

        Map<String, Integer> generoCantidad = new HashMap<>();

        // Recorremos las series que el usuario HA VISTO
        for (String serie : historial) {
            // Usamos el método del Ejercicio 2 para saber su género
            String genero = buscarGeneroDeSerie(catalogo, serie);

            // Si la serie existe en el catálogo, la contamos
            if (!genero.equals("Desconocido")) {
                // getOrDefault busca cuántas llevamos de ese género. Si no hay, devuelve 0. Le sumamos 1.
                generoCantidad.put(genero, generoCantidad.getOrDefault(genero, 0) + 1);
            }
        }

        return generoCantidad;
    }
}