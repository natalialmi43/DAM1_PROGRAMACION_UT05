package ejerciciosClase.e02ListasEjercicios;


/*
Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.
Añade cinco nombres a la lista.
Inserta un nombre nuevo en la tercera posición (índice 2).
Muestra el tamaño actual de la lista utilizando el atributo o método correspondiente.
Elimina al alumno que esté en la última posición.
Utilizando la lista del ejercicio anterior:
Pide un nombre por teclado y comprueba si el alumno existe en la lista.
Si existe, modifica su nombre para que aparezca todo en mayúsculas.
Muestra la lista completa utilizando un bucle for-each.
 */

import java.util.ArrayList;
import java.util.List;

public class E01 {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Ana");
        nombres.add("Luis");
        System.out.println(nombres);
        nombres.add(2, "Guzmán");
        System.out.println(nombres);
        System.out.println("Tamaño: " +  nombres.size());
        nombres.removeLast();
        System.out.println(nombres);

        // Teclado "Matias"
        System.out.println("Contiene Matias? " + nombres.contains("Matias"));

        // ¿Contiene Luis? Si es que sí, pasar a mayúsculas
        if (nombres.contains("Luis")) for (int i = 0; i < nombres.size(); i++) {
            String n = nombres.get(i);
            if ("Luis".equals(n)) {
                nombres.set(i, n.toUpperCase());
            }
            System.out.println(n);
        }
        System.out.println(nombres);

    }
}