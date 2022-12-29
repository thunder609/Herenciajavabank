public class Cliente {
    private String dni;
    private String Nombre;
    private String         Telef;

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
}