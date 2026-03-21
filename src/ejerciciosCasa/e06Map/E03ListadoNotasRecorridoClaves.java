package ejerciciosCasa.e06Map;

import java.util.HashMap;

public class E03ListadoNotasRecorridoClaves {
    public static void main(String[] args) {

        HashMap<String, Double> notasAlumnos = new HashMap<>();
        notasAlumnos.put("AAA", 10.0);
        notasAlumnos.put("BBB", 9.9);
        notasAlumnos.put("CCC", 9.5);
        notasAlumnos.put("DDD", 9.8);

        // importante .KeySet()
        for (String alumno : notasAlumnos.keySet()) {
            //Se guarda para luego poder imprimir
            Double nota = notasAlumnos.get(alumno);
            System.out.println("El alumno " + alumno + " tiene una nota de " + nota);
        }

    }
}
