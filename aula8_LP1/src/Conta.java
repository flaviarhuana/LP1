public class Conta {
    protected String titular;
    protected double salario;

    public Conta(String titular, double salario) {
        this.titular = titular;
        this.salario = salario;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void depositar(double valor) {

    }
    public void sacar(double valor){
    }




}
