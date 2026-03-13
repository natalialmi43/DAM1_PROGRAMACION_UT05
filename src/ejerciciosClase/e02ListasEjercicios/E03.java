package ejerciciosClase.e02ListasEjercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Dado el siguiente array de notas: int[] notasArray = {4, 9, 7, 5, 10};
Crea un ArrayList de objetos Integer.
Vuelca todos los datos del array a la lista utilizando un bucle.
Muestra la lista final formateada como un String.
 */

public class E03 {

    public static void main(String[] args) {

        int[] notasArray = {4, 9, 7, 5, 10};
        List<Integer> notas = new ArrayList<>();
        for (int i = 0; i < notasArray.length; i++) {
            notas.add(notasArray[i]);
        }
        System.out.println(notas);

    }

}
