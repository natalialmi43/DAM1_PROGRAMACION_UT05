package ejerciciosClase.e01ListasEjemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas3 {
    public static void main(String[] args) {

        // 1. Declaración e Instanciación (Usamos Polimorfismo)
        List<String> alumnos = new ArrayList<>();

        // 2. Añadir elementos
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add(1, "Marta"); // Inserta en la posición 1
        alumnos.add("Humberto");
        alumnos.add("Juan Carlos");
        alumnos.add("Luis");

        // 3. Acceder a un elemento
        String primero = alumnos.get(0); // "Ana"

        // 4. Tamaño de la lista
        int total = alumnos.size(); // 3

        // 5. Eliminar elementos
        alumnos.remove("Luis"); // Por objeto
        alumnos.remove(0);      // Por índice

        // 6. Comprobaciones
        boolean existe = alumnos.contains("Marta"); // true

        alumnos.clear(); // Vacía la lista

        // 7. Foreach
        for (String nombre : alumnos) {
            System.out.println("Alumno: " + nombre);
        }

    }

    public class Nodo {
        String contenido;
        Nodo siguiente;
    }
    public class Lista {
        Nodo inicio;
        public void add(String contenido) {
            // Crearíamos un nuevo nodo y lo añadiríamos a la lista
        }
        public void get(int posicion){}
    }
}
