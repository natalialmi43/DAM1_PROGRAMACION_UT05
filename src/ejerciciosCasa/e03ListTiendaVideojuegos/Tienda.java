package ejerciciosCasa.e03ListTiendaVideojuegos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Tienda {

    private ArrayList <Cliente> listadoClientes;
    private ArrayList <Videojuego> listadoVideojuegos;
    private ArrayList <Venta> listadoVentas;

    public Tienda(ArrayList<Cliente> listadoClientes, ArrayList<Videojuego> listadoVideojuegos, ArrayList<Venta> listadoVentas) {
        this.listadoClientes = new ArrayList<>();
        this.listadoVideojuegos = new ArrayList<>();
        this.listadoVentas = new ArrayList<>();
    }


    // Añadir videojuego al inventario.
    public void addVideoJuego (Videojuego videojuego){
        listadoVideojuegos.add(videojuego);
    }

    // Mostrar todo el inventario.
    public ArrayList <Videojuego> getListadoVideojuegos(){
        return listadoVideojuegos;
    }

    // Consultar un título. Podremos buscar por el código identificativo o el nombre del título.
    // se tiene que hacer por separado, no se puede usar ||, en la condicion, mejor sobrecargar
    // devuelve videojuego no un String porque buscamos por titulo, que valor tiene devolver el titulo?
    public Videojuego consultarTitulo (UUID codId){

        for (Videojuego v : listadoVideojuegos){
            if (v.getCodId() == codId){
                return v;
            }
        }

        return null;
    }

    public Videojuego consultarTitulo (String titulo){

        for (Videojuego v : listadoVideojuegos){
            if (v.getTitulo().equalsIgnoreCase(titulo)){
                return v;
            }
        }

        return null;
    }

    // Consultar stock de un título.
    public int consultaStock (String titulo){

        for (Videojuego v : listadoVideojuegos){
            if (v.getTitulo().equalsIgnoreCase(titulo)){
                return v.getStock();
            }
        }
        return 0;
    }

    // Buscar cliente. Tanto por código como por nombre, apellidos o email.
    public Cliente buscarCliente (int codCliente){

        for(Cliente c : listadoClientes){
            if (c.getCodCliente() == codCliente){
                return c;
            }
        }
        return null;
    }

    public Cliente buscarCliente (String cadenaTexto){

        for(Cliente c : listadoClientes){
            if (c.getNombre().equalsIgnoreCase(cadenaTexto) || c.getApellidos().equalsIgnoreCase(cadenaTexto) || c.getMail().equalsIgnoreCase(cadenaTexto)){
                return c;
            }
        }
        return null;
    }

    // Registrar venta. No olvides actualizar el stock.
    public void addVenta(Venta venta){

        listadoVentas.add(venta);

        // Importante hacerlo desde el que entra por parametro, se recorre solo los articulos de esta venta
        for (Videojuego v : venta.getListaVideojuego()){
            // Se modifica desde set
            v.setStock(v.getStock()-1);
        }
    }

    // Mostrar el historial de ventas completo.
    public void mostrarHistorial (){
        for (Venta v : listadoVentas){
            System.out.println(v);
        }
   }

    // Mostrar el historial de ventas de una fecha.
    public void mostrarHistorial (LocalDate fecha){

        for (Venta v : listadoVentas){
            if (fecha.equals(v.getFechaVenta())){
                System.out.println(v);
            }
        }
    }

    // Listar el acumulado de ventas por plataforma.
    public HashMap <String, Integer> ventasPorPlataforma (){

        HashMap <String, Integer> conteo = new HashMap<>();

        for (Venta v : listadoVentas){
            for (Videojuego videojuego : v.getListaVideojuego()){
                // 4. Extraemos el dato a evaluar y actualizamos su contador en el mapa
                String plataforma = videojuego.getPlataforma();
                conteo.put(plataforma, conteo.getOrDefault(plataforma, 0) + 1);
            }
        }

        return conteo;
    }

    // Listar el acumulado de ventas por género.
    public HashMap <String, Integer> ventasPorGenero(){

        HashMap <String, Integer> conteo = new HashMap<>();

        for (Venta v : listadoVentas){
            for (Videojuego videojuego : v.getListaVideojuego()){
                String genero = videojuego.getGenero();
                conteo.put(genero, conteo.getOrDefault(genero,0)+1);
            }
        }
        return conteo;
    }


    // Mostrar el título más vendido.
    public Videojuego tituloMasVendido(){

        if (listadoVentas.isEmpty()){
            return null;
        }

        //Se mapea
        HashMap <Videojuego, Integer> conteo = new HashMap<>();
        for (Venta venta : listadoVentas){
            for (Videojuego videojuego : listadoVideojuegos){
                conteo.put(videojuego,conteo.getOrDefault(videojuego, 0)+1);
            }
        }

        //Se busca el valor maximo
        Videojuego elMasVendido = null;
        int maxVentas = -1;

        for (Videojuego videojuego :listadoVideojuegos){
            int ventas = conteo.get(videojuego);
            if (maxVentas > ventas){
                maxVentas = ventas;
                elMasVendido = videojuego;
            }
        }

        return elMasVendido;

    }


    // Mostrar el mejor día de ventas.
    public LocalDate mejorDíaDeVentas(){

        if (listadoVentas.isEmpty()){
            return null;
        }

        // Mapeo
        HashMap <LocalDate, Integer>  conteo = new HashMap<>();

        for (Venta venta : listadoVentas) {
            LocalDate fecha = venta.getFechaVenta();
            conteo.put(fecha, conteo.getOrDefault(fecha, 0) + 1);
        }

        //Se busca el valor maximo
        LocalDate mejorDia = null;
        int maximoVentas = -1;

        for (LocalDate dia : conteo.keySet()) {
            int ventasActuales = conteo.get(dia);

            if (ventasActuales > maximoVentas) {
                maximoVentas = ventasActuales;
                mejorDia = dia;
            }
        }

        return mejorDia;
    }

}
