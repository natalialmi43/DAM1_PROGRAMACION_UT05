package ejerciciosGemini.listas.e02GestionAlmacen;

import java.util.Objects;

public class Producto {

    String nombre;
    int codigo;

    Producto(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // TODO 1: Sobrescribir el método equals para que dos productos
    // sean "iguales" si tienen el mismo código.
    /*
    @Override
    public boolean equals(Object o) {
        // Tu código aquí... (Tip: Usa Alt+Insert en IntelliJ)

        return false;
    }

     */

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Producto producto)) return false;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
