package ejerciciosCasa.e02ListVideoclub;

public class Cliente {

    private int numeroCarnet;
    private String nombre;

    public Cliente(int numeroCarnet, String nombre) {
        setNumeroCarnet(numeroCarnet);
        setNombre(nombre);
    }

    public void setNumeroCarnet(int numeroCarnet) {
        if(numeroCarnet < 0){
            this.numeroCarnet = 0000000;
        } else {
            this.numeroCarnet = numeroCarnet;
        }
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNombre(String nombre) {
        if(nombre==null || nombre.isEmpty()){
            this.nombre = "defecto";
        } else {
            this.nombre = nombre;
        }
    }

    public String toString(){

        return "El cliente '" + nombre + "' con numero de carnet: "+ numeroCarnet;
    }
}
