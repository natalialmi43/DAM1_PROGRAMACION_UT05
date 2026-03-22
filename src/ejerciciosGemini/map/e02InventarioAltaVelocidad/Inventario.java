package ejerciciosGemini.map.e02InventarioAltaVelocidad;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    static void main() {

        Map<Integer, Producto> almacen = new HashMap<>();
        almacen.put(101, new Producto("Monitor", 101));
        almacen.put(102, new Producto("Teclado", 102));
        almacen.put(103, new Producto("Ratón", 103));


        Producto pr = almacen.get(102);
        if (pr != null) {
            System.out.println("El producto 102 es: " + pr.nombre);
        }

        for (int claves : almacen.keySet()){
            System.out.println(claves);
        }

        for (Producto p : almacen.values()){
            System.out.println(p.nombre);
        }

        System.out.println(almacen.get(999));
    }
}
