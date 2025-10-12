import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcao = -1;
        String entrada;

        Medico medicoAtual = null;

        do {
            System.out.println("Sistema de Cadastro Hospitalar");
            System.out.println("1. Cadastrar Clínico Geral");
            System.out.println("2. Cadastrar Cirurgião");
            System.out.println("3. Executar Ações do Médico Cadastrado");
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
                    System.out.print("Nome do Clínico Geral: ");
                    String nomeCG = tcl.nextLine();
                    System.out.print("CRM do Clínico Geral: ");
                    String crmCG = tcl.nextLine();
                    System.out.print("Atende em casa (Sim/Nao): ");
                    String atendeEmCasa = tcl.nextLine();

                    medicoAtual = new ClinicoGeral(nomeCG, crmCG, atendeEmCasa);
                    System.out.println("Clínico Geral " + nomeCG + " cadastrado com sucesso.");
                    break;
                case 2:
                    System.out.print("Nome do Cirurgião: ");
                    String nomeC = tcl.nextLine();
                    System.out.print("CRM do Cirurgião: ");
                    String crmC = tcl.nextLine();

                    medicoAtual = new Cirurgiao(nomeC, crmC);
                    System.out.println("Cirurgião " + nomeC + " cadastrado com sucesso.");
                    break;
                case 3:
                    if (medicoAtual == null) {
                        System.out.println("Nenhum médico cadastrado. Escolha a opção 1 ou 2 primeiro.");
                        break;
                    }
                    System.out.println("\n--- Ações de " + medicoAtual.nome + " ---");

                    medicoAtual.tratarPaciente();

                    if (medicoAtual instanceof ClinicoGeral) {
                        ((ClinicoGeral) medicoAtual).receitar();
                        System.out.println("Atende em casa: " + ((ClinicoGeral) medicoAtual).atendeEmCasa);
                    } else if (medicoAtual instanceof Cirurgiao) {
                        ((Cirurgiao) medicoAtual).fazerIncisao();
                    }

                    System.out.println("Trabalha no hospital: " + medicoAtual.trabalhaNoHospital);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        tcl.close();
    }
}