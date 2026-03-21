package ejerciciosCasa.e06Map;

import java.util.HashMap;
import java.util.Map;

public class E02GestionInventarioPracticarClaves {
    public static void main(String[] args) {

        Map<Integer,String> inventario = new HashMap<>();

        inventario.put(1, "Tornillo");
        inventario.put(2, "Martillo");
        inventario.put(3, "Pala");

        int aComprobar = 1;
        String nuevoProducto = "AAA";



        if(inventario.containsKey(aComprobar)){
            System.out.printf("El elemento existe, no se puede insertar");
        } else {
            inventario.put(aComprobar, nuevoProducto);
        }
    }
}
