public class ContaEmpresarial extends Conta implements Pagamento {
    public ContaEmpresarial(String titular, double saldo) {
        super(titular, saldo);
    }

    public void processarPagamento(double valor, String modalidade) {
        double juros = 0.05;
        double total = valor + (valor * juros);
        if (modalidade.equalsIgnoreCase("Pix") && valor <= 5000 && total <= saldo) {
            sacar(total);
        } else if (modalidade.equalsIgnoreCase("Cartao") && valor <= 20000 && total <= saldo) {
            sacar(total);
        } else if (modalidade.equalsIgnoreCase("Boleto") && valor > 0 && total <= saldo) {
            sacar(total);
        } else {
            System.out.println("Pagamento inválido ou saldo insuficiente.");
        }
    }

    public String toString() {
        return "Conta Empresarial - " + super.toString();
    }
}
