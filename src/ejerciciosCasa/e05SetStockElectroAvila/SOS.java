package ejerciciosCasa.e05SetStockElectroAvila;

import java.util.HashMap;
import java.util.Map;

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

        // Transformar en ventas por vendedor
        // Luis > Avila > 4500
        // Fernando > Avila > 3200
        // Fernando > Burgos > 4500
        Map<String, Map<String, Integer>> ventasPorVendedor = new HashMap<>();

        /*
        for (String ventasPorCiudad: ventasPorZona.keySet()){
            System.out.println(ventasPorCiudad);
            for (String vendedor : ventasPorZona.)
        }

         */




    }
}
