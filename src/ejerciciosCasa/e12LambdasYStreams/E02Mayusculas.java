package ejerciciosCasa.e12LambdasYStreams;

/*
## Ejercicio 2:
Transformación de nombres (Lambda + map)
Tenemos una lista de nombres de alumnos: {"ana", "luis", "guzmán", "marta"}.
Convierte todos los nombres a mayúsculas.
Usa .stream().map(...) y luego recoge el resultado en una nueva List<String> usando .toList() (o Collectors.toList()).
Muestra la nueva lista por pantalla.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E02Mayusculas {
    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>(Arrays.asList("ana", "luis", "guzmán", "marta"));

        List<String> alumnosMayusculas = alumnos.stream().map(String::toUpperCase).toList();

        System.out.println(alumnosMayusculas);
    }
}
