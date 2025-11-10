public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public String toString() {
        return "Conta Poupança - " + super.toString();
    }
}
