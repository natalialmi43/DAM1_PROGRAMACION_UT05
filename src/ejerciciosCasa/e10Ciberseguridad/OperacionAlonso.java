package ejerciciosCasa.e10Ciberseguridad;

import java.util.*;

public class OperacionAlonso {
    public static void main(String[] args) {
        // 1. DATASET INICIAL (Simulación de JSON/NoSQL)
        // Cada mapa representa un evento: {id, zona, tipo, autorizado}
        List<Map<String, Object>> eventosBrutos = new ArrayList<>();

        eventosBrutos.add(new HashMap<>(Map.of("id", 1, "zona", "Almacen", "tipo", "Puerta", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 2, "zona", "Servidores", "tipo", "Login", "autorizado", true)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 1, "zona", "Almacen", "tipo", "Puerta", "autorizado", false))); // DUPLICADO
        eventosBrutos.add(new HashMap<>(Map.of("id", 3, "zona", "Servidores", "tipo", "Login", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 4, "zona", "Oficinas", "tipo", "Wifi", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 3, "zona", "Servidores", "tipo", "Login", "autorizado", false))); // DUPLICADO
        eventosBrutos.add(new HashMap<>(Map.of("id", 5, "zona", "Servidores", "tipo", "Login", "autorizado", false)));
        eventosBrutos.add(new HashMap<>(Map.of("id", 6, "zona", "Almacen", "tipo", "CajaFuerte", "autorizado", false)));

        // Diccionario de Límites (Zona -> Intentos fallidos permitidos)
        Map<String, Integer> limitesZona = Map.of(
                "Servidores", 1,
                "Almacen", 2,
                "Oficinas", 5
        );

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Limpieza de Duplicados (Set de Mapas)
        // Al ser Mapas, el Set compara si tienen las mismas llaves y valores
        Set<Map<String, Object>> eventosUnicos = new HashSet<>(eventosBrutos);


        // T2: Agrupación Anidada: Zona -> { TipoAcceso -> Conteo de Fallos }
        // Solo procesar si "autorizado" es false.
        Map<String, Map<String, Integer>> mapaFallos = new HashMap<>();
        // TODO: Rellenar mapaFallos. Ejemplo: "Servidores" -> {"Login": 2}


        // T3: Detección de Brechas de Seguridad (List)
        // Si el total de fallos de una zona en 'mapaFallos' > limite en 'limitesZona'
        List<String> zonasComprometidas = new ArrayList<>();
        // TODO: Recorrer mapaFallos, sumar sus valores y comparar con limitesZona


        // T4: Ranking de Tipos de Ataque (Map)
        // Queremos saber qué 'tipo' es el más usado en los fallos (conteo global)
        Map<String, Integer> frecuenciaTipos = new TreeMap<>();
        // TODO: Contar cuántas veces aparece cada "tipo" en los eventos fallidos únicos


        // --- SALIDA DE RESULTADOS ---
        System.out.println("Eventos únicos procesados: " + eventosUnicos.size());
        System.out.println("Mapa de Fallos: " + mapaFallos);
        System.out.println("ZONAS COMPROMETIDAS: " + zonasComprometidas);
        System.out.println("Frecuencia de Tipos de Ataque: " + frecuenciaTipos);
    }
}
