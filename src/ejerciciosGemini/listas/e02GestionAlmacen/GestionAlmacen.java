package ejerciciosGemini.listas.e02GestionAlmacen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GestionAlmacen {
    public static void main(String[] args) {
        // TODO 2: Crea un ArrayList de Strings para las "Categorías" del almacén.
        // Añade "Electrónica", "Hogar" y "Juguetes".

        List <String> categorias = new ArrayList<>();
        categorias.add("Electronica");
        categorias.add("Hogar");
        categorias.add("Juguetes");

        // TODO 3: Usa .set() para cambiar "Juguetes" por "Deportes".

        int indiceJuguetes = categorias.indexOf("Juguetes");
        categorias.set(indiceJuguetes, "Deportes");


        // TODO 4: Crea una LinkedList de objetos 'Producto' llamada "inventario".
        List <Producto> inventario = new LinkedList<>();

        // TODO 5: Añade al inventario un Producto("Monitor", 101)
        // y un Producto("Teclado", 102).
        inventario.add(new Producto("Monitor", 101));
        inventario.add(new Producto("Teclado", 102));

        // TODO 6: Crea un nuevo objeto: Producto buscado = new Producto("Desconocido", 101);
        // Usa inventario.contains(buscado) y muestra el resultado por consola.
        // Si el .equals() del TODO 1 está bien hecho, debería dar TRUE aunque los nombres sean distintos.
        Producto buscado = new Producto("Desconocido", 101);

        boolean existeBuscado = inventario.contains(buscado);
        System.out.println(existeBuscado);


        // TODO 7: Inserta un Producto("Ratón", 103) en la posición 1 de la LinkedList.
        inventario.add(1, new Producto("Ratón", 103));




    }
}
