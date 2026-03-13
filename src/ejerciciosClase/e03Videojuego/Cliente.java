package ejerciciosClase.e03Videojuego;

import java.util.Random;

public class Cliente {
    private static final Random random = new Random();

    private int numeroCarnet;
    private String nombre;

    public Cliente(String nombre) {
        this(random.nextInt(), nombre);
    }

    public Cliente(int numeroCarnet, String nombre) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCarnet=" + numeroCarnet +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
