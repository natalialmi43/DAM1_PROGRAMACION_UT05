package ejerciciosCasa.e03ListTiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private ArrayList <Videojuego> listaVideojuego;
    private LocalDate fechaVenta;

    public Venta(Cliente cliente, ArrayList<Videojuego> listaVideojuego) {
        this.cliente = cliente;
        this.listaVideojuego = listaVideojuego;
        this.fechaVenta = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Videojuego> getListaVideojuego() {
        return listaVideojuego;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
}
