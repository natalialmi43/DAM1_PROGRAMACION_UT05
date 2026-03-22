package ejerciciosGemini.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E02ControlDeStockDual {
    static void main() {

        // Almacén A tiene los productos con IDs: 1, 2, 3, 4, 5
        Set<Integer> almacenA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        // Almacén B tiene los productos con IDs: 4, 5, 6, 7, 8
        Set<Integer> almacenB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // TODO 1: Crea un nuevo Set llamado 'comunes'.
        // Usa almacenA como base y luego .retainAll(almacenB)
        // para quedarte solo con los que están en AMBOS.
        Set<Integer> comunes = new HashSet<>(almacenA);
        comunes.retainAll(almacenB);
        System.out.println(comunes);


        // TODO 2: Crea un nuevo Set llamado 'soloEnA'.
        // Usa almacenA como base y luego .removeAll(almacenB)
        // para saber qué productos están en A pero NO en B.
        Set<Integer> soloEnA = new HashSet<>(almacenA);
        soloEnA.removeAll(almacenB);
        System.out.println(soloEnA);

        // TODO 3: Crea un nuevo Set llamado 'todoElStock'.
        // Usa .addAll() para unir ambos almacenes en uno solo sin repetidos.
        Set<Integer> todoElStock = new HashSet<>(almacenA);
        soloEnA.addAll(almacenB);
        System.out.println(soloEnA);


        System.out.println("Productos comunes: " + comunes);
        System.out.println("Solo en Almacén A: " + soloEnA);
        System.out.println("Catálogo completo: " + todoElStock);


    }
}
