package ejerciciosGemini.mix.gestorLogistica;

class PaqueteRefrigerado extends Paquete {
    private double temperatura;

    public PaqueteRefrigerado(int id, String destino, String estado, double temperatura) {
        super(id, destino, estado);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "PKG-REF-" + id;
    }
}

