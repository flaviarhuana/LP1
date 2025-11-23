class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Novo saldo: R$ %.2f\n", valor, saldo);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.printf("Transferência de R$ %.2f para %s (%s) realizada com sucesso.\n", valor, destino.getTitular(), destino.getNumeroConta());
            System.out.printf("Seu novo saldo: R$ %.2f\n", saldo);
        } else if (valor > saldo) {
            System.out.println("Transferência não realizada: Saldo insuficiente.");
        } else {
            System.out.println("Transferência não realizada: O valor deve ser positivo.");
        }
    }
}