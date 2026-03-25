package ejerciciosCasa.e10Ciberseguridad;


import java.util.*;

public class AnalizadorCiberseguridad {

    public static void main(String[] args) {
        // 1. DATOS INICIALES COMPLEJOS (Vuelco de red con duplicados)
        List<Log> logsBrutos = new ArrayList<>(Arrays.asList(
                new LogRed(101, "192.168.1.1", "Servidores"),
                new LogRed(102, "10.0.0.5", "Oficinas"),
                new LogRed(101, "192.168.1.1", "Servidores"), // Duplicado
                new LogCamara(201, "172.16.0.10", "Parking", "4K"),
                new LogRed(103, "192.168.1.1", "Servidores"),
                new LogCamara(202, "172.16.0.11", "Parking", "1080p"),
                new LogRed(104, "10.0.0.5", "Oficinas"),
                new LogCamara(201, "172.16.0.10", "Parking", "4K") // Duplicado
        ));

        // Diccionario de Riesgo por Zona
        Map<String, String> nivelRiesgoZona = new HashMap<>();
        nivelRiesgoZona.put("Servidores", "CRÍTICO");
        nivelRiesgoZona.put("Oficinas", "MEDIO");
        nivelRiesgoZona.put("Parking", "BAJO");

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Eliminar duplicados usando un Set
        Set<Log> logsUnicos = new HashSet<>(logsBrutos);
        System.out.println("Logs únicos detectados: " + logsUnicos.size());

        // T2: Mapa de frecuencia de IPs (¿Qué IP ataca más?)
        Map<String, Integer> ataquesPorIP = new HashMap<>();
        // TODO: Rellenar el mapa: IP -> Cantidad de apariciones


        // T3: Agrupar Logs únicos por NIVEL DE RIESGO (Map de Listas)
        // Ejemplo: "CRÍTICO" -> [Log101, Log103], "MEDIO" -> [Log102, Log104]
        Map<String, List<Log>> reporteRiesgo = new HashMap<>();
        // TODO: Iterar logsUnicos, obtener riesgo de 'nivelRiesgoZona' y agrupar


        // T4: Extraer IDs de cámaras que necesitan revisión (Solo si son LogCamara)
        Set<Integer> idsRevisionVisual = new TreeSet<>(); // TreeSet para que salgan ordenados
        // TODO: Usar instanceof y casting para filtrar solo LogCamara e insertar sus IDs


        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n--- Informe Final de CiberSegurÁvila ---");
        System.out.println("Ataques por IP: " + ataquesPorIP);
        System.out.println("Reporte por Riesgo: " + reporteRiesgo);
        System.out.println("IDs Cámaras a revisar (Ordenadas): " + idsRevisionVisual);
    }

}
