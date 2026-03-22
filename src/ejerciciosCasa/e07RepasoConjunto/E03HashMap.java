package ejerciciosCasa.e07RepasoConjunto;

import java.util.HashMap;
import java.util.Map;

public class E03HashMap {
    public static void main(String[] args) {

        Map <String, Integer> agenda = new HashMap<>();
        agenda.put("Carlos", 645 );
        agenda.put("Maria", 645);
        agenda.put("Marta", 600);

        System.out.println(agenda);

        agenda.forEach((nombre, telefono) -> {
            System.out.println("Nombre: " + nombre + " - Teléfono: " + telefono);
        });

        int contactoCarlos = agenda.get("Carlos");
        System.out.println("El numero de Carlos es  el " + contactoCarlos);
    }
}
