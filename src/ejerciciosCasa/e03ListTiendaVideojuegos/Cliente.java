package ejerciciosCasa.e03ListTiendaVideojuegos;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String mail;
    private int codCliente;

    public Cliente(String nombre, String apellidos, String direccion, String mail, int codCliente) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDireccion(direccion);
        setMail(mail);
        setCodCliente(codCliente);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "defecto";
        } else {
            this.nombre = nombre;
        }
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.isEmpty()){
            this.apellidos = "defecto";
        } else {
            this.apellidos = apellidos;
        }
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()){
            this.direccion = "defecto";
        } else {
            this.direccion = direccion;
        }
    }

    public void setMail(String mail) {
        if (mail == null || mail.isEmpty()){
            this.mail = "defecto";
        } else {
            this.mail = mail;
        }
    }

    public void setCodCliente(int codCliente) {
        if (codCliente < 0){
            this.codCliente = 0;
        } else {
            this.codCliente = codCliente;
        }
    }
}
