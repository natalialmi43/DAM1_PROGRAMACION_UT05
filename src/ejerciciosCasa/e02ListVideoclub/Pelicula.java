package ejerciciosCasa.e02ListVideoclub;

public class Pelicula {

    private int codigo;
    private String titulo;

    public Pelicula(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0){
            this.codigo = 0000000;
        } else {
            this.codigo = codigo;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        if(titulo ==null || titulo.isEmpty()){
            this.titulo = "defecto";
        } else {
            this.titulo = titulo;
        }
    }


    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
