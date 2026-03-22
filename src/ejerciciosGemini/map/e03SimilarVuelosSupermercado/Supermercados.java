package ejerciciosGemini.map.e03SimilarVuelosSupermercado;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Supermercados {

    public static void main(String[] args) {
        // Mapa principal: Supermercado -> (Socio -> Gasto)
        Map<String, Map<String, Double>> supermercadosClientesGasto = new HashMap<>();

        // 1. Datos de Mercadona
        Map<String, Double> clientesMercadona = new HashMap<>();
        clientesMercadona.put("SOCIO-001", 54.20);
        clientesMercadona.put("SOCIO-002", 120.50);
        clientesMercadona.put("SOCIO-003", 15.90);
        supermercadosClientesGasto.put("Mercadona", clientesMercadona);

        // 2. Datos de Carrefour
        Map<String, Double> clientesCarrefour = new HashMap<>();
        clientesCarrefour.put("SOCIO-004", 89.99);
        clientesCarrefour.put("SOCIO-001", 210.00); // REPETIDO: Este socio también compró en Mercadona
        clientesCarrefour.put("SOCIO-005", 45.30);
        supermercadosClientesGasto.put("Carrefour", clientesCarrefour);

        // 3. Datos de Lidl
        Map<String, Double> clientesLidl = new HashMap<>();
        clientesLidl.put("SOCIO-002", 33.45); // REPETIDO
        clientesLidl.put("SOCIO-006", 12.00);
        clientesLidl.put("SOCIO-007", 98.60);
        clientesLidl.put("SOCIO-001", 5.50);  // REPETIDO: Tercera compra del socio 001
        supermercadosClientesGasto.put("Lidl", clientesLidl);

        // 4. Datos de Aldi
        Map<String, Double> clientesAldi = new HashMap<>();
        clientesAldi.put("SOCIO-008", 76.25);
        clientesAldi.put("SOCIO-005", 105.40); // REPETIDO
        supermercadosClientesGasto.put("Aldi", clientesAldi);

        // --- ZONA DE IMPRESIÓN (No tocar) ---

        System.out.println("1. Cadenas de supermercados registradas:");
        System.out.println(getNombresSupermercados(supermercadosClientesGasto));

        System.out.printf("\n2. El ticket de compra más caro registrado ha sido de: %.2f €%n",
                getCompraMasCara(supermercadosClientesGasto));

        System.out.println("\n3. Gasto medio por cada supermercado:");
        System.out.println(getGastoMedioPorSupermercado(supermercadosClientesGasto));

        System.out.println("\n4. Gasto TOTAL acumulado por cada socio (sumando todos los supers):");
        System.out.println(getGastoTotalPorSocio(supermercadosClientesGasto));
    }

    // =====================================================================
    // ZONA DE TRABAJO: Completa los siguientes 4 métodos
    // =====================================================================

    // EJERCICIO 1: Devuelve un Set con los nombres de los supermercados (las claves principales)
    public static Set<String> getNombresSupermercados(Map<String, Map<String, Double>> mapaPrincipal) {

        return mapaPrincipal.keySet();
    }

    // EJERCICIO 2: Busca en todos los supermercados y devuelve el valor del ticket más alto
    public static Double getCompraMasCara(Map<String, Map<String, Double>> mapaPrincipal) {

        double ticketMaximo = 0;

        for (Map<String, Double> idSocio : mapaPrincipal.values()){
            for (Double precioTicket : idSocio.values()){
                if (precioTicket > ticketMaximo){
                    ticketMaximo = precioTicket;
                }
            }
        }

        return ticketMaximo;
    }

    // EJERCICIO 3: Calcula la media de gasto de los clientes de CADA supermercado
    // Devuelve un Map donde la clave sea el Supermercado y el valor su media
    public static Map<String, Double> getGastoMedioPorSupermercado(Map<String, Map<String, Double>> mapaPrincipal) {

        Map<String, Double> gastoMedio = new HashMap<>();

        for (String nombreSupermercado : mapaPrincipal.keySet()){

            Map<String, Double> idClientes = mapaPrincipal.get(nombreSupermercado);

            double precioTotalPorSuper = 0.0;

            for (Double mediaTicket : idClientes.values()){
                precioTotalPorSuper += mediaTicket;
            }
            double precioMedioSuper = precioTotalPorSuper/idClientes.size();

            gastoMedio.put(nombreSupermercado, precioMedioSuper);
        }

        return gastoMedio;
    }

    // EJERCICIO 4: Calcula cuánto ha gastado cada Socio en total, sumando sus compras de todos los supermercados
    // Devuelve un Map donde la clave sea el Socio y el valor la suma de sus tickets
    public static Map<String, Double> getGastoTotalPorSocio(Map<String, Map<String, Double>> mapaPrincipal) {

        Map<String, Double> gastoCadaSocio = new HashMap<>();


        for (String nombreSupermercado : mapaPrincipal.keySet()){

            Map<String, Double> clienteYGastoAsociado = mapaPrincipal.get(nombreSupermercado);

            for (String socio : clienteYGastoAsociado.keySet()){
                double dineroGastado = clienteYGastoAsociado.get(socio);

                if(gastoCadaSocio.containsKey(socio)){
                    double acumulado= gastoCadaSocio.get(socio);
                    gastoCadaSocio.put(socio, acumulado+dineroGastado);
                } else {
                    gastoCadaSocio.put(socio, dineroGastado);
                }
            }
        }


        return gastoCadaSocio;
    }
}