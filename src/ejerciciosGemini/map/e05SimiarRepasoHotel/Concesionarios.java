package ejerciciosGemini.map.e05SimiarRepasoHotel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Concesionarios {

    public static void main(String[] args) {
        Map<String, Map<String, Double>> ventasSucursales = new HashMap<>();

        // Sucursal Madrid Norte
        Map<String, Double> ventasMadrid = new HashMap<>();
        ventasMadrid.put("11111111A", 25500.00);
        ventasMadrid.put("22222222B", 18200.50);
        ventasMadrid.put("33333333C", 32000.00);
        ventasSucursales.put("Madrid Norte", ventasMadrid);

        // Sucursal Barcelona Centro
        Map<String, Double> ventasBcn = new HashMap<>();
        ventasBcn.put("44444444D", 15000.00);
        ventasBcn.put("11111111A", 4500.00); // REPETIDO - Mismo cliente compró una moto aquí
        ventasBcn.put("55555555E", 28900.75);
        ventasSucursales.put("Barcelona Centro", ventasBcn);

        // Sucursal Valencia Costa
        Map<String, Double> ventasValencia = new HashMap<>();
        ventasValencia.put("66666666F", 41000.00);
        ventasValencia.put("22222222B", 12000.00); // REPETIDO - Compró otro coche aquí
        ventasValencia.put("77777777G", 19500.25);
        ventasSucursales.put("Valencia Costa", ventasValencia);

        // TODO 1: Obtener un Set con los nombres de todas las sucursales
        System.out.println("Sucursales operativas: " + getNombresSucursales(ventasSucursales));

        // TODO 2: Encontrar el importe de la venta individual más cara de toda la red
        System.out.printf("La venta récord ha sido de: %.2f %n", getVentaMasCara(ventasSucursales));

        // TODO 3: Calcular el ticket medio (gasto medio) por sucursal
        System.out.println("Ticket medio por sucursal: " + getMediaPorSucursal(ventasSucursales));

        // TODO 4: Calcular cuánto se ha gastado en total CADA CLIENTE sumando todas las sucursales
        System.out.println("Gasto total acumulado por DNI: " + getGastoTotalPorCliente(ventasSucursales));
    }

    public static Set<String> getNombresSucursales(Map<String, Map<String, Double>> ventasSucursales) {
        // --- TU CÓDIGO AQUÍ ---
        return ventasSucursales.keySet();
    }

    public static Double getVentaMasCara(Map<String, Map<String, Double>> ventasSucursales) {
        // --- TU CÓDIGO AQUÍ ---

        Double ventaMasCara = 0.00;

        for ( Map<String, Double> mapa : ventasSucursales.values()){
            for (Map.Entry<String, Double> personaGasto : mapa.entrySet()){
                String persona = personaGasto.getKey();
                Double gasto = personaGasto.getValue();
                if(ventaMasCara < gasto){
                    ventaMasCara = gasto;
                }
            }
        }

        return ventaMasCara;
    }

    public static Map<String, Double> getMediaPorSucursal(Map<String, Map<String, Double>> ventasSucursales) {
        // --- TU CÓDIGO AQUÍ ---

        Map<String, Double> gastoMedioPorSucursal = new HashMap<>();

        for (Map.Entry<String, Map<String, Double>> mapaComleto : ventasSucursales.entrySet()){
            String sucursal = mapaComleto.getKey();
            Map<String, Double> mapaPersonaGasto = mapaComleto.getValue();

            Double gastoSucursal = 0.0;

            for( Map.Entry<String, Double> personaGasto : mapaPersonaGasto.entrySet()){
                String persona = personaGasto.getKey();
                Double gasto = personaGasto.getValue();

                gastoSucursal += gasto;

            }

            Double gastoMedio = gastoSucursal/mapaPersonaGasto.size();

            gastoMedioPorSucursal.put(sucursal, gastoMedio);
        }

        return gastoMedioPorSucursal;
    }

    public static Map<String, Double> getGastoTotalPorCliente(Map<String, Map<String, Double>> ventasSucursales) {
        // --- TU CÓDIGO AQUÍ ---
        Map<String, Double> gastoPorCliente = new HashMap<>();

        for (Map<String, Double> mapaPersonaGasto : ventasSucursales.values()){
            for ( Map.Entry<String, Double> personaGasto : mapaPersonaGasto.entrySet()){
                String persona = personaGasto.getKey();
                Double gasto = personaGasto.getValue();
                Double acumulado = gastoPorCliente.getOrDefault(persona,0.0) + gasto;

                gastoPorCliente.put(persona, acumulado);
            }
        }

        return gastoPorCliente;
    }
}
