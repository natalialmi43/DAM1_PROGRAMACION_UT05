package ejerciciosCasa.e06Map;

import java.util.HashMap;
import java.util.Map;

public class E05ContadorFrecuencia {

    public static void main(String[] args) {

        String [] lenguajes = {"Java", "Python", "Java", "C++", "Java", "Python"};

        Map<String, Integer> conteo = new HashMap<>();

        for (String lenguaje : lenguajes) {
            // Extrae el valor actual (o 0 si no existe), le suma 1 y actualiza la clave
            conteo.put(lenguaje, conteo.getOrDefault(lenguaje, 0) + 1);
        }

    }
}
