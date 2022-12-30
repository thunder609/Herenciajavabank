public class Cliente implements  Autenticable {
    private String dni;
    private String Nombre;
    private String Telef;

    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();

    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelef() {
        return this.Telef;
    }

    public void setTelef(String telef) {
        this.Telef = telef;
    }

    public void setClave(String clave) {
        this.setClave(clave);
    }

    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}