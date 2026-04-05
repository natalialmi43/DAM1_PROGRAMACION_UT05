package ejerciciosGemini.mix.GestionEnvios;

import java.util.*;

// --- CLASES DE DOMINIO (No necesitas modificarlas) ---

abstract class Envio {
    protected int idEnvio;
    protected String cliente;
    protected String ciudadDestino;

    public Envio(int idEnvio, String cliente, String ciudadDestino) {
        this.idEnvio = idEnvio;
        this.cliente = cliente;
        this.ciudadDestino = ciudadDestino;
    }

    public String getCliente() { return cliente; }
    public String getCiudadDestino() { return ciudadDestino; }
    public int getIdEnvio() { return idEnvio; }

    // Necesario para que HashSet detecte duplicados por ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envio envio = (Envio) o;
        return idEnvio == envio.idEnvio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEnvio);
    }

    @Override
    public String toString() {
        return "Envio{" + "id=" + idEnvio + ", destino='" + ciudadDestino + "'}";
    }
}