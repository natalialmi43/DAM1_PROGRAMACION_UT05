package ejerciciosGemini.mix.gestorLogistica;

import java.util.*;

public class GestorLogistica {

    public static void main(String[] args) {
        // 1. DATOS INICIALES (Volcado del escáner del almacén con lecturas duplicadas)
        List<Paquete> enviosBrutos = new ArrayList<>(Arrays.asList(
                new PaqueteEstandar(1001, "Madrid", "En Reparto"),
                new PaqueteRefrigerado(2001, "Barcelona", "Almacén", -18.5),
                new PaqueteEstandar(1001, "Madrid", "En Reparto"), // Lectura Duplicada
                new PaqueteEstandar(1002, "Valencia", "Entregado"),
                new PaqueteRefrigerado(2002, "Sevilla", "En Reparto", 4.0),
                new PaqueteEstandar(1003, "Madrid", "Almacén"),
                new PaqueteRefrigerado(2001, "Barcelona", "Almacén", -18.5) // Lectura Duplicada
        ));

        // Diccionario de prioridad por estado del paquete
        Map<String, String> prioridadPorEstado = new HashMap<>();
        prioridadPorEstado.put("Almacén", "ALTA");
        prioridadPorEstado.put("En Reparto", "MEDIA");
        prioridadPorEstado.put("Entregado", "BAJA");

        // --- INICIO DE TAREAS ---

        // TAREA 1: Limpiar lecturas duplicadas usando un Set
        Set<Paquete> enviosUnicos = new HashSet<>(enviosBrutos);
        System.out.println("Paquetes reales a procesar: " + enviosUnicos.size());


        // TAREA 2: Mapa de frecuencia de destinos (¿A qué ciudad van más paquetes?)
        Map<String, Integer> enviosPorCiudad = new HashMap<>();
        // TODO: Rellenar el mapa: Ciudad -> Número de paquetes que van a esa ciudad
        for ( Paquete paquete : enviosUnicos){
            String destino = paquete.getDestino();
            Integer contador = enviosPorCiudad.getOrDefault(destino, 0) +1;

            enviosPorCiudad.put(destino, contador);
        }


        // TAREA 3: Agrupar los paquetes únicos por su NIVEL DE PRIORIDAD (Map de Listas)
        // Ejemplo: "ALTA" -> [Paquete2001, Paquete1003], "MEDIA" -> [Paquete1001, Paquete2002]

        Map<String, List<Paquete>> reportePrioridades = new HashMap<>();
        // TODO: Iterar enviosUnicos, obtener la prioridad de 'prioridadPorEstado' usando el estado del paquete, y agrupar.

        for ( Paquete paquete : enviosUnicos){
            String destino = paquete.getDestino();
            String prioridad = prioridadPorEstado.get(destino);

            List<Paquete> paquetesAgrupados = reportePrioridades.getOrDefault(prioridad, new ArrayList<>());

            paquetesAgrupados.add(paquete);

            reportePrioridades.put(prioridad,paquetesAgrupados);
        }


        // TAREA 4: Extraer IDs de los paquetes REFRIGERADOS que están en "Almacén"
        // Necesitamos que los IDs salgan ordenados de menor a mayor.
        Set<Integer> idsRefrigeradosCriticos = new TreeSet<>();
        // TODO: Usar instanceof para detectar 'PaqueteRefrigerado', comprobar su estado e insertar su ID.

        for ( Paquete paquete : enviosUnicos) {
            if (paquete instanceof PaqueteRefrigerado){
                idsRefrigeradosCriticos.add(paquete.getId());
            }

        }



        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n--- Informe de Operativa Diaria ---");
        System.out.println("Volumen por ciudad: " + enviosPorCiudad);
        System.out.println("Reporte de prioridades: " + reportePrioridades);
        System.out.println("IDs Refrigerados en Almacén (Ordenados): " + idsRefrigeradosCriticos);
    }
}