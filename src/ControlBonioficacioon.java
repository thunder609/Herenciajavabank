public class ControlBonioficacioon {
    private double suma;
   public double registratSalario(Funcionario fun){
       this.suma=this.suma + fun.getBonificacion();
       System.out.printf("suma"+this.suma);
       return this.suma;

   }

    public double getSuma() {
        return suma;
    }
}
