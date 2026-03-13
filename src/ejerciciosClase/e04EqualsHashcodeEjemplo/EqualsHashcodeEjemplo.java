package ejerciciosClase.e04EqualsHashcodeEjemplo;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcodeEjemplo {

    public static void main(String[] args) {
        // 1. Declaración e Instanciación (Uso de polimorfismo)
        Set<String> asistencia = new HashSet<>();

        // 2. Añadir elementos (Operación básica)
        asistencia.add("Guzmán");
        asistencia.add("Ana");
        asistencia.add("Luis");

        // 3. Intento de añadir un duplicado
        // El método .add() devolverá false y no lo guardará
        boolean seAnadio = asistencia.add("Guzmán");

        // 4. Comprobar si un elemento existe
        if (asistencia.contains("Ana")) {
            System.out.println("Ana está en la lista.");
        }

        // 5. Eliminar un elemento
        asistencia.remove("Luis");

        // 6. Recorrer el conjunto (For-each)
        // OJO: El orden de salida puede ser distinto al de entrada
        for (String nombre : asistencia) {
            System.out.println("Alumno: " + nombre);
        }

        // 7. Tamaño y vaciado
        System.out.println("Total alumnos únicos: " + asistencia.size());
        asistencia.clear();
    }
}
