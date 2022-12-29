public class TestControlBonificacion {

    public static void main(String[] args) {
        Funcionario f = new  Contador();
        f.setSalario(100);
        Gerente g = new Gerente();
        g.setSalario(200);
        Contador c = new Contador();
        c.setSalario(5000);
        ControlBonioficacioon control = new ControlBonioficacioon();
        control.registratSalario(f);
        control.registratSalario(g);
        control.registratSalario(c);
        System.out.println("suma"+control.getSuma());
    }
}
