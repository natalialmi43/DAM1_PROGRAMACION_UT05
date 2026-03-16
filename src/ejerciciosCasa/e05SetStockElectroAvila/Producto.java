package ejerciciosCasa.e05SetStockElectroAvila;

import java.util.Objects;

public class Producto {

    private String id;
    private String modelo;
    private double precioBase;
    private int stock;

    public Producto(String id, String modelo, double precioBase, int stock) {
        this.id = id;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Getters y Setters básicos
    public String getId() { return id; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precio) { this.precioBase = precio; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Modelo: %-15s | Precio: %8.2f€ | Stock: %d",
                id, modelo, precioBase, stock);
    }

    // TODO: TAREA DEL ALUMNO
    // Implementar equals y hashCode basándose ÚNICAMENTE en el 'id'.
    // Recordad que sin esto, el Set no detectará duplicados.


    @Override
    public boolean equals(Object obj) {
        // Compara si variable actual y variable que entra por parametro apuntan al misma direcc son mismo objeto en memoria
        if (this == obj) {
            return true;
        }
        // Primero comparar si no existe / Segundo compara que la naturaleza de objetos (un producto y un clientes no pueden ser iguales)
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        // Se hace un downCast, para pasar de objeto a producto concreto
        Producto producto = (Producto) obj;

        //Compara si es lo mismo
        return Objects.equals(this.id,producto.id);

    }

    @Override
    public int hashCode() {
        // Genera del hash basado exclusivamente en el ID
        return Objects.hash(this.id);
    }
}