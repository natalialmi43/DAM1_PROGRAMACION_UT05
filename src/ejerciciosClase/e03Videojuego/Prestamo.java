package ejerciciosClase.e03Videojuego;

import java.time.LocalDate;


public class Prestamo {
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Pelicula pelicula, Cliente cliente, LocalDate fechaPrestamo) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
}
