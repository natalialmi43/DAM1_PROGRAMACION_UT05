package ejerciciosGemini.map.e05SimiarRepasoHotel;

import java.util.HashMap;
import java.util.Map;

public class TiendaOnline {

    public static void main(String[] args) {
        // 1. Catálogo de Productos (Nombre -> Precio)
        Map<String, Double> catalogo = new HashMap<>();
        catalogo.put("Monitor", 250.0);
        catalogo.put("Teclado", 45.5);
        catalogo.put("Raton", 25.0);
        catalogo.put("CableHDMI", 10.0);

        // 2. Carritos de la compra (Email Usuario -> {Producto: Cantidad})
        Map<String, Map<String, Integer>> carritos = new HashMap<>();
        carritos.put("cliente1@mail.com", Map.of("Monitor", 2, "CableHDMI", 3));
        carritos.put("empresa@mail.com", Map.of("Monitor", 10, "Teclado", 10, "Raton", 10));
        carritos.put("casual@mail.com", Map.of("Raton", 1));

        System.out.println("--- 1. Facturación por Cliente ---");
        Map<String, Double> facturas = calcularFacturacion(carritos, catalogo);
        System.out.println(facturas);

        System.out.println("\n--- 2. Unidades Totales Vendidas ---");
        Map<String, Integer> unidadesVendidas = calcularUnidadesTotales(carritos);
        System.out.println(unidadesVendidas);

        System.out.println("\n--- 3. Búsqueda del Cliente VIP ---");
        String mejorCliente = obtenerClienteVIP(facturas);
        System.out.println("El cliente que más ha gastado es: " + mejorCliente);
    }

    /**
     * TAREA 1: Calcular el total a pagar de cada carrito.
     * (Estructura idéntica al ejercicio del hotel y el gimnasio).
     */
    public static Map<String, Double> calcularFacturacion(Map<String, Map<String, Integer>> carritos, Map<String, Double> catalogo) {
        Map<String, Double> resultado = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> mapa : carritos.entrySet()){
            String usuario = mapa.getKey();
            Map<String, Integer> mapaproductoCantidad = mapa.getValue();

            for (Map.Entry<String, Integer> productoCantidad : mapaproductoCantidad.entrySet()){
                String producto = productoCantidad.getKey();
                Integer cantidad = productoCantidad.getValue();

                Double precioProducto = catalogo.get(producto);

                Double precioTotal = (precioProducto*cantidad) + (resultado.getOrDefault(usuario, 0.00));

                resultado.put(usuario, precioTotal);
            }
        }

        return resultado;
    }

    /**
     * TAREA 2: Calcular cuántas unidades en total se han vendido de cada producto para reponer stock.
     * (Estructura idéntica a la popularidad de las habitaciones/actividades).
     */
    public static Map<String, Integer> calcularUnidadesTotales(Map<String, Map<String, Integer>> carritos) {
        Map<String, Integer> unidades = new HashMap<>();

        for ( Map<String, Integer> mapa  : carritos.values()){
            for (Map.Entry<String, Integer> productoCantidad : mapa.entrySet()){
                String producto = productoCantidad.getKey();
                Integer cantidad = productoCantidad.getValue();

                unidades.put(producto, unidades.getOrDefault(producto,0)+cantidad);
            }
        }
        return unidades;
    }

    /**
     * TAREA 3: ¡NUEVA! Iteración simple y lógica de búsqueda.
     * Recibe el mapa generado en la TAREA 1. Debes recorrerlo y encontrar
     * qué email corresponde al valor (gasto) más alto.
     */
    public static String obtenerClienteVIP(Map<String, Double> facturas) {
        String emailVIP = null;
        double gastoMaximo = 0.0;

        // --- TU CÓDIGO AQUÍ ---
        // Pista: Recorre el mapa 'facturas' usando entrySet().
        // Si el valor actual de la iteración es mayor que 'gastoMaximo',
        // actualiza 'gastoMaximo' con ese valor y 'emailVIP' con esa clave.

        for (Map.Entry<String, Double> clienteFactura : facturas.entrySet()){
            String cliente = clienteFactura.getKey();
            Double factura = clienteFactura.getValue();

            if (factura > gastoMaximo){
                gastoMaximo = factura;
                emailVIP = cliente;
            }
        }


        return emailVIP;
    }
}
