package ejerciciosGemini.mix.GestionEnvios;

import java.util.*;

public class GestorLogistica {

    public static void main(String[] args) {
        // 1. DATOS INICIALES (Simulando una lectura de base de datos con errores/duplicados)
        List<Envio> enviosBrutos = new ArrayList<>(Arrays.asList(
                new EnvioEstandar(1001, "Empresa A", "Madrid", 2.5),
                new EnvioExpress(2005, "Particular B", "Valencia", true),
                new EnvioEstandar(1001, "Empresa A", "Madrid", 2.5), // Duplicado
                new EnvioEstandar(1002, "Empresa C", "Barcelona", 15.0),
                new EnvioExpress(2006, "Particular D", "Sevilla", false),
                new EnvioExpress(2005, "Particular B", "Valencia", true), // Duplicado
                new EnvioEstandar(1003, "Empresa A", "Madrid", 1.2),
                new EnvioExpress(2007, "Empresa C", "Bilbao", true)
        ));

        // Diccionario de Zonas Logísticas
        Map<String, String> zonasPorCiudad = new HashMap<>();
        zonasPorCiudad.put("Madrid", "ZONA CENTRO");
        zonasPorCiudad.put("Barcelona", "ZONA ESTE");
        zonasPorCiudad.put("Valencia", "ZONA ESTE");
        zonasPorCiudad.put("Sevilla", "ZONA SUR");
        zonasPorCiudad.put("Bilbao", "ZONA NORTE");

        // --- INICIO DE TRANSFORMACIONES ---

        // TODO T1: Eliminar duplicados de la lista 'enviosBrutos' usando la colección adecuada.
        Set<Envio> enviosUnicos = new HashSet<>(enviosBrutos); // Reemplaza null por tu código

        System.out.println("Envíos únicos a procesar: " + (enviosUnicos != null ? enviosUnicos.size() : 0));


        // TODO T2: Mapa de frecuencia por Cliente.
        // Calcula cuántos envíos brutos (incluyendo duplicados) ha realizado cada cliente.
        Map<String, Integer> enviosPorCliente = new HashMap<>();
        // Escribe aquí tu bucle

        for (Envio cliente : enviosBrutos){
           String nombreCliente = cliente.getCliente();
           Integer contador = enviosPorCliente.getOrDefault(nombreCliente, 0);

            enviosPorCliente.put(nombreCliente, contador + 1);
        }



        // TODO T3: Agrupar envíos únicos por ZONA LOGÍSTICA.
        // Ejemplo esperado: "ZONA ESTE" -> [Envio 1002, Envio 2005]
        // Debes cruzar la ciudad del envío con el mapa 'zonasPorCiudad'.
        Map<String, List<Envio>> agrupacionPorZona = new HashMap<>();
        // Escribe aquí tu bucle

        /*
        for ( Envio envio : enviosUnicos){
            String ciudad = envio.getCiudadDestino();
            String zona = zonasPorCiudad.getOrDefault(ciudad, "ZONA DESCONOCIDA");


        }

        agrupacionPorZona.put();

         */



        // TODO T4: Extraer los IDs de los envíos que sean EXPRESS y además REQUIERAN FIRMA.
        // Debes usar instanceof. El resultado debe estar ordenado de menor a mayor ID.
        Set<Integer> idsExpressConFirma = new TreeSet<>();
        // Escribe aquí tu bucle



        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n--- Resumen Operativo ---");
        System.out.println("Volumen por cliente (bruto): " + enviosPorCliente);
        System.out.println("Distribución por Zonas (únicos): " + agrupacionPorZona);
        System.out.println("IDs Express con firma requerida: " + idsExpressConFirma);
    }
}