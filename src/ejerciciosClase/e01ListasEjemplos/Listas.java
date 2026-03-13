package ejerciciosClase.e01ListasEjemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List nombres = new ArrayList();
        nombres.add("Rafa");
        nombres.add("Pablo");
        nombres.add("Angel");
        nombres.add("Carla");
        nombres.add(123456);
        nombres.add(true);

//        System.out.println(nombres);

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(((String) nombres.get(i)).toUpperCase());
        }
    }
}
