package ejerciciosCasa.e04Set;

import java.util.HashSet;
import java.util.Set;

public class E05DetectorErrores {
    public static void main(String[] args) {

        Set<String> matriculas = new HashSet<>();
        matriculas.add("A123");

        // Intentamos añadir exactamente la misma matrícula y capturamos la respuesta del sistema
        boolean exito = matriculas.add("A123");

        System.out.println(exito? "Matricula insertada" : "Error, matricula sin insertar");

    }
}
