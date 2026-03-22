package ejerciciosCasa.e07RepasoConjunto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E01ArrayList {
    public static void main(String[] args) {

        List<String> gestionPendientes =  new ArrayList<>(Arrays.asList("Despertase", "Desayunar", "Limpiar", "Estudiar"));

        System.out.println(gestionPendientes);

        for (String s : gestionPendientes){
            System.out.println(s);
        }

        gestionPendientes.remove(1);

        System.out.println(gestionPendientes);

    }

}
