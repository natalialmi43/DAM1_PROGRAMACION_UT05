package ejerciciosCasa.e03ListTiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private ArrayList <Videojuego> videojuego;
    private LocalDate fechaVenta;

    public Venta(Cliente cliente, ArrayList<Videojuego> videojuego) {
        this.cliente = cliente;
        this.videojuego = videojuego;
        this.fechaVenta = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Videojuego> getVideojuego() {
        return videojuego;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
}
