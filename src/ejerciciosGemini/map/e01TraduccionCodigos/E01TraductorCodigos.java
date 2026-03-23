package ejerciciosGemini.map.e01TraduccionCodigos;

import java.util.HashMap;
import java.util.Map;

public class E01TraductorCodigos {
    static void main() {

        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Apple", "Manzana");
        diccionario.put("Computer", "Ordenador");
        diccionario.put("Key", "Llave");

        System.out.println(diccionario);


        diccionario.put("Apple", "Pomme");
        System.out.println(diccionario);

        Boolean existe = diccionario.containsKey("Bread");

        if(!existe){
            diccionario.put("Bread", "Pan");
        } else {
            System.out.println("Sorry, ya existe");
        }
        System.out.println(diccionario);

        diccionario.remove("Key");
        System.out.println(diccionario);


    }
}
