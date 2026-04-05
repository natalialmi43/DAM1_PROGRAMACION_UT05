package ejerciciosGemini.map.e03SimilarVuelos;

import java.util.*;

public class GestionHospitales {

    public static void main(String[] args) {
        // Mapa principal: Código de Hospital -> (DNI Médico -> Horas de guardia realizadas)
        Map<String, Map<String, Integer>> guardiasHospitales = new HashMap<>();

        // Hospital Central
        Map<String, Integer> medicosCentral = new HashMap<>();
        medicosCentral.put("11111111A", 45);
        medicosCentral.put("22222222B", 60);
        medicosCentral.put("33333333C", 30);
        guardiasHospitales.put("HOSP-CENTRAL", medicosCentral);

        // Hospital Norte
        Map<String, Integer> medicosNorte = new HashMap<>();
        medicosNorte.put("22222222B", 15); // Trabaja en varios
        medicosNorte.put("44444444D", 50);
        medicosNorte.put("55555555E", 25);
        guardiasHospitales.put("HOSP-NORTE", medicosNorte);

        // Hospital Sur
        Map<String, Integer> medicosSur = new HashMap<>();
        medicosSur.put("11111111A", 20); // Trabaja en varios
        medicosSur.put("55555555E", 40); // Trabaja en varios
        medicosSur.put("66666666F", 70);
        guardiasHospitales.put("HOSP-SUR", medicosSur);


        // 1. Obtener el hospital con mayor carga de trabajo
        System.out.println("Hospital con más horas: " + getHospitalConMasHorasTotales(guardiasHospitales));

        // 2. Obtener médicos que hacen guardias en más de un hospital
        System.out.println("Médicos pluriempleados: " + getMedicosMultihospital(guardiasHospitales));

        // 3. Invertir la estructura de datos
        System.out.println("Informe por médico: " + generarInformePorMedico(guardiasHospitales));

        // 4. Limpieza de datos (Mutación del mapa)
        eliminarRegistrosMenoresA(guardiasHospitales, 30);
        System.out.println("Mapa tras la limpieza: " + guardiasHospitales);
    }

    /**
     * Calcula el total de horas de cada hospital y devuelve el ID del hospital
     * que tenga la suma total más alta.
     */

    // Mapa principal: Código de Hospital -> (DNI Médico -> Horas de guardia realizadas)
    // Map<String, Map<String, Integer>> guardiasHospitales

    public static String getHospitalConMasHorasTotales(Map<String, Map<String, Integer>> guardias) {
        // TODO: Implementar
        // 1. Obtener el hospital con mayor carga de trabajo
        String hospitalConMayorCargaDeHoras = "Default";
        Integer contadorHoras = 0;
        Integer contadorHorasAnterior = 0;


        for (Map.Entry<String, Map<String, Integer>> completo : guardias.entrySet()){
            String nombreHospital = completo.getKey();
            Map<String, Integer> dniHoras = completo.getValue();

            for (Integer horas : dniHoras.values()){
                contadorHoras += horas;
            }
            if (contadorHoras > contadorHorasAnterior){
                hospitalConMayorCargaDeHoras = nombreHospital;
                contadorHorasAnterior = contadorHoras;
            }

        }

        return hospitalConMayorCargaDeHoras;
    }

    /**
     * Devuelve un Set con los DNI de los médicos que aparecen registrados
     * en 2 o más hospitales diferentes.
     */
    public static Set<String> getMedicosMultihospital(Map<String, Map<String, Integer>> guardias) {
        // TODO: Implementar
        // 2. Obtener médicos que hacen guardias en más de un hospital

        Set<String> medicosConGuardiasEnDiferentesHospitales = new HashSet<>();

        Map<String, Integer> contadorAuxiliar = new HashMap<>();



        for (Map<String, Integer> mapaInterno : guardias.values() ){


            for (String medicos : mapaInterno.keySet()){
                contadorAuxiliar.put(medicos, contadorAuxiliar.getOrDefault(medicos, 0)+1);
            }
        }

        // Ahora filtras los que tienen más de 1
        for (Map.Entry<String, Integer> registro : contadorAuxiliar.entrySet()) {
            if (registro.getValue() > 1) {
                medicosConGuardiasEnDiferentesHospitales.add(registro.getKey());
            }
        }

        return medicosConGuardiasEnDiferentesHospitales;

        /*
        Set<String> medicosVistos = new HashSet<>();
        Set<String> pluriempleados = new HashSet<>();

        for (Map<String, Integer> medicosDelHospital : guardias.values()) {
            for (String dniMedico : medicosDelHospital.keySet()) {
            // Si el set "medicosVistos" ya contenía el DNI, add() devuelve false.
            // Si devuelve false, significa que ya lo vimos en otro hospital.
                if (!medicosVistos.add(dniMedico)) {
                    pluriempleados.add(dniMedico);
            }
        }
    }

    return pluriempleados;
}
         */
    }

    /**
     * Reestructura completamente los datos.
     * Devuelve un nuevo Mapa donde la clave es el DNI del médico,
     * y el valor es otro Mapa con los hospitales en los que trabaja y las horas en cada uno.
     */
    public static Map<String, Map<String, Integer>> generarInformePorMedico(Map<String, Map<String, Integer>> guardias) {
        // TODO: Implementar
        // 3. Invertir la estructura de datos

        Map<String, Map<String, Integer>> estructuraCambiada = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> completo : guardias.entrySet()){
            String hospitales = completo.getKey();
            Map<String, Integer> dniHoras = completo.getValue();

            for (Map.Entry<String, Integer> mapaDniHoras : dniHoras.entrySet()){
                String dni = mapaDniHoras.getKey();
                Integer horas = mapaDniHoras.getValue();

                Map<String, Integer> aux = new HashMap<>();
                aux.put(hospitales, horas);


                estructuraCambiada.put(dni, aux);
            }
        }

        return estructuraCambiada;

    }

    /**
     * Modifica el mapa original pasado por parámetro.
     * Elimina a los médicos que hayan hecho estrictamente MENOS de "minimoHoras" en un hospital.
     * Si tras eliminar a los médicos, un hospital se queda vacío (0 médicos),
     * el hospital también debe ser eliminado del mapa principal.
     */
    public static void eliminarRegistrosMenoresA(Map<String, Map<String, Integer>> guardias, int minimoHoras) {
        // TODO: Implementar
        // 4. Limpieza de datos (Mutación del mapa)


    }
}