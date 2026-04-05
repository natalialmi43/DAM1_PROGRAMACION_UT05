package ejerciciosGemini.mix.GestionEnvios;

class EnvioExpress extends Envio {
    private boolean requiereFirma;

    public EnvioExpress(int idEnvio, String cliente, String ciudadDestino, boolean requiereFirma) {
        super(idEnvio, cliente, ciudadDestino);
        this.requiereFirma = requiereFirma;
    }

    public boolean isRequiereFirma() {
        return requiereFirma;
    }
}