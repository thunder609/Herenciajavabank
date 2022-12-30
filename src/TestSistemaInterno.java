public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno si = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador adminis = new Administrador();
        si.autentica(gerente);
        si.autentica(adminis);

    }
}
