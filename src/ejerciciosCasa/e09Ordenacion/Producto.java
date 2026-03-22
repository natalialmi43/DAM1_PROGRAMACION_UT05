package ejerciciosCasa.e09Ordenacion;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private String id;
    private String modelo;
    private double precio;

    public Producto(String id, String modelo, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getId() { return id; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return String.format("[%s] %-15s | %.2f€", id, modelo, precio);
    }

    // --- TAREA DEL ALUMNO 1 ---
    // Implementar equals y hashCode basándose en el 'id'.


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Producto producto)) return false;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // --- TAREA DEL ALUMNO 2 ---
    // Implementar compareTo para que la ordenación por defecto sea por ID.


    @Override
    public int compareTo(Producto otro) {
        return this.id.compareTo(otro.id);
    }
}
