package ejerciciosGemini.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class E01GestorDeTareasDeEmergencia {
    static void main() {

        List <String> registro = new ArrayList<>();
        registro.add("Juan");
        registro.add("Maria");
        registro.add("Luis");

        boolean existe = registro.contains("Maria");
        System.out.println(existe);

        registro.set(0, "Andres");
        System.out.println(registro);

        int indiceBuscado = registro.indexOf("Maria");
        registro.set(indiceBuscado,"Hola");
        System.out.println(registro);


        List<String> urgencias = new LinkedList<>();
        urgencias.add("Paciente A");
        urgencias.add("Paciente B");
        System.out.println(urgencias);

        Stack <String> pruebaStack = new Stack<>();
        pruebaStack.add("Hola");
        pruebaStack.add("Adios");
        System.out.println(pruebaStack);


    }
}
