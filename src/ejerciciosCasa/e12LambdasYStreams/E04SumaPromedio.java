package ejerciciosCasa.e12LambdasYStreams;

/*
## Ejercicio 4:
Estadística de números (Stream + mapToInt)
Crea una lista con los números: {10, 20, 30, 40, 50}.
Calcular la suma y el promedio de todos los números.
Convierte el stream a un IntStream usando .mapToInt(n -> n) y utiliza los métodos .sum() y .average().
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class E04SumaPromedio {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int suma = numeros.stream().mapToInt(numero -> numero).sum();

        double avg = numeros.stream().mapToInt(numero -> numero).average().orElse(0.0);

        System.out.println(suma);
        System.out.println(avg);


    }
}
