package ejerciciosGemini.map.e03SimilarVuelos;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProyectosEmpresa {

    public static void main(String[] args) {

        // Mapa principal: Proyecto -> (Programador -> Horas)
        Map<String, Map<String, Double>> registroProyectos = new HashMap<>();

        // 1. Datos del proyecto "App Bancaria"
        Map<String, Double> equipoApp = new HashMap<>();
        equipoApp.put("DEV-001", 120.5);
        equipoApp.put("DEV-002", 85.0);
        equipoApp.put("DEV-003", 40.5);
        registroProyectos.put("App Bancaria", equipoApp);

        // 2. Datos del proyecto "Web E-commerce"
        Map<String, Double> equipoWeb = new HashMap<>();
        equipoWeb.put("DEV-004", 65.0);
        equipoWeb.put("DEV-001", 30.0); // REPETIDO: DEV-001 también está en la App
        equipoWeb.put("DEV-005", 110.5);
        registroProyectos.put("Web E-commerce", equipoWeb);

        // 3. Datos del proyecto "Migración Servidores"
        Map<String, Double> equipoMigracion = new HashMap<>();
        equipoMigracion.put("DEV-002", 55.0); // REPETIDO
        equipoMigracion.put("DEV-006", 200.0);
        equipoMigracion.put("DEV-007", 15.5);
        equipoMigracion.put("DEV-001", 10.0); // REPETIDO: Tercer proyecto para DEV-001
        registroProyectos.put("Migración Servidores", equipoMigracion);

        // 4. Datos del proyecto "API Externa"
        Map<String, Double> equipoApi = new HashMap<>();
        equipoApi.put("DEV-008", 95.0);
        equipoApi.put("DEV-005", 45.0); // REPETIDO
        registroProyectos.put("API Externa", equipoApi);

        // --- ZONA DE IMPRESIÓN (No tocar) ---

        System.out.println("1. Proyectos activos en la empresa:");
        System.out.println(getNombresProyectos(registroProyectos));

        System.out.printf("\n2. El pico máximo de horas de un programador en un solo proyecto es: %.1f horas%n",
                getMaximasHorasAsignadas(registroProyectos));

        System.out.println("\n3. Media de horas trabajadas por persona en CADA proyecto:");
        System.out.println(getMediaHorasPorProyecto(registroProyectos));

        System.out.println("\n4. Total de horas acumuladas por CADA programador (sumando todos sus proyectos):");
        System.out.println(getTotalHorasPorProgramador(registroProyectos));
    }

    // =====================================================================
    // ZONA DE TRABAJO
    // =====================================================================

    // EJERCICIO 1: Devuelve un Set con los nombres de todos los proyectos
    public static Set<String> getNombresProyectos(Map<String, Map<String, Double>> proyectos) {

        return proyectos.keySet();
    }

    // EJERCICIO 2: Busca en toda la empresa el valor de horas más alto registrado (un solo `Double`)
    public static Double getMaximasHorasAsignadas(Map<String, Map<String, Double>> proyectos) {

        double horasMaximas = 0;

        for (Map<String, Double> programador : proyectos.values()){
            for (Double horas : programador.values()){
                if (horas > horasMaximas){
                    horasMaximas = horas;
                }
            }
        }

        return horasMaximas;
    }

    // EJERCICIO 3: Calcula la media de horas de los programadores de CADA proyecto.
    // Devuelve un Map donde la clave sea el Proyecto y el valor su media de horas.
    public static Map<String, Double> getMediaHorasPorProyecto(Map<String, Map<String, Double>> proyectos) {

        Map<String, Double> mediaHoras = new HashMap<>();

        for(String proyecto : proyectos.keySet()){

            Map<String, Double> programadoresHoras = proyectos.get(proyecto);
            Double precio = 0.0;
            for(Double horas : programadoresHoras.values() ){
                precio += horas;
            }
            Double precioMedio = precio/programadoresHoras.size();

            mediaHoras.put(proyecto, precioMedio);
        }

        return mediaHoras;
    }

    // EJERCICIO 4: Calcula cuántas horas en total ha trabajado cada Programador en toda la empresa.
    // Devuelve un Map donde la clave sea el ID del Programador y el valor la suma de sus horas.
    public static Map<String, Double> getTotalHorasPorProgramador(Map<String, Map<String, Double>> proyectos) {

        Map<String, Double> horasTotalesPorProgramador = new HashMap<>();
/*
        for(String proyecto : proyectos.keySet()){

            Map<String, Double> programadorHoras = proyectos.get(proyecto);

            for (String programador : programadorHoras.keySet()){

                Double horasTrabajadas = programadorHoras.get(programador);

                if(horasTotalesPorProgramador.containsKey(programador)){
                    double horasAcumuladas = horasTotalesPorProgramador.get(programador);
                    horasTrabajadas += horasAcumuladas;
                    horasTotalesPorProgramador.put(programador, horasTrabajadas);
                } else {
                    horasTotalesPorProgramador.put(programador, horasTrabajadas);
                }
            }
        }

 */
        for(String proyecto : proyectos.keySet()){

            Map <String, Double> programadorHoras = proyectos.get(proyecto);

            for (String idProgramador : programadorHoras.keySet()){

                Double horasTrabajadas = programadorHoras.get(idProgramador);

                if (horasTotalesPorProgramador.containsKey(idProgramador)){
                    double horasAcumuladas = horasTotalesPorProgramador.get(idProgramador);
                    horasTrabajadas += horasAcumuladas;
                    horasTotalesPorProgramador.put(idProgramador, horasTrabajadas);
                } else {
                    horasTotalesPorProgramador.put(idProgramador, horasTrabajadas);
                }
            }

        }


        return horasTotalesPorProgramador;
    }
}