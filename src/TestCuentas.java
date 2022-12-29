public class TestCuentas {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente(1,56);
        CuentaAhorro ch= new CuentaAhorro(1,45);
        c.depositar(100);
        c.trasferir(50,ch);
        System.out.println("tu saldo ahorro"+ch.getsaldo());
        System.out.println("tu saldo corriente"+c.getsaldo());
        ch.trasferir(20,c);
        System.out.println("tu saldo ahorro"+ch.getsaldo());
        System.out.println("tu saldo corriente"+c.getsaldo());


    }
}
