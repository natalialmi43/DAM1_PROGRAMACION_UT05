package ejerciciosCasa.e01List;

import java.util.ArrayList;

public class E04ConversionArrayAList {
    public static void main(String[] args) {

        // Dado el siguiente array de notas: int[] notasArray = {4, 9, 7, 5, 10};
        int[] notasArray = {4, 9, 7, 5, 10};

        // Crea un ArrayList de objetos Integer.
        ArrayList <Integer> notasList = new ArrayList<>();

        // Vuelca todos los datos del array a la lista utilizando un bucle.
        for (int i = 0; i < notasArray.length; i++) {
            notasList.add(notasArray[i]);
        }

        // Muestra la lista final formateada como un String.
        System.out.println(notasList);
    }
}
