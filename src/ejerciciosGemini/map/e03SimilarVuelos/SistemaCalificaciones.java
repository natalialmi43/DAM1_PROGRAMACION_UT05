package ejerciciosGemini.map.e03SimilarVuelos;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        Map<String, Map<String, Double>> registroNotas = new HashMap<>();

        // Notas de Marta
        Map<String, Double> notasMarta = new HashMap<>();
        notasMarta.put("Matemáticas", 8.5);
        notasMarta.put("Historia", 6.0);
        notasMarta.put("Física", 9.2);
        registroNotas.put("Marta", notasMarta);

        // Notas de Pablo
        Map<String, Double> notasPablo = new HashMap<>();
        notasPablo.put("Matemáticas", 4.5);
        notasPablo.put("Inglés", 7.0);
        notasPablo.put("Historia", 5.5);
        registroNotas.put("Pablo", notasPablo);

        // Notas de Lucía
        Map<String, Double> notasLucia = new HashMap<>();
        notasLucia.put("Física", 4.0);
        notasLucia.put("Inglés", 8.0);
        notasLucia.put("Programación", 9.5);
        notasLucia.put("Matemáticas", 10.0);
        registroNotas.put("Lucía", notasLucia);

        // TODO 1 - Obtener un Set con TODAS las asignaturas que existen en el colegio, sin repetir.
        // Ojo: Las asignaturas son las claves de los mapas internos.
        System.out.println("Asignaturas impartidas: " + getTodasLasAsignaturas(registroNotas));

        // TODO 2 - Encontrar la nota más BAJA sacada por cualquier alumno en cualquier asignatura.
        System.out.printf("La nota más baja registrada es: %.2f %n", getNotaMasBaja(registroNotas));

        // TODO 3 - Crear un Map <NombreAlumno, CantidadSuspensos>.
        // Un suspenso es una nota menor a 5.0. El valor será un Integer con el número de suspensos.
        System.out.println("Suspensos por alumno: " + getSuspensosPorAlumno(registroNotas));

        // TODO 4 - Crear un Map <Asignatura, SumaTotalNotas>.
        // Agrupa por asignatura y suma todas las notas que han sacado los alumnos en ella.
        System.out.println("Suma total de notas por asignatura: " + getSumaNotasPorAsignatura(registroNotas));
    }

    public static Set<String> getTodasLasAsignaturas(Map<String, Map<String, Double>> notas) {

        Set<String> asignaturas = new HashSet<>();

        for ( Map<String, Double> mapaAsignaturaNotas = notas.values()){
            asignaturas =

        }

        return asignaturas;
    }

    public static Double getNotaMasBaja(Map<String, Map<String, Double>> notas) {
        // Tu código aquí.
        return 10.0; // Empezamos en 10.0 para ir buscando hacia abajo
    }

    public static Map<String, Integer> getSuspensosPorAlumno(Map<String, Map<String, Double>> notas) {
        // Tu código aquí.
        return null;
    }

    public static Map<String, Double> getSumaNotasPorAsignatura(Map<String, Map<String, Double>> notas) {
        // Tu código aquí.
        return null;
    }
}