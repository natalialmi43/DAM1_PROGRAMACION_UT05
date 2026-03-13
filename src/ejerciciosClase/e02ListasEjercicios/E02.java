package ejerciciosClase.e02ListasEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    /*
    Crea una lista de números enteros (Integer).
    Rellena la lista con 10 números aleatorios entre 1 y 50.
    Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.
    Muestra el número mayor encontrado en la lista.
     */
    public class E02 {
        public static void main(String[] args) {

            final int CUANTOS = 10;
            final int LIMITE = 50;

            List<Integer> numeros = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < CUANTOS; i++) {
                numeros.add(r.nextInt(LIMITE + 1));
            }
            System.out.println(numeros);

            int suma = 0;
            int mayor = 0;
            for (int i = 0; i < numeros.size(); i++) {
                int actual = numeros.get(i);
                suma += actual;
                if (actual > mayor)
                    mayor = actual;
            }
            System.out.println("La suma es: " + suma);
            System.out.println("El mayor es: " + mayor);

        }
    }

