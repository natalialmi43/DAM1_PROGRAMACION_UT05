package ejerciciosGemini.map.e04SimilaresCiberseguridad.e01ejerciciosGemini.map.e04SimilaresCiberseguridad.e02ControlAccesosLaboratorio;


import java.util.*;

public class AuditoriaAccesos {
    public static void main(String[] args) {
        // 1. DATOS INICIALES (Con duplicados)
        List<Fichaje> fichajesBrutos = new ArrayList<>(Arrays.asList(
                new FichajeTarjeta(1, "Ana", "I+D", false),
                new FichajeBiometrico(2, "Luis", "Servidores", "Indice_Derecho"),
                new FichajeTarjeta(1, "Ana", "I+D", false), // Duplicado
                new FichajeTarjeta(3, "Carlos", "Mantenimiento", true),
                new FichajeBiometrico(4, "Ana", "Servidores", "Pulgar_Derecho"),
                new FichajeTarjeta(5, "Luis", "I+D", false)
        ));

        // Diccionario de Niveles de Acceso por Departamento
        Map<String, String> nivelAccesoDept = new HashMap<>();
        nivelAccesoDept.put("Servidores", "NIVEL_3");
        nivelAccesoDept.put("I+D", "NIVEL_2");
        nivelAccesoDept.put("Mantenimiento", "NIVEL_1");

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Eliminar duplicados usando un Set
        Set<Fichaje> fichajesUnicos = new HashSet<>(fichajesBrutos);
        // TODO: Imprimir el tamaño para verificar que se eliminó el ID 1 duplicado.

        // T2: Mapa de frecuencia por Empleado (¿Cuántas veces ha fichado cada uno?)
        Map<String, Integer> fichajesPorEmpleado = new HashMap<>();
        // TODO: Rellenar el mapa: Empleado -> Cantidad de fichajes

        // T3: Agrupar Fichajes únicos por NIVEL DE ACCESO (Map de Listas)
        Map<String, List<Fichaje>> reportePorNivel = new HashMap<>();
        // TODO: Iterar fichajesUnicos, obtener el nivel de 'nivelAccesoDept' y agruparlos

        // T4: Extraer IDs de FichajesBiometricos para auditoría manual
        Set<Integer> idsAuditoriaBiometrica = new TreeSet<>();
        // TODO: Usar instanceof y casting para filtrar solo FichajeBiometrico e insertar sus IDs

        // --- SALIDA DE RESULTADOS ---
        System.out.println("Fichajes por empleado: " + fichajesPorEmpleado);
        System.out.println("Reporte por Nivel de Acceso: " + reportePorNivel);
        System.out.println("IDs Biométricos a auditar (Ordenados): " + idsAuditoriaBiometrica);
    }

    /*
    public static void main(String[] args) {
        // 1. DATOS INICIALES (Con duplicados intencionales)
        List<Fichaje> fichajesBrutos = new ArrayList<>(Arrays.asList(
                new FichajeTarjeta(1, "Ana", "I+D", false),
                new FichajeBiometrico(2, "Luis", "Servidores", "Indice_Derecho"),
                new FichajeTarjeta(1, "Ana", "I+D", false), // Duplicado exacto de ID
                new FichajeTarjeta(3, "Carlos", "Mantenimiento", true),
                new FichajeBiometrico(4, "Ana", "Servidores", "Pulgar_Derecho"),
                new FichajeTarjeta(5, "Luis", "I+D", false)
        ));

        // Diccionario de Niveles de Acceso por Departamento
        Map<String, String> nivelAccesoDept = new HashMap<>();
        nivelAccesoDept.put("Servidores", "NIVEL_3");
        nivelAccesoDept.put("I+D", "NIVEL_2");
        nivelAccesoDept.put("Mantenimiento", "NIVEL_1");

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Eliminar duplicados usando un Set
        Set<Fichaje> fichajesUnicos = new HashSet<>(fichajesBrutos);
        System.out.println("Fichajes procesados inicialmente: " + fichajesBrutos.size());
        System.out.println("Fichajes únicos tras eliminar duplicados: " + fichajesUnicos.size());

        // Inicialización de estructuras para T2, T3 y T4
        Map<String, Integer> fichajesPorEmpleado = new HashMap<>();
        Map<String, List<Fichaje>> reportePorNivel = new HashMap<>();
        Set<Integer> idsAuditoriaBiometrica = new TreeSet<>(); // TreeSet los mantendrá ordenados

        // Procesamiento en un solo bucle para mayor eficiencia
        for (Fichaje f : fichajesUnicos) {

            // T2: Mapa de frecuencia por Empleado
            // getOrDefault busca al empleado; si no existe, devuelve 0. Luego suma 1.
            fichajesPorEmpleado.put(f.empleado, fichajesPorEmpleado.getOrDefault(f.empleado, 0) + 1);

            // T3: Agrupar Fichajes únicos por NIVEL DE ACCESO
            String nivel = nivelAccesoDept.get(f.departamento);
            if (nivel != null) {
                // putIfAbsent asegura que haya una lista vacía creada antes de intentar hacer .add()
                reportePorNivel.putIfAbsent(nivel, new ArrayList<>());
                reportePorNivel.get(nivel).add(f);
            }

            // T4: Extraer IDs de FichajesBiometricos para auditoría manual
            if (f instanceof FichajeBiometrico) {
                idsAuditoriaBiometrica.add(f.idFichaje);
            }
        }

        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n--- RESULTADOS DE LA AUDITORÍA ---");
        System.out.println("Fichajes por empleado: " + fichajesPorEmpleado);
        System.out.println("Reporte por Nivel de Acceso: ");
        for (Map.Entry<String, List<Fichaje>> entry : reportePorNivel.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("IDs Biométricos a auditar (Ordenados): " + idsAuditoriaBiometrica);
    }
     */
}
