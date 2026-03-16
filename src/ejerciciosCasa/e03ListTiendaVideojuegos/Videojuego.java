package ejerciciosCasa.e03ListTiendaVideojuegos;

import java.util.UUID;

public class Videojuego {

    private String titulo;
    private String plataforma;
    private String genero;
    private double precio;
    private int stock;
    private UUID codId;


    public Videojuego(String titulo, String plataforma, String genero, double precio, int stock) {
        setTitulo(titulo);
        setPlataforma(plataforma);
        setGenero(genero);
        setPrecio(precio);
        setStock(stock);
        this.codId = UUID.randomUUID();
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()){
            this.titulo = "defecto";
        } else {
            this.titulo = titulo;
        }
    }

    public void setPlataforma(String plataforma) {
        if (plataforma == null || plataforma.isEmpty()){
            this.plataforma = "defecto";
        } else {
            this.plataforma = plataforma;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()){
            this.genero = "defecto";
        } else {
            this.genero = genero;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            this.precio = 20;
        } else {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock < 0 ){
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public UUID getCodId() {
        return codId;
    }

    public String toString(){
        return "El video juego '" + titulo + "' de la plataforma " + plataforma + " de genero " + genero + " que cuesta "
                + precio + " quedan " + stock + " en stock, su UUID es " + codId;
    }

}
