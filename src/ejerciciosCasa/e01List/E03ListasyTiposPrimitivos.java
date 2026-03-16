package ejerciciosCasa.e01List;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class E03ListasyTiposPrimitivos {

    public static void main(String[] args) {

        // Crea una lista de números enteros (Integer).
        ArrayList <Integer> numeros = new ArrayList<>(10);

        // Rellena la lista con 10 números aleatorios entre 1 y 50.
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(50)+1;
            numeros.add(i,numeroAleatorio);
            System.out.print(numeroAleatorio + ", ");
        }

        // Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        System.out.println("\nEl total es " + suma);

        // Muestra el número mayor encontrado en la lista.

        int numeroMasGrande = Collections.max(numeros);
        System.out.println("El numero más grande es " + numeroMasGrande);

        /*
        MANUAL:
        int numeroMayor = numeros.get(0);

        for (int n : numeros){
            if (numeroMayor < n){
                numeroMayor = n;
        }
        sout ("El numero más grande es " + numeroMayor);
         */

    }

}
