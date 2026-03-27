package ejerciciosGemini.map.e04SimilaresCiberseguridad.e01ejerciciosGemini.map.e04SimilaresCiberseguridad.e02ControlAccesosLaboratorio;

public class FichajeBiometrico extends Fichaje {
    String tipoHuella;

    public FichajeBiometrico(int idFichaje, String empleado, String departamento, String tipoHuella) {
        // Llamada al constructor de la clase padre
        super(idFichaje, empleado, departamento);
        this.tipoHuella = tipoHuella;
    }

    @Override
    public String toString() {
        return "Biometrico{id=" + idFichaje + ", emp='" + empleado + "'}";
    }
}
