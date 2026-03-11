package ejerciciosClase.e04EqualsHashcodeEjemplo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Alumno {
    String dni;
    String nombre;
    String apellidos;
    String direccion;
    int edad;

    String[] asignaturasActuales;
    List<String> asignaturasAprobadas;

    int curso;
    String grado;

    public Alumno(String dni, String nombre, String apellidos, String direccion, int edad, int curso, String grado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
        this.curso = curso;
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", asignaturasActuales=" + Arrays.toString(asignaturasActuales) +
                ", asignaturasAprobadas=" + asignaturasAprobadas +
                ", curso=" + curso +
                ", grado='" + grado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(dni, alumno.dni) && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellidos, alumno.apellidos) && Objects.equals(direccion, alumno.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, direccion);
    }

}
