import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = criarConta(sc, 1);
        Conta conta2 = criarConta(sc, 2);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Transferir entre contas");
            System.out.println("2 - Realizar pagamento");
            System.out.println("3 - Exibir saldos");
            System.out.println("4 - Depositar em uma conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da transferência de " + conta1.getTitular() + " para " + conta2.getTitular() + ": ");
                    double valorTransferencia = sc.nextDouble();
                    if (conta1.getSaldo() >= valorTransferencia) {
                        conta1.sacar(valorTransferencia);
                        conta2.depositar(valorTransferencia);
                        System.out.println("Transferência concluída.");
                    } else {
                        System.out.println("Saldo insuficiente para transferência.");
                    }
                    break;

                case 2:
                    if (conta1 instanceof Pagamento) {
                        System.out.print("Escolha a modalidade (Pix / Cartao / Boleto): ");
                        String modalidade = sc.nextLine();
                        System.out.print("Digite o valor do pagamento: ");
                        double valorPagamento = sc.nextDouble();
                        ((Pagamento) conta1).processarPagamento(valorPagamento, modalidade);
                    } else {
                        System.out.println("A conta 1 não possui função de pagamento.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Situação Atual ---");
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;

                case 4:
                    System.out.print("Escolha a conta (1 ou 2): ");
                    int contaEscolhida = sc.nextInt();
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = sc.nextDouble();
                    if (contaEscolhida == 1) conta1.depositar(valorDeposito);
                    else if (contaEscolhida == 2) conta2.depositar(valorDeposito);
                    else System.out.println("Conta inválida.");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
    public static Conta criarConta(Scanner sc, int numero) {
        System.out.println("\n--- Cadastro da Conta " + numero + " ---");
        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Escolha o tipo de conta: ");
        System.out.println("1 - Corrente");
        System.out.println("2 - Empresarial");
        System.out.println("3 - Poupança");
        int tipo = sc.nextInt();
        sc.nextLine();

        switch (tipo) {
            case 1:
                return new ContaCorrente(titular, saldo);
            case 2:
                return new ContaEmpresarial(titular, saldo);
            case 3:
                return new ContaPoupanca(titular, saldo);
            default:
                System.out.println("Tipo inválido. Conta Corrente atribuída por padrão.");
                return new ContaCorrente(titular, saldo);
        }
    }
}
