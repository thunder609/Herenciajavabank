public class Gerente extends Funcionario implements  Autenticable {
    private String clave;
    private AutenticacionUtil u;

    public Gerente() {
        this.u= new AutenticacionUtil();

    }


    public double getBonificacion() {
        System.out.println("ejecutando desde gerente");
     //   return this.getSalario() + (this.getSalario() *0.2);
        return 200;
    }
    public void setClave(String clave)
    {
          this.clave = clave;
    }
    public boolean iniciarSesion(String clave)
    {
        if(this.clave==clave) {
            return true;
        }
        else{
            return false;
        }
    }
}
