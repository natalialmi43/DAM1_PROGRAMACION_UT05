package ejerciciosGemini.map.e04SimilaresCiberseguridad.e01ejerciciosGemini.map.e04SimilaresCiberseguridad.e02ControlAccesosLaboratorio;

import java.util.Objects;

public class Fichaje {

    int idFichaje;
    String empleado;
    String departamento;

    public Fichaje(int idFichaje, String empleado, String departamento) {
        this.idFichaje = idFichaje;
        this.empleado = empleado;
        this.departamento = departamento;
    }

    // El equals y hashCode solo evalúan el idFichaje para controlar duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fichaje fichaje = (Fichaje) o;
        return idFichaje == fichaje.idFichaje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFichaje);
    }

    // Opcional, pero útil para que los System.out.println del main sean legibles
    @Override
    public String toString() {
        return "Fichaje{id=" + idFichaje + ", emp='" + empleado + "'}";
    }
}
