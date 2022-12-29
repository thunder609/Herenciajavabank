public class Gerente extends Funcionario {
private String clave;
public void setClave(String clave) {
    this.clave = clave;
}
    public boolean iniciarSesion(String clave){
  return clave =="alura";
    }


    public double getBonificacion() {
        System.out.println("ejecutando desde gerente");
        return this.getSalario() + (this.getSalario() *0.2);
    }
}
