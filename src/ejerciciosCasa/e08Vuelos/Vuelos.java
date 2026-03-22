import java.util.*;

public class Vuelos {

    public static void main(String[] args) {
        Map<String, Map<String, Double>> vuelosPasajerosCoste = new HashMap<>();

        // Vuelo IB123 (Iberia Madrid-Barcelona)
        Map<String, Double> pasajerosIB123 = new HashMap<>();
        pasajerosIB123.put("12345678A", 150.50);
        pasajerosIB123.put("87654321B", 200.75);
        pasajerosIB123.put("11223344C", 175.25);
        pasajerosIB123.put("55667788E", 185.90);
        vuelosPasajerosCoste.put("IB123", pasajerosIB123);

        // Vuelo FR456 (Ryanair Madrid-Londres)
        Map<String, Double> pasajerosFR456 = new HashMap<>();
        pasajerosFR456.put("44332211D", 89.99);
        pasajerosFR456.put("55667788E", 120.50); // REPETIDO - mismo pasajero, precio diferente
        pasajerosFR456.put("99887766F", 95.75);
        pasajerosFR456.put("12345678A", 110.25); // REPETIDO - mismo pasajero, precio diferente
        vuelosPasajerosCoste.put("FR456", pasajerosFR456);

        // Vuelo LH789 (Lufthansa Madrid-Múnich)
        Map<String, Double> pasajerosLH789 = new HashMap<>();
        pasajerosLH789.put("77889900H", 320.80);
        pasajerosLH789.put("87654321B", 285.45); // REPETIDO
        pasajerosLH789.put("33445566G", 295.60);
        vuelosPasajerosCoste.put("LH789", pasajerosLH789);

        // Vuelo VY234 (Vueling Barcelona-París)
        Map<String, Double> pasajerosVY234 = new HashMap<>();
        pasajerosVY234.put("22334455J", 165.30);
        pasajerosVY234.put("11223344C", 180.90); // REPETIDO
        pasajerosVY234.put("55443322L", 155.60);
        pasajerosVY234.put("44332211D", 170.45); // REPETIDO
        vuelosPasajerosCoste.put("VY234", pasajerosVY234);

        // Vuelo UX567 (Air Europa Madrid-Roma)
        Map<String, Double> pasajerosUX567 = new HashMap<>();
        pasajerosUX567.put("99001122M", 245.75);
        pasajerosUX567.put("55667788E", 230.40); // REPETIDO - tercera vez
        pasajerosUX567.put("77889900H", 260.15); // REPETIDO
        pasajerosUX567.put("11998877P", 225.85);
        pasajerosUX567.put("87654321B", 240.20); // REPETIDO - tercera vez
        vuelosPasajerosCoste.put("UX567", pasajerosUX567);

        // Vuelo AF890 (Air France Madrid-París)
        Map<String, Double> pasajerosAF890 = new HashMap<>();
        pasajerosAF890.put("12345678A", 275.30); // REPETIDO - tercera vez
        pasajerosAF890.put("99887766F", 290.85); // REPETIDO
        pasajerosAF890.put("22334455J", 265.50); // REPETIDO
        vuelosPasajerosCoste.put("AF890", pasajerosAF890);


        // TODO - Generar un set con los identificadores de los vuelos
        System.out.println(getIdentificadoresVuelos(vuelosPasajerosCoste));


        // TODO - Mostrar el precio del billete más caro
        System.out.printf(
            "El billete más caro ha sido de %.2f %n",
            getBilleteMasCaro(vuelosPasajerosCoste)
        );

        // TODO - Crear un Map que la clave sea el vuelo y el value el precio medio del billete
        System.out.println(
            "El precio medio de cada vuelo ha sido " +
                getPreciosMedios(vuelosPasajerosCoste)
        );

        // TODO - Crear un MAP que la clave sea el DNI y el value el precio que se ha gastado en billetes
        System.out.println(
            "El gasto por cada pasajero ha sido de " +
                getGastoPorDNI(vuelosPasajerosCoste)
        );
    }

    public static Set<String> getIdentificadoresVuelos(Map<String, Map<String, Double>> vuelosPasajerosCoste) {

        return vuelosPasajerosCoste.keySet();
    }

    public static Double getBilleteMasCaro(Map<String, Map<String, Double>> vuelosPasajerosCoste) {

        double precioMax = 0;

        for (Map<String, Double> pasajeros : vuelosPasajerosCoste.values()) {
            for (double precio : pasajeros.values()){

                if (precio > precioMax){
                    precioMax = precio;
                }
            }
        }
        return precioMax;
    }

    public static Map<String, Double> getPreciosMedios(Map<String, Map<String, Double>> vuelosPasajerosCoste) {

        Map<String, Double> precioMedioBilletePorVuelo = new HashMap<>();

        for (String idVuelo : vuelosPasajerosCoste.keySet()){
            //Aqui no hace falta otro for porque ya conocemos la key, y con ella ya nos da los valores de dentro.
            Map<String, Double> pasajeros = vuelosPasajerosCoste.get(idVuelo);
            //Se declara fuera para que se inicie cada que cambie de id
            double sumaPrecios = 0.00;
            // Este se hace para irle sumando el precio de cada billete que forman la id
            for (Double precio : pasajeros.values()){
                sumaPrecios += precio;
            }

            double media = sumaPrecios/pasajeros.size();

            precioMedioBilletePorVuelo.put(idVuelo, media);
        }

        return precioMedioBilletePorVuelo;


    }

    public static Map<String, Double> getGastoPorDNI(Map<String, Map<String, Double>> vuelosPasajerosCoste) {

        Map<String, Double> gastoAsociadoACadaDNI = new HashMap<>();

        //Se recorre cada id de cada vuelo
        for (String idVuelo : vuelosPasajerosCoste.keySet()) {
            // Como ya conocemos la key, se crea un nuevo map con id.get
            Map<String, Double> pasajeros = vuelosPasajerosCoste.get(idVuelo);
            //Se hace otro for para recorrer todos los dni y coger la key
            for (String dniPasajeros : pasajeros.keySet()){
                //Como ya tenemos la key con get se obtiene el precio
                Double preciobillete = pasajeros.get(dniPasajeros);
                // Mirar a ver si estaba el dni en otro vuelo
                if (gastoAsociadoACadaDNI.containsKey(dniPasajeros)) {
                    double gastoAcumulado = gastoAsociadoACadaDNI.get(dniPasajeros);
                    gastoAsociadoACadaDNI.put(dniPasajeros, gastoAcumulado + preciobillete);
                } else {
                    gastoAsociadoACadaDNI.put(dniPasajeros, preciobillete);
                }
            }
        }
        return gastoAsociadoACadaDNI;
    }
}
