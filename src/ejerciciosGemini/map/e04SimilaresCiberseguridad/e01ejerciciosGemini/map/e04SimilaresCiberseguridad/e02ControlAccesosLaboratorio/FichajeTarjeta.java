package ejerciciosGemini.map.e04SimilaresCiberseguridad.e01ejerciciosGemini.map.e04SimilaresCiberseguridad.e02ControlAccesosLaboratorio;

public class FichajeTarjeta extends Fichaje {

    boolean tarjetaCaducada;

    public FichajeTarjeta(int idFichaje, String empleado, String departamento, boolean tarjetaCaducada) {
        // Llamada al constructor de la clase padre
        super(idFichaje, empleado, departamento);
        this.tarjetaCaducada = tarjetaCaducada;
    }

    @Override
    public String toString() {
        return "Tarjeta{id=" + idFichaje + ", emp='" + empleado + "'}";
    }

}
