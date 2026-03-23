package ejerciciosGemini.set;

import java.util.*;

public class E01DiferenciaImplementacionesSet {

    static void main() {
        List<String> pruebaNombres = new ArrayList<>(Arrays.asList("Juan", "Maria", "Ana", "Pedro", "Juan", "Maria"));
        System.out.println(pruebaNombres);

        Set <String> ejemploHashSet = new HashSet<>(pruebaNombres);
        System.out.println(ejemploHashSet);

        Set <String> ejemploLinkedHashSet = new LinkedHashSet<>(pruebaNombres);
        System.out.println(ejemploLinkedHashSet);

        Set <String> ejemploTreeSet = new TreeSet<>(pruebaNombres);
        System.out.println(ejemploTreeSet);

    }
}
