package ejerciciosGemini.map.e04SimilaresCiberseguridad.e01ejerciciosGemini.map.e04SimilaresCiberseguridad.e01DeteccionFraude;

import java.util.*;

public class DetectorFraude {

    public static void main(String[] args) {
        // 1. DATASET INICIAL
        // Cada mapa es una transacción: {id_tx, usuario, metodo_pago, sospechoso}
        List<Map<String, Object>> transacciones = new ArrayList<>();

        transacciones.add(new HashMap<>(Map.of("id", 101, "usuario", "UserA", "metodo", "Tarjeta", "sospechoso", true)));
        transacciones.add(new HashMap<>(Map.of("id", 102, "usuario", "UserB", "metodo", "Transferencia", "sospechoso", false)));
        transacciones.add(new HashMap<>(Map.of("id", 101, "usuario", "UserA", "metodo", "Tarjeta", "sospechoso", true))); // DUPLICADO
        transacciones.add(new HashMap<>(Map.of("id", 103, "usuario", "UserA", "metodo", "Cripto", "sospechoso", true)));
        transacciones.add(new HashMap<>(Map.of("id", 104, "usuario", "UserC", "metodo", "Tarjeta", "sospechoso", true)));
        transacciones.add(new HashMap<>(Map.of("id", 105, "usuario", "UserC", "metodo", "Tarjeta", "sospechoso", true)));
        transacciones.add(new HashMap<>(Map.of("id", 106, "usuario", "UserA", "metodo", "Cripto", "sospechoso", true)));

        // Diccionario de Límites (Usuario -> Máximo de transacciones sospechosas permitidas antes del bloqueo)
        Map<String, Integer> limitesFraude = Map.of(
                "UserA", 2,
                "UserB", 1,
                "UserC", 3
        );

        // --- INICIO DE TRANSFORMACIONES ---

        // T1: Limpieza de Duplicados
        Set<Map<String, Object>> txUnicas = new HashSet<>(transacciones);

        // T2: Agrupación Anidada: Usuario -> { MetodoPago -> Conteo de Sospechosos }
        // Solo procesar si "sospechoso" es true.
        Map<String, Map<String, Integer>> mapaSospechas = new HashMap<>();
        // TODO: Rellenar mapaSospechas. Ejemplo: "UserA" -> {"Tarjeta": 1, "Cripto": 2}

        // T3: Detección de Cuentas a Bloquear (List)
        // Si el total de sospechas de un usuario en 'mapaSospechas' > limite en 'limitesFraude'
        List<String> cuentasBloqueadas = new ArrayList<>();
        // TODO: Recorrer mapaSospechas, sumar sus valores y comparar con limitesFraude

        // T4: Ranking de Métodos de Pago Usados en Fraudes (Map)
        Map<String, Integer> frecuenciaMetodos = new TreeMap<>();
        // TODO: Contar cuántas veces aparece cada "metodo" en las transacciones únicas sospechosas

        // --- SALIDA DE RESULTADOS ---
        System.out.println("Transacciones únicas: " + txUnicas.size());
        System.out.println("Mapa de Sospechas: " + mapaSospechas);
        System.out.println("CUENTAS BLOQUEADAS: " + cuentasBloqueadas);
        System.out.println("Frecuencia de Métodos de Pago: " + frecuenciaMetodos);
    }
}
