public class SistemaInterno {
    private String clave="alura";
    public boolean autentica(Gerente gerente){
        boolean puedeIniciarSesion=gerente.iniciarSesion(clave);

           if (puedeIniciarSesion) {
               System.out.println("inicio exitos");
               return true;
           }
               else{
                   System.out.println("error al iniciar sesion");
                   return false;
               }

    }
    public boolean autentica(Autenticable administrador){
        boolean puedeIniciarSesion= administrador.iniciarSesion(clave);

        if (puedeIniciarSesion) {
            System.out.println("inicio exitos");
            return true;
        }
        else{
            System.out.println("error al iniciar sesion");
            return false;
        }

    }
}
