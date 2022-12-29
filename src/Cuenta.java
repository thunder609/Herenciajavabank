
public  abstract  class    Cuenta {
   protected  double saldo;
    private int agencia ;
    private  int  numero;
    private static int total = 0;
    private Cliente titular= new Cliente();
    public Cuenta(int agencia, int numero){
        Cuenta.total++;
        System.out.println("Total de cuentas es " + Cuenta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        System.out.println("Estoy creando una cuenta" + this.numero);
    }
   abstract  void  depositar(double valor );

    public boolean  retirar(double valor ){
        if (this.saldo  >= valor  ) {
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    public static int getTotal(){
        return Cuenta.total;
    }
    public boolean  trasferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor) {
            this.retirar(valor);
           cuenta.depositar(valor);
            return  true;
        }
        return false;
}
    public double getsaldo(){
        return this.saldo;
    }
    public   Cuenta(int agencia){
        System.out.println("aqui e crea el objecto");
        if (agencia <=0) {

            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }

        System.out.println("Se crea Agencia");
    }
    /*public void setAgencia(int agencia){
         if (agencia >0) {
             this.agencia = agencia;
         }
         else{
             System.out.println("dato no permirtido");
         }
    }*/
    public int getAgencia(){
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {

        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}