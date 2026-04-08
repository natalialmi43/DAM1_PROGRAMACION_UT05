package ejerciciosGemini.mix.gestorLogistica;

import java.util.Objects;

abstract class Paquete {
    protected int id;
    protected String destino;
    protected String estado;

    public Paquete(int id, String destino, String estado) {
        this.id = id;
        this.destino = destino;
        this.estado = estado;
    }

    public int getId() { return id; }
    public String getDestino() { return destino; }
    public String getEstado() { return estado; }

    // CRÍTICO para la Tarea 1: Un paquete es igual a otro si tienen el mismo ID.


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Paquete paquete)) return false;
        return id == paquete.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PKG-" + id;
    }
}