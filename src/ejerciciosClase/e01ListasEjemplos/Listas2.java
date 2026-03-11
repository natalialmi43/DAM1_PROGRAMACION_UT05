package ejerciciosClase.e01ListasEjemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Rafa");
        nombres.add("Pablo");
        nombres.add("Angel");
        nombres.add("Carla");

//        System.out.println(nombres);

        for (String nombre : nombres){
            System.out.println(nombre);
        }

    }
}
