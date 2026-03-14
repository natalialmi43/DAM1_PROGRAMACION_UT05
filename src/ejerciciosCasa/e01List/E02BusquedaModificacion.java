package ejerciciosCasa.e01List;

import java.util.ArrayList;
import java.util.Scanner;

public class E02BusquedaModificacion {

    public static void main(String[] args) {

        // Utilizando la lista del ejercicio anterior:
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Maria");
        alumnos.add("Pablo");
        alumnos.add("Alberto");
        alumnos.add("Rafa");
        alumnos.add("Carla");

        // Pide un nombre por teclado y comprueba si el alumno existe en la lista.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nombre para comprobar si esta en la lista");

        String nombrePrueba = sc.nextLine();

        boolean existe = alumnos.contains(nombrePrueba);

        System.out.println(existe? "Si, existe" :"No, prueba otra vez");

        // Si existe, modifica su nombre para que aparezca todo en mayúsculas.
         if(existe){
             int posicion = alumnos.indexOf(nombrePrueba);
             System.out.println(nombrePrueba + " se encuentra en la posición "+ (posicion +1) );
             // El set hace como remove and add.
             alumnos.set(posicion,nombrePrueba.toUpperCase());
         } else {
             System.out.println("El alumno no está en la lista");
         }

         // Muestra la lista completa utilizando un bucle for-each.
        for (String nombre : alumnos){
            System.out.print(nombre + ", ");
        }
    }
}
