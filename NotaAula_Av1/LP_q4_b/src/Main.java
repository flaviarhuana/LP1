import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcao = -1;
        String entrada;

        Cliente clienteExemplo = new Cliente("Arthur Silva", "111.222.333-44");
        Vendedor vendedorExemplo = new Vendedor("Maria Barbosa", "V001");

        Pedido ultimoPedido = null;

        do {
            System.out.println("Sistema de Vendas");
            System.out.println("Cliente Exemplo: " + clienteExemplo.nome);
            System.out.println("Vendedor Exemplo: " + vendedorExemplo.nome);
            System.out.println("1. Registrar Novo Pedido");
            System.out.println("2. Consultar Último Pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                entrada = tcl.nextLine();
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número.");
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Número do Pedido: ");
                    String numero = tcl.nextLine();
                    System.out.print("Data do Pedido: ");
                    String data = tcl.nextLine();

                    double valorTotal = 0.0;
                    System.out.print("Valor Total do Pedido: R$");
                    try {
                        entrada = tcl.nextLine();
                        valorTotal = Double.parseDouble(entrada);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Usando 0.00 como valor.");
                        valorTotal = 0.0;
                    }

                    ultimoPedido = new Pedido(numero, data, valorTotal, clienteExemplo, vendedorExemplo);
                    System.out.println("\n--- Pedido Registrado ---");
                    System.out.println("Pedido No. " + ultimoPedido.numero + " registrado com sucesso.");
                    System.out.println("Cliente: " + ultimoPedido.cliente.nome);
                    System.out.println("Vendedor: " + ultimoPedido.vendedor.nome);
                    break;
                case 2:
                    if (ultimoPedido != null) {
                        System.out.println("\n--- Detalhes do Último Pedido ---");
                        System.out.println("Número: " + ultimoPedido.numero);
                        System.out.println("Data: " + ultimoPedido.data);
                        System.out.printf("Valor Total: R$ %.2f\n", ultimoPedido.valorTotal);
                        System.out.println("Feito por (Cliente): " + ultimoPedido.cliente.nome + " (CPF: " + ultimoPedido.cliente.cpf + ")");
                        System.out.println("Emitido por (Vendedor): " + ultimoPedido.vendedor.nome + " (Matrícula: " + ultimoPedido.vendedor.matricula + ")");
                    } else {
                        System.out.println("Nenhum pedido registrado ainda.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema de vendas.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        tcl.close();
    }
}