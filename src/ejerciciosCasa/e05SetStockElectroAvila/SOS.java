package ejerciciosCasa.e05SetStockElectroAvila;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SOS {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> ventasPorZona = new HashMap<>();
        ventasPorZona.putIfAbsent("Avila", new HashMap<>());
        ventasPorZona.putIfAbsent("Burgos", new HashMap<>());
        ventasPorZona.putIfAbsent("Segovia", new HashMap<>());
        ventasPorZona.get("Avila").put("Luis", 4500);
        ventasPorZona.get("Avila").put("Fernando", 3200);
        ventasPorZona.get("Avila").put("Marta", 7000);
        ventasPorZona.get("Segovia").put("Rigoberto", 6200);
        ventasPorZona.get("Segovia").put("Luciano", 5200);
        ventasPorZona.get("Segovia").put("Marta", 1200);
        ventasPorZona.get("Burgos").put("Fernando", 4500);
        ventasPorZona.get("Burgos").put("Rigoberto", 7200);
        System.out.println(ventasPorZona);

        // Quiero añadir a Fernando, 600 en ventas en Burgos
        // Forma 0 -->> MAL
        // ventasPorZona.get("Burgos").put("Fernando", 600);
        // Forma 1
//        if (ventasPorZona.get("Burgos").containsKey("Fernando")) {
//            Integer value = ventasPorZona.get("Burgos").get("Fernando");
//            ventasPorZona.get("Burgos").put("Fernando", value + 600);
//        } else {
//            ventasPorZona.get("Burgos").put("Fernando", 600);
//        }
        // Forma 2
        Integer value = ventasPorZona.get("Burgos").getOrDefault("Fernando", 0);
        ventasPorZona.get("Burgos").put("Fernando", value + 600);
        System.out.println(ventasPorZona);

        // Transformar en ventas por vendedor
        // Luis > Avila > 4500
        // Fernando > Avila > 3200
        // Fernando > Burgos > 4500
        Map<String, Map<String, Integer>> ventasPorVendedor = new HashMap<>();
        Set<String> zonas = ventasPorZona.keySet();
        for (String zona : zonas) {
            Set<String> vendedores = ventasPorZona.get(zona).keySet();
            for (String vendedor : vendedores) {
                Integer valor = ventasPorZona.get(zona).get(vendedor);
                System.out.println(zona + " :: " + vendedor + " :: " + valor);

                // Aquí ya tengo lo necesario
                if (!ventasPorVendedor.containsKey(vendedor))
                    ventasPorVendedor.put(vendedor, new HashMap<>());
                ventasPorVendedor.get(vendedor).put(zona, ventasPorVendedor.get(vendedor).getOrDefault(zona, 0) + valor);

            }
        }
        System.out.println(ventasPorVendedor);

    }
}
