package ejerciciosGemini.mix.GestionEnvios;

class EnvioEstandar extends Envio {
    private double pesoKg;

    public EnvioEstandar(int idEnvio, String cliente, String ciudadDestino, double pesoKg) {
        super(idEnvio, cliente, ciudadDestino);
        this.pesoKg = pesoKg;
    }
}