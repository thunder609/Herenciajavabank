public class testGerente {
    public static void main(String[] args) {
        Gerente gerente= new Gerente();
        gerente.setSalario(1000);
        gerente.setClave("alura");
        System.out.println( gerente.iniciarSesion("alura"));
        System.out.println(gerente.getBonificacion());




    }
}
