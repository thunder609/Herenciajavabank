public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno si = new SistemaInterno();
        Cliente cli= new Cliente();
        Gerente gerente = new Gerente();
        Administrador adminis = new Administrador();
        System.out.println(adminis.util.iniciarSesion("alura"));
        System.out.println(cli.iniciarSesion("1234"));
        System.out.println(adminis.iniciarSesion("alura"));
    }
}
