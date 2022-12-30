public class AutenticacionUtil {
    private String clave="alura";

    public boolean iniciarSesion(String clave) {
        if (this.clave == clave) {
            System.out.println("correcto");
            return true;
        } else {
            System.out.println("Incorrecto");
            return false;
        }
    }
}
