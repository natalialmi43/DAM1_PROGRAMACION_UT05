package ejerciciosCasa.e02ListVideoclub;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Videoclub v1 = new Videoclub();

        Cliente c1 = new Cliente(001, "Maria");
        Pelicula p1 = new Pelicula(999, "'Hola'");

        v1.addCliente(c1);
        v1.addPelicula(p1);

        Prestamo prestamo1 = new Prestamo(c1, p1, LocalDate.now());

        v1.addPrestamo(prestamo1);

        for (Prestamo p : v1.getPrestamos()){
            System.out.println(p);
        }

    }
}
