package ejerciciosCasa.e04Set;

import java.util.HashSet;

public class E01ControlAccesoUnico {

    public static void main(String[] args) {

        HashSet <String> invitados = new HashSet<>();

        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());

        for (String n : invitados){
            System.out.println(n);
        }

    }
}
