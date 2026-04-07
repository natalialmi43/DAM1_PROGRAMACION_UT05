package ejerciciosGemini.map.e05SimiarRepasoHotel;

import java.util.HashMap;
import java.util.Map;

public class GestionGimnasio {

    public static void main(String[] args) {
        // 1. Tarifas por sesión (Actividad -> Precio por sesión)
        Map<String, Double> tarifas = new HashMap<>();
        tarifas.put("Yoga", 12.0);
        tarifas.put("Spinning", 8.5);
        tarifas.put("Boxeo", 15.0);
        tarifas.put("Zumba", 7.0);

        // 2. Registro de asistencia (Nombre Socio -> {Actividad: Sesiones al mes})
        Map<String, Map<String, Integer>> asistencias = new HashMap<>();

        // Socio "Juan": 4 sesiones de Yoga y 2 de Boxeo
        asistencias.put("Juan", Map.of("Yoga", 4, "Boxeo", 2));

        // Socio "Ana": 8 sesiones de Spinning y 4 de Zumba
        asistencias.put("Ana", Map.of("Spinning", 8, "Zumba", 4));

        // Socio "Luis": 10 sesiones de Yoga
        asistencias.put("Luis", Map.of("Yoga", 10));

        System.out.println("--- Generando Recibos Mensuales ---");
        Map<String, Double> recibos = calcularRecibos(asistencias, tarifas);
        System.out.println("Recibos por socio: " + recibos);

        System.out.println("--- Informe de Popularidad ---");
        Map<String, Integer> popularidad = calcularSesionesTotalesPorActividad(asistencias);
        System.out.println("Total sesiones por actividad: " + popularidad);
    }

    /**
     * TAREA 1: Calcula cuánto debe pagar cada socio.
     * Recorre los socios, mira sus actividades, busca el precio en 'tarifas'
     * y acumula el total para ese socio.
     */
    public static Map<String, Double> calcularRecibos(Map<String, Map<String, Integer>> asistencias, Map<String, Double> tarifas) {
        Map<String, Double> resultado = new HashMap<>();

        // --- TU CÓDIGO AQUÍ ---
        // Pista: Usa entrySet() para el mapa externo y el interno.
        // No olvides usar getOrDefault para acumular el dinero en 'resultado'.

        for ( Map.Entry<String, Map<String, Integer>> datos : asistencias.entrySet()){

            String socio = datos.getKey();
            Map<String, Integer> mapaActividadSesiones = datos.getValue();

            for (Map.Entry<String, Integer> actividadSesiones : mapaActividadSesiones.entrySet()){
                String actividad = actividadSesiones.getKey();
                Integer sesiones = actividadSesiones.getValue();

                Double precioActividad = tarifas.get(actividad);

                double precio = precioActividad * sesiones;

                Double acumulado = resultado.getOrDefault(socio, 0.00);

                resultado.put(socio, precio + acumulado);
            }

        }

        return resultado;
    }

    /**
     * TAREA 2: Queremos saber cuántas sesiones en total se han impartido de cada actividad.
     * (Ej: Sumar todas las sesiones de Yoga de todos los socios).
     */
    public static Map<String, Integer> calcularSesionesTotalesPorActividad(Map<String, Map<String, Integer>> asistencias) {
        Map<String, Integer> totales = new HashMap<>();

        // --- TU CÓDIGO AQUÍ ---
        // Pista: Aquí el nombre del socio no importa, puedes usar asistencias.values().

        for (Map<String, Integer> mapa : asistencias.values()){
            for (Map.Entry<String, Integer> actividadSesiones : mapa.entrySet()){
                String actividad = actividadSesiones.getKey();
                Integer sesiones = actividadSesiones.getValue();

                Integer sesionesTotales = totales.getOrDefault(actividad,0) + sesiones;

                totales.put(actividad, sesionesTotales);
            }
        }

        return totales;
    }
}
