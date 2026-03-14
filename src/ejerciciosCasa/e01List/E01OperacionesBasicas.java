package ejerciciosCasa.e01List;

import java.util.ArrayList;
import java.util.List;

public class E01OperacionesBasicas {

    public static void main(String[] args) {

        // Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.
        ArrayList <String> alumnos = new ArrayList<>();

        // Añade cinco nombres a la lista.
        alumnos.add("Maria");
        alumnos.add("Pablo");
        alumnos.add("Alberto");
        alumnos.add("Rafa");
        alumnos.add("Carla");

        int size = alumnos.size();
        System.out.println("La lista contiene "+ size + " cadenas de texto");

        System.out.println(alumnos);

        // Inserta un nombre nuevo en la tercera posición (índice 2).
        alumnos.add(2, "Paco");
        System.out.println(alumnos);


        // Muestra el tamaño actual de la lista utilizando el atributo o método correspondiente.
        int tamanio = alumnos.size();
        System.out.println("La lista contiene "+ tamanio + " cadenas de texto");

        // Elimina al alumno que esté en la última posición.
        alumnos.removeLast();
        System.out.println(alumnos);


    }

}
