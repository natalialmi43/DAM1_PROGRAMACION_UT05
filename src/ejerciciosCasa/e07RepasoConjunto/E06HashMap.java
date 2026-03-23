package ejerciciosCasa.e07RepasoConjunto;

import java.util.HashMap;
import java.util.Map;

public class E06HashMap {
    public static void main(String[] args) {

        Map <String, Integer> producto = new HashMap<>();
        producto.put("Manzanas", 4);
        producto.put("Peras", 3);
        producto.put("Naranjas", 8);
        producto.put("Manzanas", 1);

        producto.forEach((nombre, cantidad) ->{
            System.out.println("Hay " + cantidad + " de " + nombre);
        });

        String actualizarProducto = "Peras";

        if (producto.containsKey(actualizarProducto)){
            int cantidadActual = producto.get(actualizarProducto);
            producto.put(actualizarProducto, cantidadActual+5);
        } else {
            System.out.println("No lo contiene, salu2");
        }

        System.out.println("Actualizado");
        producto.forEach((nombre, cantidad)->{
            System.out.println("Hay " + cantidad + " de " + nombre);
        });



    }
}
