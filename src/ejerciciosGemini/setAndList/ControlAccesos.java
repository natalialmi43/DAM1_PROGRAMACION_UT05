package ejerciciosGemini.setAndList;

import java.util.*;

public class ControlAccesos {

    public static void main(String[] args) {

        // Historial de escaneos en la puerta (Cronológico, permite repetidos)
        List<String> historialEscaneos = new ArrayList<>();
        historialEscaneos.add("1111A");
        historialEscaneos.add("2222B"); // VIP
        historialEscaneos.add("1111A"); // Entra, sale y vuelve a entrar
        historialEscaneos.add("3333C");
        historialEscaneos.add("4444D"); // VIP
        historialEscaneos.add("2222B"); // VIP vuelve a entrar
        historialEscaneos.add("5555E");
        historialEscaneos.add("1111A"); // Tercera vez

        // Lista oficial de invitados VIP (Sin orden específico, sin repetidos)
        Set<String> invitadosVIP = new HashSet<>();
        invitadosVIP.add("2222B");
        invitadosVIP.add("4444D");
        invitadosVIP.add("9999Z"); // Este VIP tiene entrada pero no ha venido

        // TODO 1 - Obtener un Set con los DNI de las personas ÚNICAS que han entrado hoy.
        System.out.println("Visitantes únicos de hoy: " + getVisitantesUnicos(historialEscaneos));

        // TODO 2 - Contar cuántas veces ha pasado por el torno una persona en concreto.
        System.out.println("Veces que entró 1111A: " + contarAccesos(historialEscaneos, "1111A"));

        // TODO 3 - Generar una nueva Lista cronológica SOLO con los escaneos de las personas que son VIP.
        System.out.println("Historial de movimientos VIP: " + getAccesosVIP(historialEscaneos, invitadosVIP));

        // TODO 4 - Obtener un Set con los DNI de los VIPs que SÍ han asistido al evento.
        System.out.println("VIPs que han asistido: " + getVipsAsistentes(historialEscaneos, invitadosVIP));
    }

    public static Set<String> getVisitantesUnicos(List<String> historial) {

        Set<String> personasUnicasQueEntraron = new HashSet<>(historial);

        return personasUnicasQueEntraron;
    }

    public static int contarAccesos(List<String> historial, String dniBuscado) {

        int contador = 0;

        for (String dni : historial){
            if (dniBuscado.equals(dni)){
                contador++;
            }
        }

        return contador;
    }

    public static List<String> getAccesosVIP(List<String> historial, Set<String> vips) {

        List<String> accesosVIP = new ArrayList<>();

        for (String dni : historial){
            if (vips.contains(dni)){
                accesosVIP.add(dni);
            }
        }
        return accesosVIP;
    }

    public static Set<String> getVipsAsistentes(List<String> historial, Set<String> vips) {

        Set<String> VIPAsistentes = new HashSet<>();

        for (String dni : vips){
            if (historial.contains(dni)){
                VIPAsistentes.add(dni);
            }
        }
        return VIPAsistentes;
    }
}