import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria("12345-6", "Cliente Principal");
        ContaBancaria contaDestinoExemplo = new ContaBancaria("98765-4", "Destinatário");

        int opcao = -1;
        double valor;
        String entrada;

        do {
            System.out.println("Sistema Bancário - Menu");
            System.out.println("Conta: " + minhaConta.getNumeroConta() + " - Titular: " + minhaConta.getTitular());
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir (conta de Exemplo)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                entrada = tcl.nextLine();
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número inteiro.");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.printf("\nSaldo atual: R$ %.2f\n", minhaConta.consultarSaldo());
                    break;

                case 2:
                    System.out.print("Informe o valor a depositar: R$");
                    try {
                        entrada = tcl.nextLine();
                        valor = Double.parseDouble(entrada);
                        minhaConta.depositar(valor);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Por favor, digite um número (Ex: 100.00).");
                    }
                    break;

                case 3:
                    System.out.print("Informe o valor a sacar: R$");
                    try {
                        entrada = tcl.nextLine();
                        valor = Double.parseDouble(entrada);
                        minhaConta.sacar(valor);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Por favor, digite um número (Ex: 50.00).");
                    }
                    break;

                case 4:
                    System.out.print("Informe o valor a transferir para a conta Exemplo (" + contaDestinoExemplo.getTitular() + "): R$");
                    try {
                        entrada = tcl.nextLine();
                        valor = Double.parseDouble(entrada);
                        minhaConta.transferir(contaDestinoExemplo, valor);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Por favor, digite um número.");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema bancário. Obrigado!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção do menu.");
            }
        } while (opcao != 0);

        tcl.close();
    }
}