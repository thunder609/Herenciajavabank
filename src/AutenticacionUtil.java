public class AutenticacionUtil {
    private String clave;

    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
}
