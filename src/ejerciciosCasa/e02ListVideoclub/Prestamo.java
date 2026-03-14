package ejerciciosCasa.e02ListVideoclub;

import java.time.LocalDate;

public class Prestamo {

    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;


    public Prestamo(Cliente cliente, Pelicula pelicula, LocalDate fechaPrestamo) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusDays(2);
    }

    public Prestamo(Cliente cliente, Pelicula pelicula, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
