public class Administrador extends Funcionario implements Autenticable{
   AutenticacionUtil util;

   public Administrador(){
       this.util= new AutenticacionUtil();
   }

    public double getBonificacion() {
        return this.getSalario();
    }
    public void setClave(String clave)
    {
        this.setClave(clave);
        }
    public boolean iniciarSesion(String clave) {
        return   this.util.iniciarSesion(clave);
    }
}
