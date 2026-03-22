package ejerciciosCasa.e07RepasoConjunto;

import java.util.*;

public class E04ArrayList {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList( 3, 7, 1, 9, 4));

        System.out.println("La lista:");
        for (int n : numeros){
            System.out.println(n);
        }

        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        System.out.println("La suma total es "+ suma);

        int numeroMayor = Collections.max(numeros);
        int numeroMenor = Collections.min(numeros);
        int menorPorDos = numeroMenor*2;

        System.out.println("El mayor es " + numeroMayor);
        System.out.println("El menor es " + numeroMenor);
        System.out.println("El menor  por 2 es " + menorPorDos);

    }
}
