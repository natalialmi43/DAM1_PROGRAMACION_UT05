package ejerciciosClase.e03Videojuego;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {
    List<Cliente> clientes;
    List<Pelicula> peliculas;
    List<Prestamo> prestamos;

    public Videoclub() {
        // TODO
    }

    public void añadirCliente(Cliente cliente) {
        // TODO
    }

    public void añadirPelicula(Pelicula pelicula) {
        // TODO
    }

    public void añadirPrestamo(Prestamo prestamo) {
        // TODO
    }

    public Pelicula buscarPelicula(int codigo) {
        // TODO
        return null;
    }

    public Cliente buscarCliente(int numeroCarnet) {
        // TODO
        return null;
    }

    public List<Prestamo> getPrestamos() {
        // TODO
        return null;
    }

    public List<Prestamo> getPrestamos(int numeroCarnet) {
        // TODO
        return null;
    }

    public boolean devolucion(int codigoPelicula, int numeroCarnet) {
        // TODO
        // Cambia el préstamo para que la película esté devuelta
        return false;
    }

    public List<Cliente> prestamosMorosos() {
        List<Cliente> clientesMorosos = new ArrayList<>();
        // TODO
        // Recorre toda la lista y devuelve los clientes con préstamos no devueltos
        // y que haya pasado la fecha de devolución (2 días sobre fecha préstamo)
        return clientesMorosos;
    }
}
