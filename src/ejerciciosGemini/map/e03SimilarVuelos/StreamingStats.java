package ejerciciosGemini.map.e03SimilarVuelos;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamingStats {

    public static void main(String[] args) {
        // Estructura: Map<Plataforma, Map<EmailUsuario, HorasVistas>>
        Map<String, Map<String, Double>> visualizaciones = new HashMap<>();

        // Datos de Netflix
        Map<String, Double> netflix = new HashMap<>();
        netflix.put("juan@mail.com", 45.5);
        netflix.put("ana@mail.com", 60.2);
        netflix.put("luis@mail.com", 12.0);
        visualizaciones.put("Netflix", netflix);

        // Datos de HBO Max
        Map<String, Double> hbo = new HashMap<>();
        hbo.put("ana@mail.com", 25.0); // Ana también ve HBO
        hbo.put("carlos@mail.com", 40.5);
        hbo.put("juan@mail.com", 10.5); // Juan también ve HBO
        visualizaciones.put("HBO Max", hbo);

        // Datos de Amazon Prime
        Map<String, Double> prime = new HashMap<>();
        prime.put("luis@mail.com", 5.5);  // Luis también ve Prime
        prime.put("elena@mail.com", 18.0);
        prime.put("ana@mail.com", 30.0);  // Ana está en las 3 plataformas
        visualizaciones.put("Amazon Prime", prime);


        // TODO 1 - Generar un Set con los nombres de todas las plataformas registradas
        System.out.println("Plataformas: " + getPlataformas(visualizaciones));

        // TODO 2 - Mostrar el registro individual de horas más alto (independientemente del usuario o plataforma)
        System.out.printf("El récord de horas en un solo registro es: %.2f %n", getMaximasHoras(visualizaciones));

        // TODO 3 - Crear un Map donde la clave sea la plataforma y el valor sea la media de horas vistas por sus usuarios
        System.out.println("Media de horas por plataforma: " + getMediaPorPlataforma(visualizaciones));

        // TODO 4 - Crear un Map donde la clave sea el email del usuario y el valor sea la SUMA TOTAL de sus horas en todas las plataformas juntas
        System.out.println("Horas totales por usuario: " + getHorasTotalesPorUsuario(visualizaciones));
    }

    public static Set<String> getPlataformas(Map<String, Map<String, Double>> datos) {
        // Tu código aquí
        return datos.keySet();
    }

    public static Double getMaximasHoras(Map<String, Map<String, Double>> datos) {
        Double horasMaximas = 0.0;

        for (Map<String, Double> mapaUsuarioHoras : datos.values()){
            for (Double horasVistas : mapaUsuarioHoras.values()){
                if( horasVistas > horasMaximas){
                    horasMaximas = horasVistas;
                }
            }
        }

        return horasMaximas;
    }

    public static Map<String, Double> getMediaPorPlataforma(Map<String, Map<String, Double>> datos) {

        Map<String, Double> precioMedioPorPlataforma = new HashMap<>();

        for (Map.Entry<String, Map<String, Double>> mapaCompleto : datos.entrySet()){
            String idPlataforma = mapaCompleto.getKey();
            Map<String, Double> personaHorasVistas = mapaCompleto.getValue();
            Double acumuladoHorasPorPlataforma = 0.0;
             for (Double horasVistas : personaHorasVistas.values()){
                 acumuladoHorasPorPlataforma += horasVistas;
             }
             Double media = acumuladoHorasPorPlataforma/personaHorasVistas.size();

            precioMedioPorPlataforma.put(idPlataforma, media);
        }

        return precioMedioPorPlataforma;
    }

    public static Map<String, Double> getHorasTotalesPorUsuario(Map<String, Map<String, Double>> datos) {
        // TODO 4 - Crear un Map donde la clave sea el email del usuario y el valor sea la SUMA TOTAL de sus horas en todas las plataformas juntas

        Map<String, Double> horasPorUsuario = new HashMap<>();

        for (Map<String, Double> mapaUsuarioHoras : datos.values()){

            for (Map.Entry<String, Double> datosUsuariosHoras : mapaUsuarioHoras.entrySet()){
                String usuario = datosUsuariosHoras.getKey();
                Double horas = datosUsuariosHoras.getValue();

                Double horasAcumuladas = horasPorUsuario.getOrDefault(usuario, 0.0);

                horasPorUsuario.put(usuario, horas + horasAcumuladas);
            }
        }

        return horasPorUsuario;
    }
}

