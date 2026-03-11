package ejerciciosClase.e03Videojuego;

public class Pelicula {

    private int codigo;
    private String titulo;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public Pelicula(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
