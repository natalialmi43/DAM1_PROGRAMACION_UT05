package ejerciciosCasa.e06Map;

import java.util.HashMap;
import java.util.Scanner;

public class E01DiccionarioTraduccion {

    public static void main(String[] args) {

        HashMap <String, String> diccionario = new HashMap<>();

        diccionario.put("Apple", "Manzana");
        diccionario.put("Orange", "Naranja");
        diccionario.put("Banana", "Plátano");
        diccionario.put("Pineapple", "Piña");
        diccionario.put("Grape", "Uva");


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra en inglés");
        String palabra = sc.nextLine();

        if (diccionario.containsKey(palabra)){
            String traduccion  = diccionario.get(palabra);
            System.out.println(traduccion);
        } else {
            System.out.println("Error");
        }

        System.out.println("\nIntroduce una palabra en español");
        String palabraEsp = sc.nextLine();

        if (diccionario.containsValue(palabraEsp)){
            System.out.println("Si la tenemos");
        }else {
            System.out.println("Error");
        }

        sc.close();
    }
}
