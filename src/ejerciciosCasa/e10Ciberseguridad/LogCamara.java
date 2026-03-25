package ejerciciosCasa.e10Ciberseguridad;

public class LogCamara extends Log {
    String resolucion;
    public LogCamara(int id, String ip, String loc, String res) {
        super(id, ip, loc);
        this.resolucion = res;
    }
}
