package ejerciciosCasa.e06Map;

import java.util.TreeMap;

public class E04ClasificacionPorOrden {
    public static void main(String[] args) {

        TreeMap <String, String> extensionesArchivo = new TreeMap<>();

        extensionesArchivo.put(".java", "Archivo de código fuente Java");
        extensionesArchivo.put(".txt", "texto plano");
        extensionesArchivo.put("CCC", "CCC");
        extensionesArchivo.put("AAA", "AAA");

        for (String nombre : extensionesArchivo.keySet()){
            String paraGuardar = extensionesArchivo.get(nombre);
            System.out.println("La extension " + nombre + " guarda " + paraGuardar);
        }

    }
}
