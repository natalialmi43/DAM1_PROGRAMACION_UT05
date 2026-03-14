package ejerciciosCasa.e02ListVideoclub;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {

    private ArrayList <Cliente> listadoClientes;
    private ArrayList <Pelicula> listadoPeliculas;
    private ArrayList <Prestamo> listadoPrestamos;


    public Videoclub() {
        this.listadoClientes = new ArrayList<>();
        this.listadoPeliculas = new ArrayList<>();
        this.listadoPrestamos = new ArrayList<>();
    }




    // añadirCliente(Cliente): void
    public void addCliente(Cliente nuevoCliente){
        this.listadoClientes.add(nuevoCliente);
    }

    // añadirPelicula(Película): void
    public void addPelicula(Pelicula nuevaPelicula){
        this.listadoPeliculas.add(nuevaPelicula);
    }

    // añadirPrestamo(Prestamo): void
    public void addPrestamo (Prestamo nuevoPrestamo){
        this.listadoPrestamos.add(nuevoPrestamo);
    }

    // buscarPelícula(codigo): Pelicula
    public Pelicula buscarPelicula(int codigoBuscado){
        for (Pelicula p : listadoPeliculas){
            if (p.getCodigo() == codigoBuscado){
                return p;
            }
        }

        return null;
    }

    // buscarCliente(numeroCarnet): Cliente
    public Cliente buscarCliente (int numeroCarnet){

        for (Cliente c : listadoClientes){
            if (c.getNumeroCarnet() == numeroCarnet){
                return c;
            }
        }

        return null;
    }

    // getPrestamos(): ArrayList
    public ArrayList<Prestamo> getPrestamos(){

        return listadoPrestamos;
    }

    // getPrestamos(numeroCarnet): ArrayList
    public ArrayList<Prestamo> getPrestamos(int numeroCarnet){

        ArrayList <Prestamo> prestamosComprobados = new ArrayList<>();

        for (Prestamo p : listadoPrestamos){
            if (p.getCliente().getNumeroCarnet() == numeroCarnet){
                prestamosComprobados.add(p);
            }
        }

        return prestamosComprobados;
    }

    // devolucion(codigoPelicula, numeroCarnet): boolean
    public boolean devolucion(int codigoPelicula, int numeroCarnet){

        for (Prestamo p : listadoPrestamos){
            if (p.getPelicula().getCodigo() == codigoPelicula && p.getCliente().getNumeroCarnet()==numeroCarnet){
                listadoPrestamos.remove(p);
                return true;
            }
        }

        return false;
    }

    // prestamosMorosos(): ArrayList
    public ArrayList prestamosMorosos(){

        ArrayList <Prestamo> prestamosAux = new ArrayList<>();

        for (Prestamo p : listadoPrestamos){
            if (p.getFechaDevolucion().isBefore(LocalDate.now())){
                prestamosAux.add(p);
            }
        }

        return prestamosAux;
    }

}
