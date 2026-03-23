package ejerciciosGemini.map.e05TorneoVideojuego;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TorneoVideojuego {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> torneoMundial = new HashMap<>();

        // 1. Servidor Europa (EU)
        Map<String, Integer> serverEU = new HashMap<>();
        serverEU.put("Faker", 4500);
        serverEU.put("Caps", 3800);
        serverEU.put("Perkz", 4100);
        serverEU.put("Rekkles", 3950);
        torneoMundial.put("EU", serverEU);

        // 2. Servidor Norteamérica (NA)
        Map<String, Integer> serverNA = new HashMap<>();
        serverNA.put("Doublelift", 3200);
        serverNA.put("Bjergsen", 4050);
        serverNA.put("Jensen", 3100);
        serverNA.put("Faker", 1500); // REPETIDO: Jugó unas partidas en NA con ping alto
        torneoMundial.put("NA", serverNA);

        // 3. Servidor Asia (KR)
        Map<String, Integer> serverKR = new HashMap<>();
        serverKR.put("ShowMaker", 4800);
        serverKR.put("Chovy", 4750);
        serverKR.put("Deft", 4200);
        serverKR.put("Faker", 5200); // REPETIDO: Su cuenta principal
        serverKR.put("Caps", 1200);  // REPETIDO: Entrenando en Corea
        torneoMundial.put("KR", serverKR);

        // --- ZONA DE IMPRESIÓN ---

        System.out.println("1. Cantidad de jugadores distintos por región:");
        System.out.println(getVolumenJugadores(torneoMundial));

        System.out.println("\n2. El Nickname del jugador MVP (el que hizo el récord en un solo servidor):");
        System.out.println(getNicknameMVP(torneoMundial));

        System.out.println("\n3. Puntos totales de cada jugador sumando todas sus cuentas:");
        System.out.println(getPuntosGlobales(torneoMundial));

        System.out.println("\n4. Regiones que tienen una media de puntos superior a 4000:");
        System.out.println(getRegionesNivelAlto(torneoMundial));
    }

    // =====================================================================
    // ZONA DE TRABAJO (Sube el nivel)
    // =====================================================================

    // EJERCICIO 1: Ya no quiero los nombres. Quiero saber CUÁNTOS jugadores tiene cada región.
    // Devuelve: Un mapa donde la clave es la Región y el valor es el número de jugadores en ese servidor.
    // Pista: El método .size() te da el tamaño de un Map.
    public static Map<String, Integer> getVolumenJugadores(Map<String, Map<String, Integer>> torneo) {
        // TODO
        return null;
    }

    // EJERCICIO 2: OJO AQUÍ. No quiero saber cuál es la puntuación máxima.
    // Quiero saber el NICKNAME del jugador que la consiguió.
    // Pista: Vas a necesitar dos variables de control antes de los bucles: una para los puntos máximos (int) y otra para guardar el nombre (String).
    public static String getNicknameMVP(Map<String, Map<String, Integer>> torneo) {
        // TODO
        return "Nadie";
    }

    // EJERCICIO 3: El clásico de acumular. Hay jugadores que han jugado en varios servidores.
    // Calcula los puntos totales por cada jugador.
    // Devuelve: Mapa con Nickname -> Puntos Totales.
    public static Map<String, Integer> getPuntosGlobales(Map<String, Map<String, Integer>> torneo) {
        // TODO
        return null;
    }

    // EJERCICIO 4: Control de flujo y filtrado.
    // Calcula la media de cada región. Si la media es ESTRICTAMENTE MAYOR a 4000, metes el nombre de la región en el Set. Si no, la ignoras.
    // Devuelve: Un conjunto (Set) solo con los nombres de las regiones de alto nivel.
    public static Set<String> getRegionesNivelAlto(Map<String, Map<String, Integer>> torneo) {
        // TODO
        return null;
    }
}
